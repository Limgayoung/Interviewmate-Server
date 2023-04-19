package org.interviewmate.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    /**
     *  Error Code
     *  400 : 잘못된 요청
     *  401 : 권한 오류.
     *  403 : 서버가 허용하지 않은 웹페이지, 미디어 요청.
     *  404 : 존재하지 않는 정보에 대한 요청.
     */

    /* BAD_REQUEST : 400 */
    //common error
    NOT_FOUND_DATA(HttpStatus.NOT_FOUND, "해당하는 데이터를 찾을 수 없습니다."),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다." ),
    FAIL_TO_CREATE(HttpStatus.BAD_REQUEST,"토큰을 생성할 수 없습니다."),
    FAIL_TO_LOGIN(HttpStatus.BAD_REQUEST, "아이디 또는 비밀번호를 확인하세요."),
    FAIL_TO_LOAD_SUBJECT(HttpStatus.BAD_REQUEST, "토큰에 대한 정보를 불러올 수 없습니다."),
    INVALID_TOKEN_TYPE(HttpStatus.BAD_REQUEST, "유효하지 않은 토큰 타입입니다."),
    EXPIRED_TOKEN(HttpStatus.BAD_REQUEST, "만료된 토큰입니다."),


    INVALID_KEYWORD(HttpStatus.BAD_REQUEST, "유효하지 않은 키워드입니다"),

    //user error
    EMPTY_KEYWORD(HttpStatus.BAD_REQUEST, "키워드를 입력해주세요."),
    DUPLICATE_EMAIL(HttpStatus.BAD_REQUEST, "중복된 이메일입니다."),
    DUPLICATE_NICKNAME(HttpStatus.BAD_REQUEST, "중복된 닉네임입니다."),

    /* UNAUTHORIZED : 401 */
    INVALID_AUTHENTICATION(HttpStatus.UNAUTHORIZED, "유효하지 않은 인증입니다."),

    /* FORBIDDEN : 403 */

    /* NOT_FOUND : 404 */
    NOT_EXIST_USER(HttpStatus.NOT_FOUND, "존재하지 않는 사용자입니다."),

    //interview error
    INTERVIEW_NOT_FOUND(HttpStatus.NOT_FOUND, "해당하는 인터뷰가 없습니다");

    private final HttpStatus code;
    private final String message;
    
}
