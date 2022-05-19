package com.mysite.inylog.Controller;


import com.mysite.inylog.domain.Post;
import com.mysite.inylog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/post")
@RequiredArgsConstructor
@Controller
public class PostController {

    private final PostService postService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Post> postList = this.postService.getList();
        return "템플릿이 오면 해당 부분에 추가하면 될 듯";
    }


    /*
    @RequestMapping("/list")
    public String list(Model model){
        List<Question> questionList = this.questionService.getList();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }

    @RequestMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm){
        Question question = this.questionService.getQuestion(id);
        model.addAttribute("question", question);
        return "question_detail";
    }
     */


}
