package com.zqr.thread.requestprocess;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-05-21 15:45
 */
public class SaveProcessor extends Thread implements RequestProcessor {

    private LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<Request>();

    public void processRequest(Request request) {
        requests.add(request);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Request request = requests.take();
                System.out.println("保存数据:"+request.getName());
                //next.processRequest(request);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
