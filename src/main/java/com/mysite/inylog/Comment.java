package com.mysite.inylog;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Comment {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;
}
