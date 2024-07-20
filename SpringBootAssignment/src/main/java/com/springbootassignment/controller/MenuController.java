package com.springbootassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootassignment.entity.JsonModel;
import com.springbootassignment.service.MenuService;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/manipulate")
    public JsonModel manipulateMenu(@RequestParam String input) {
        return menuService.manipulateJson(input);
    }
}
