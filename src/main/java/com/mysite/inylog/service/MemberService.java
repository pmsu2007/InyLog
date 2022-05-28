package com.mysite.inylog.service;

import com.mysite.inylog.domain.Member;
import com.mysite.inylog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    //회원가입
    public Member create(String newUserId, String newEmail, String newPassword){
        Member member = new Member();
        member.setUserId(newUserId);
        member.setEmail(newEmail);
        member.setPassword(passwordEncoder.encode(newPassword));
        this.memberRepository.save(member);
        return member;
    }


    //로그인


    //이메일으로 아이디 찾기

    //비밀번호


}
