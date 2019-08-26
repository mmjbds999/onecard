package com.onecard.system.supermarket.controller;

import com.huaying.framework.annotation.AComment;
import com.huaying.framework.response.BaseResponse;
import com.onecard.system.supermarket.entity.Supplier;
import com.onecard.system.supermarket.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @PostMapping("/list")
    @AComment(comment = "供应商-列表查询")
    public BaseResponse list(String name, Integer pageNo, Integer pageSize) {
        return supplierService.list(name,pageNo-1, pageSize);
    }

    @PostMapping("/save")
    @AComment(comment = "供应商-保存")
    public BaseResponse save(Supplier supplier, Integer userId){
        return supplierService.save(supplier,userId);
    }

    @GetMapping("/delete")
    @AComment(comment = "供应商-删除")
    public BaseResponse delete(Integer id){
        return supplierService.delete(id);
    }

    @GetMapping("/get")
    @AComment(comment = "供应商-根据ID查询")
    public BaseResponse get(Integer id){
        return supplierService.query(id);
    }

}