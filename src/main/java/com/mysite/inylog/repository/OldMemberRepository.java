package com.mysite.inylog.repository;


import com.mysite.inylog.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class OldMemberRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

}
