package com.mysite.inylog.service;

import com.mysite.inylog.domain.Member;
import com.mysite.inylog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    //회원가입
    public Member create(String newUserId, String newEmail, String newPassWord){
        Member member = new Member();
        member.setEmail(newEmail);
        member.setUserId(newUserId);
        //보안 문제 논의
        //member.setPassword(newPassWord);
        this.memberRepository.save(member);
        return member;
    }


    //로그인


    //이메일으로 아이디 찾기

    //비밀번호


}
