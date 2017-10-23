package com.wil.test;

import com.wil.util.HttpClientUtil;
import com.wil.util.Spider;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wil on 2017/10/23.
 */
public class Test {

    public static void main(String[] args) {

        Spider.WriteText("d:/a.txt",Spider.getLinkList("中原区",6, 8));

    }

}
