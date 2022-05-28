package com.mysite.inylog.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
public class MemberCreateForm {

    @NotEmpty(message = "닉네임은 필수항목입니다.")
    private String userId;

    @NotEmpty(message = "비밀 번호는 필수항목입니다.")
    private String password1;

    @NotEmpty(message = "비밀 번호를 다시 한번 입력하세요.")
    private String password2;

    @NotEmpty(message = "이메일은 필수항목입니다.")
    @Email
    private String email;



}
