package com.mysite.inylog.service;

import com.mysite.inylog.domain.Category;
import com.mysite.inylog.domain.Member;
import com.mysite.inylog.domain.Post;
import com.mysite.inylog.repository.CategoryRepository;
import com.mysite.inylog.repository.MemberRepository;
import com.mysite.inylog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository postRepository;
    private final MemberRepository memberRepository;
    private final CategoryRepository categoryRepository;

    public List<Post> getList() {
        return postRepository.findAll();
    }

    public Post getPost(Long postId) {
        Optional<Post> post = postRepository.findById(postId);
        if (post.isPresent()) {
            return post.get();
        }else{
            //Exception
        }

        return post.get();
    }

    @Transactional
    public void create(String subject, String content, Long memberId, Long categoryId){

        Member member = memberRepository.getById(memberId);
        Category category = categoryRepository.getById(categoryId);
        Post post = new Post();

        post.setSubject(subject);
        post.setContent(content);
        post.setCreateDate(LocalDateTime.now());
        post.setMember(member);
        post.setCategory(category);

        postRepository.save(post);
    }

    @Transactional
    public void recommend(Long postId, Long memberId) {

        Post post = postRepository.getById(postId);
        Member member = memberRepository.getById(memberId);

        post.getRecommender().add(member);
    }

}

