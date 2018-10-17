package com.stackers.storage.controller;

import com.stackers.storage.ClientCommand;
import com.stackers.storage.model.ClientResponse;
import com.stackers.storage.service.request.impls.ResponseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ResponseController {

    @Autowired
    ResponseServiceImpl service;
    @RequestMapping("/response")
    public String showHello() {
        return "Hello World";
    }

    @GetMapping("/response/{command}/{cellId}")
    public ClientResponse getResponse(
            @PathVariable(value = "command") ClientCommand clientCommand,
            @PathVariable(value = "cellId") String cellId) {
        return service.getResponse(clientCommand,cellId);
    }
}