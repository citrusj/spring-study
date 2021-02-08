package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    //spring container에 service를 하나만 등록
    private final MemberService memberService;

    //생성자 호출. 스프링 컨테이너에 있는 memberService를 가져옴. Dependency Injection
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
