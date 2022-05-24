package com.mysite.inylog.service;


import com.mysite.inylog.domain.Comment;
import com.mysite.inylog.domain.Member;
import com.mysite.inylog.domain.Post;
import com.mysite.inylog.repository.CommentRepository;
import com.mysite.inylog.repository.MemberRepository;
import com.mysite.inylog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public void create(Long postId, String content){

        Post post = postRepository.getById(postId);
        Member member = post.getMember();
        Comment comment = new Comment();

        comment.setContent(content);
        comment.setCreateDate(LocalDateTime.now());
        comment.setPost(post);
        comment.setMember(member);

        commentRepository.save(comment);
    }

    public List<Comment> findComments() {

        return commentRepository.findAll();
    }

    @Transactional
    public void recommend(Long commentId, Long memberId) {

        Comment comment = commentRepository.getById(commentId);
        Member member = memberRepository.getById(memberId);

        comment.getRecommender().add(member);
    }
}
