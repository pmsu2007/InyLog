package com.mysite.inylog.repository;

import com.mysite.inylog.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
