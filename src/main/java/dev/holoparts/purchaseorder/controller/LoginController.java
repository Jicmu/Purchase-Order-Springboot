package dev.holoparts.purchaseorder.controller;

import dev.holoparts.purchaseorder.login.service.MemberService;
import dev.holoparts.purchaseorder.login.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class LoginController {

    private final MemberService memberService;


    @GetMapping("/login")
    public String login() {
        return "/user/login";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "/user/sign-up";
    }

    @PostMapping("/sign-up")
    public String signUp(MemberDto memberDto) {
        memberService.join(memberDto);

        return "/user/login";
    }

}
