package com.demo.utils;

import com.demo.model.UserEntity;

/**
 * @Description
 * @Author msli
 * @Date 2021/04/01
 */

public class JWTUtils {
    /**
     * 过期时间，一周
     */
    private static final long EXPIRE = 60000 * 60 * 24 * 7;

    private static final String JWT_SECRET = "xiaosong";
    private static final String JWT_PREFIX = "test";
    private static final String JWT_SUBJECT = "fdfdsf";

    public static String generateWebToken(UserEntity user) {
//        Jwts.builder().setSubject(JWT_SUBJECT)
//                .claim()
        return "";
    }
}
