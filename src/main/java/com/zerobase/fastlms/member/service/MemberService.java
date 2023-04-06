package com.zerobase.fastlms.member.service;

import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.model.ResetPasswordInput;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


public interface MemberService extends UserDetailsService {

    boolean register(MemberInput parameter);

    // uuid
    boolean emailAuth(String uuid);

    // 입력한 이메일로 비밀번호 초기화 정보를 전송
    boolean sendResetPassword(ResetPasswordInput parameter);

    // uuid에 대해서 password로 초기화함
    boolean resetPassword(String uuid, String password);

    //입력받은 uuid 값이 유효한지 확인(이메일링크로 다시 들어올수 있어서.)
    boolean checkResetPassword(String uuid);
}
