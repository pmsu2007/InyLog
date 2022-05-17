package com.mysite.inylog.repository;

import com.mysite.inylog.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
