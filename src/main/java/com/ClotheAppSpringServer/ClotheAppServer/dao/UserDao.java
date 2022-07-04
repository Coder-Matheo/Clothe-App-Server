package com.ClotheAppSpringServer.ClotheAppServer.dao;

import com.ClotheAppSpringServer.ClotheAppServer.model.UserData;
import com.ClotheAppSpringServer.ClotheAppServer.repository.ProductRepository;
import com.ClotheAppSpringServer.ClotheAppServer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDao {
    @Autowired
    private UserRepository userRepository;

    public UserData save(UserData userData){
        return userRepository.save(userData);
    }

    public List<UserData> getAllUserData(){
        List<UserData> userDataList = new ArrayList<>();
        Streamable.of(userRepository.findAll())
                .forEach(userDataList::add);

        return userDataList;
    }


}
