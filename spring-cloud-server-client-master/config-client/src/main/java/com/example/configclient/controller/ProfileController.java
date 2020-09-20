package com.example.configclient.controller;

import com.example.configclient.configuration.CommonConfiguration;
import com.example.configclient.configuration.ProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ProfileController {

    @Autowired
    private ProfileConfiguration profileConfiguration;

    @GetMapping("/profileConfig")
    public String profileConfig(){
        return profileConfiguration.getMessage();
    }
}
