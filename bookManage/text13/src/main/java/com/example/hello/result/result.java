package com.example.hello.result;

import java.io.Serializable;

public class result<T> implements Serializable {
    //响应码
    private int code;
    private T data = null;

    public result(int code) {
        this.code = code;
    }
    public result() {
    	//TODO Auto-generated constructor stub
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
