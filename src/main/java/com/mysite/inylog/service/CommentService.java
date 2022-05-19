package com.mysite.inylog.service;


import com.mysite.inylog.domain.Comment;
import com.mysite.inylog.domain.Post;
import com.mysite.inylog.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public void create(Post post, String commentText){
        Comment comment = new Comment();
        comment.setContent(commentText);
        comment.setCreateDate(LocalDateTime.now());
        comment.setPost(post);
        this.commentRepository.save(comment);
    }

}
