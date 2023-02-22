package com.example.demo.error;

public class CouponExpirationException extends CustomException {        //쿠폰이 만료 되었을 경우

    private static final long serialVersionUID = -2116671122895194101L;

    public CouponExpirationException() {
        super(ErrorCode.COUPON_EXPIRATION);
    }
}
