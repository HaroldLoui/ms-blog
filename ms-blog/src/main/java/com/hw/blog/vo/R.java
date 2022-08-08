package com.hw.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {

    private boolean success;

    private Integer code;

    private String msg;

    private T data;

    public static <T> R<T> success(T data) {
        return new R<>(true, 200, "success", data);
    }

    public static <T> R<T> fail(int code, String msg) {
        return new R<>(false, code, msg, null);
    }
}
