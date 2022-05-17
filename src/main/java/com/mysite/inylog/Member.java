package com.mysite.inylog;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(length = 30)
    private String userId;

    @Column(unique = true)
    private String email;

    private String imageURL;

    //private ArrayList followerList = new ArrayList();

//    @OneToMany(mappedBy = "member")
//    private List<Post> posts = new ArrayList<>();

    //private List<Long> followerList = new ArrayList<>();


}
