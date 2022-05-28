package com.mysite.inylog.controller;


import com.mysite.inylog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class PostController {

    private final PostService postService;

}
