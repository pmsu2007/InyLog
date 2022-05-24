package com.mysite.inylog.service;

import com.mysite.inylog.domain.Category;
import com.mysite.inylog.domain.Member;
import com.mysite.inylog.repository.CategoryRepository;
import com.mysite.inylog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public void create(String name, Long memberId) {

        Category category = new Category();
        Member member = memberRepository.getById(memberId);

        category.setCategoryName(name);
        category.setMember(member);

        categoryRepository.save(category);
    }

    public List<Category> findCategories() {

        return categoryRepository.findAll();
    }
}
