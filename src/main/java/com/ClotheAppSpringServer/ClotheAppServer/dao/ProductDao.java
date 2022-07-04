package com.ClotheAppSpringServer.ClotheAppServer.dao;

import com.ClotheAppSpringServer.ClotheAppServer.model.ProductData;
import com.ClotheAppSpringServer.ClotheAppServer.model.UserData;
import com.ClotheAppSpringServer.ClotheAppServer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDao {

    @Autowired
    private ProductRepository productRepository;

    public ProductData save(ProductData productData){
        return productRepository.save(productData);
    }

    public List<ProductData> getAllUserData(){
        List<ProductData> productDataList = new ArrayList<>();
        Streamable.of(productRepository.findAll())
                .forEach(productDataList::add);

        return productDataList;
    }
}
