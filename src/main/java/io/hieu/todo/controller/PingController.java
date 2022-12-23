package io.hieu.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/ping", "/ping.*", "/ping/", "/ping/*", "/api/ping", "/api/ping.*", "/api/ping/", "/api/ping/*"})
public class PingController {
    private final static String HELLO_SPRING = "<h1 style=\"text-align: center; font-family: monospace; font-size: 300px;\">Hello, Spring! 🍃</h1>";

    @GetMapping
    public String ping() {
        return this.HELLO_SPRING;
    }
}
