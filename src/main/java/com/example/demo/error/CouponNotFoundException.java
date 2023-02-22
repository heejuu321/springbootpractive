package com.example.demo.error;

public class CouponNotFoundException extends CustomException {          //입력한 쿠폰을 찾을 수 없을 경우

    private static final long serialVersionUID = -2116671122895194101L;

    public CouponNotFoundException() {
        super(ErrorCode.COUPON_NOT_FOUND);
    }
}