package com.java.controller;

import com.java.configurations.PortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class InfoController {

    private final PortService port;

    public InfoController(PortService port) {
        this.port = port;
    }

    @GetMapping
    public String getPort() {
        return port.getPort();
    }
}
