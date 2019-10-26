package com.fish.fire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("player")
public class PlayerController {

    @GetMapping("fire")
    public RedirectView fire() {
        return new RedirectView("https://youtu.be/r32LcBqiv7I?t=34");
    }
}
