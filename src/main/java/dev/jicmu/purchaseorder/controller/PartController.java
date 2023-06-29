package dev.jicmu.purchaseorder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parts")
public class PartController {

    @GetMapping
    public String parts() {


        return "/parts/index";
    }

}
