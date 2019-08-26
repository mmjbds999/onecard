package com.onecard.system.supermarket.controller;

import com.huaying.framework.annotation.AComment;
import com.huaying.framework.response.BaseResponse;
import com.onecard.system.supermarket.entity.Goods;
import com.onecard.system.supermarket.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @PostMapping("/list")
    @AComment(comment = "商品-列表查询")
    public BaseResponse list(String name, String code, Integer goodsTypeId, Integer pageNo, Integer pageSize) {
        return goodsService.list(name, code, goodsTypeId, pageNo-1, pageSize);
    }

    @PostMapping("/save")
    @AComment(comment = "商品-保存")
    public BaseResponse save(Goods goods, Integer goodsTypeId, Integer merchantUserId){
        return goodsService.save(goods,goodsTypeId,merchantUserId);
    }

    @GetMapping("/delete")
    @AComment(comment = "商品-删除")
    public BaseResponse delete(Integer id){
        return goodsService.delete(id);
    }

    @GetMapping("/get")
    @AComment(comment = "商品-根据ID查询")
    public BaseResponse get(Integer id){
        return goodsService.get(id);
    }

    @GetMapping("/queryByCode")
    @AComment(comment = "商品-根据商品编码查询")
    public BaseResponse queryByCode(String code){
        return goodsService.queryByCode(code);
    }

    @GetMapping("/getStock")
    @AComment(comment = "商品-库存查询")
    public BaseResponse getStock(String name, String code, Integer pageNo, Integer pageSize){
        return goodsService.getStock(name, code, new PageRequest(pageNo-1, pageSize));
    }

}