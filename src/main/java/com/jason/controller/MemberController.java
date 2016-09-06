package com.jason.controller;

import com.jason.domain.Member;
import com.jason.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 6.
 */
@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping
    @ResponseBody
    public List<Member> findMembers() {
        return memberService.findMembers();
    }
}
