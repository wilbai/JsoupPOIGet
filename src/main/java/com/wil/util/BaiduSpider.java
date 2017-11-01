package com.wil.util;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by wil on 2017/11/1.
 */
public class BaiduSpider {

    public static void writeText() {
        try {
            Document document = Jsoup.connect("https://tieba.baidu.com/p/1835276846?see_lz=1&pn=4").get();

            String text = document.getElementsByClass("d_post_content j_d_post_content ").toString();
            FileWriter writer = new FileWriter("d:/b.txt",true);
            IOUtils.write(text,writer );
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
