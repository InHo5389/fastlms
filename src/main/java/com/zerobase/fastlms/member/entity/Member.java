package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    private String userId;

    private String userName;
    private String password;
    private String phone;
    private LocalDateTime regDt;

    private boolean emailAuthYn;
    private LocalDateTime emailAuthDt;
    private String emailAuthKey;

    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;

    // 관리자여부를 지정할거냐?
    // 회원에 따른 ROLE을 지정할거냐??
    private boolean adminYn;
}
