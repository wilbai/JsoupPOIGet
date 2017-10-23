package com.wil.test;

import com.wil.util.Spider;

/**
 * Created by wil on 2017/10/23.
 */
public class Test {

    public static void main(String[] args) {

        Spider.WriteText("d:/a.txt",Spider.getLinkList("中原区",6, 8));

    }

}
