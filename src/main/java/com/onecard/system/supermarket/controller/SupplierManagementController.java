package com.onecard.system.supermarket.controller;

import com.alibaba.fastjson.JSONArray;
import com.huaying.framework.annotation.AComment;
import com.huaying.framework.response.BaseJsonResponse;
import com.huaying.framework.response.BaseResponse;
import com.onecard.system.supermarket.entity.Goods;
import com.onecard.system.supermarket.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/supplierManagement")
public class SupplierManagementController {

    /*@Autowired
    SupplierManagementService supplierManagementService;

    @PostMapping("/list")
    @AComment(comment = "商品-列表查询")
    public BaseResponse list(String name, String code, Integer goodsTypeId, Integer pageNo, Integer pageSize) {
        return supplierManagementService.list(name, code, goodsTypeId, pageNo-1, pageSize);
    }

    @PostMapping("/save")
    @AComment(comment = "商品-保存")
    public BaseResponse save(Goods goods, Integer goodsTypeId, Integer merchantUserId){
        return supplierManagementService.save(goods,goodsTypeId,merchantUserId);
    }

    @GetMapping("/delete")
    @AComment(comment = "商品-删除")
    public BaseResponse delete(Integer id){
        return supplierManagementService.delete(id);
    }

    @GetMapping("/get")
    @AComment(comment = "商品-根据ID查询")
    public BaseResponse get(Integer id){
        return supplierManagementService.get(id);
    }

    @GetMapping("/queryByCode")
    @AComment(comment = "商品-根据商品编码查询")
    public BaseResponse queryByCode(String code){
        return supplierManagementService.queryByCode(code);
    }

    @GetMapping("/getStock")
    @AComment(comment = "商品-库存查询")
    public BaseResponse getStock(String name, String code, Integer pageNo, Integer pageSize){
        return supplierManagementService.getStock(name, code, new PageRequest(pageNo-1, pageSize));
    }*/

    @RequestMapping(value="/addPage")
    public String addPage(Model model) throws Exception{
        return "supermarket/supplierManagement/add";
    }
}