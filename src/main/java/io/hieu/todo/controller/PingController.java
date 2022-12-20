package io.hieu.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/ping", "/ping.*", "/ping.*", "/ping/", "/ping/*"})
public class PingController {
    @GetMapping
    public String ping() {
        return "<h1 style=\"text-align: center; font-family: monospace; font-size: 300px;\">Hello, Spring! 🍃</h1>";
    }
}
