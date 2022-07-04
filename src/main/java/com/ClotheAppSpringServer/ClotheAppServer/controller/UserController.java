package com.ClotheAppSpringServer.ClotheAppServer.controller;

import com.ClotheAppSpringServer.ClotheAppServer.dao.ProductDao;
import com.ClotheAppSpringServer.ClotheAppServer.dao.UserDao;
import com.ClotheAppSpringServer.ClotheAppServer.model.ProductData;
import com.ClotheAppSpringServer.ClotheAppServer.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private ProductDao productDao;

    @GetMapping("/user/get-all")
    public List<UserData> getAllUserData(){
        return userDao.getAllUserData();
    }

    @PostMapping("/user/save")
    public UserData save(@RequestBody UserData userDao){
        return this.userDao.save(userDao);
    }

    @GetMapping("/product/get-all")
    public List<ProductData> getAllProductData(){
        return productDao.getAllUserData();
    }

    @PostMapping("/product/save")
    public ProductData save(@RequestBody ProductData productData){
        return productDao.save(productData);
    }

}
