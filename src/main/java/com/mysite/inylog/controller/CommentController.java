package com.mysite.inylog.controller;

import com.mysite.inylog.repository.CommentRepository;
import com.mysite.inylog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class CommentController {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

}
