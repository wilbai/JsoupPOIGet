package com.wil.test;

import com.wil.thread.SonThread;
import com.wil.util.Spider;

/**
 * Created by wil on 2017/10/23.
 */
public class Test {

    public static void main(String[] args) {

        SonThread sonThread = new SonThread();
        Spider.WriteText("d:/a.txt",Spider.getLinkList("金水区",20, 23));
        sonThread.start();

    }

}
