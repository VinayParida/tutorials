package com.example.configclient.controller;

import com.example.configclient.configuration.CommonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CommonController {

    @Autowired
    private CommonConfiguration commonConfiguration;

    @GetMapping("/commonConfig")
    public String getCommonData(){
        return commonConfiguration.getMessage();
    }
}
