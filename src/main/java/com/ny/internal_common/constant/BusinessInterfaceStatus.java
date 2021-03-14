package com.ny.internal_common.constant;

import lombok.Getter;

@Getter
public enum BusinessInterfaceStatus implements CodeEnum {

    /**
     * 操作成功
     */
    SUCCESS(0, "success"),

    /**
     * 操作失败
     */
    FAIL(1, "fail");

    private final int code;
    private final String value;

    BusinessInterfaceStatus(int code, String value) {
        this.code = code;
        this.value = value;
    }


    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getCodeAsString() {
        return null;
    }
}
