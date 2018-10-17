package com.stackers.storage.controller;

import com.stackers.storage.Command;
import com.stackers.storage.model.Response;
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
    public Response getResponse(
            @PathVariable(value = "command") Command command,
            @PathVariable(value = "cellId") String cellId) {
        return service.getResponse(command,cellId);
    }
}