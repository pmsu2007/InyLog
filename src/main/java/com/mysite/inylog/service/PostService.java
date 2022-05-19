package com.mysite.inylog.service;

import com.mysite.inylog.domain.Post;
import com.mysite.inylog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getList() {
        return this.postRepository.findAll();
    }

    public Post getPost(Long id) {
        Optional<Post> post = this.postRepository.findById(id);
        if (post.isPresent()) {
            return post.get();
        }
        return post.get();
    }

    public void create(String subject, String content){
        Post post = new Post();
        post.setSubject(subject);
        post.setContent(content);
        post.setCreateDate(LocalDateTime.now());
        this.postRepository.save(post);
    }
}

