package com.jason.service;

import com.jason.domain.Member;
import com.jason.repository.MemberRepository;
import com.jason.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 6.
 */
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findMembers() {
        return memberRepository.findMembers();
    }

    public List<Member> findMembers(String memberName) {
        return memberRepository.findMembers(memberName);
    }
}
