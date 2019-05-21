package com.zqr.thread.requestprocess;

/**
 * @Description:   zookeeper中：责任链模式
 * @Auther: qingruizhu
 * @Date: 2019-05-21 15:35
 */
public interface RequestProcessor {
    void processRequest(Request request);
}
