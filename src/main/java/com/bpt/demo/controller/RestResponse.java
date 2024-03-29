package com.bpt.demo.controller;

public class RestResponse {

    public RestResponse(Integer responseCode){
        super();
        this.responseCode=responseCode;
    }

    public RestResponse(Integer responseCode, String message){
        super();
        this.responseCode=responseCode;
        this.message = message;
    }

    private Integer responseCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;


    public Integer getResponseCode() {

        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }



}
