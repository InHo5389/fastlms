package com.zerobase.fastlms.member.service;

import com.zerobase.fastlms.admin.dto.MemberDto;
import com.zerobase.fastlms.admin.model.MemberParam;
import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.model.ResetPasswordInput;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


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

    // 회원 목록 리턴(관리자에서만 사용 가능)
    List<MemberDto> list(MemberParam parameter);

    // 회원 상세 정보
    MemberDto detail(String userId);

    // 회원 상태 변경
    boolean updateStatus(String userId, String userStatus);

    // 회원 비밀번호 초기화
    boolean updatePassword(String userId, String password);
}
