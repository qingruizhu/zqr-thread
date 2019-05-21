package com.zqr.thread.requestprocess;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-05-21 15:43
 */
public class Request {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request[name=" + this.name + "]";
    }
}
