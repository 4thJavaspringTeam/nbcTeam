package com.sparta.easyspring.auth.authcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/social")
public class SocialAuthController {

    @GetMapping("/kakao")

}
