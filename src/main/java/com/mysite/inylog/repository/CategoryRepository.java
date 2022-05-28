package com.mysite.inylog.repository;

import com.mysite.inylog.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
