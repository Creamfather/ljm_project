package org.project.ljm_project_outflearn.common;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j  // 로그설정 -> Slf4j 추상화클래스 -> logback 구현체
@Controller
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        log.info("hahah {}", "z");
        return "index";
    }

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", helloService.getUsers());
        return "index";
    }

}
