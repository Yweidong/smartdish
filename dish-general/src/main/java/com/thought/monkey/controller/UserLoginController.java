package com.thought.monkey.controller;

import com.thought.monkey.domain.DishUser;
import com.thought.monkey.repository.DishUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: smartdish
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2021-02-25 14:55
 **/
@RestController
@RequestMapping("/api/v1")
public class UserLoginController {

    @Autowired
    DishUserRepository dishUserRepository;

    @GetMapping("/list")
    public List<DishUser> getUserList() {
        System.out.println(111);
        return dishUserRepository.findAll();
    }
}
