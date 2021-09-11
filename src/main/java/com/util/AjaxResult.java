package com.util;

public class AjaxResult {
    private  boolean success=true;
    private  String msg="";
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
