package com.onecard.system.suppermarket.controller;

import com.huaying.framework.annotation.AComment;
import com.huaying.framework.response.BaseResponse;
import com.onecard.system.suppermarket.entity.Goods;
import com.onecard.system.suppermarket.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @PostMapping("/list")
    @PreAuthorize("hasAuthority('retail')")
    @AComment(comment = "商品-列表查询")
    public BaseResponse list(String name, String code, Integer goodsTypeId, Integer pageNo, Integer pageSize) {
        return goodsService.list(name, code, goodsTypeId, pageNo-1, pageSize);
    }

    @PostMapping("/save")
    @PreAuthorize("hasAuthority('retail')")
    @AComment(comment = "商品-保存")
    public BaseResponse save(Goods goods, Integer goodsTypeId, Integer merchantUserId){
        return goodsService.save(goods,goodsTypeId,merchantUserId);
    }

    @GetMapping("/delete")
    @PreAuthorize("hasAuthority('retail')")
    @AComment(comment = "商品-删除")
    public BaseResponse delete(Integer id){
        return goodsService.delete(id);
    }

    @GetMapping("/get")
    @PreAuthorize("hasAuthority('retail')")
    @AComment(comment = "商品-根据ID查询")
    public BaseResponse get(Integer id){
        return goodsService.get(id);
    }

    @GetMapping("/queryByCode")
    @PreAuthorize("hasAuthority('retail')")
    @AComment(comment = "商品-根据商品编码查询")
    public BaseResponse queryByCode(String code){
        return goodsService.queryByCode(code);
    }

    @GetMapping("/getStock")
    @PreAuthorize("hasAuthority('retail')")
    @AComment(comment = "商品-库存查询")
    public BaseResponse getStock(String name, String code, Integer pageNo, Integer pageSize){
        return goodsService.getStock(name, code, new PageRequest(pageNo-1, pageSize));
    }

}