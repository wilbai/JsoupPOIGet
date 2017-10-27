package com.wil.thread;

import com.wil.util.Spider;

/**
 * Created by wil on 2017/10/27.
 */
public class SonThread extends Thread{

    @Override
    public void run() {
        Spider.WriteText("d:/b.txt",Spider.getLinkList("管城回族区",1, 4));
    }
}
