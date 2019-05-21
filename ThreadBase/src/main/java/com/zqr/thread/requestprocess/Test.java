package com.zqr.thread.requestprocess;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-05-21 16:04
 */
public class Test {

    public static void main(String[] args) {




        SaveProcessor saveProcessor=new SaveProcessor();
        saveProcessor.start();
        PrintProcessor printProcessor=new PrintProcessor(saveProcessor);
        printProcessor.start();

        Request request=new Request();
        request.setName("Mic");
        printProcessor.processRequest(request);


    }
}
