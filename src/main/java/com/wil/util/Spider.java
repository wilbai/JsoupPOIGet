package com.wil.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wil on 2017/10/23.
 */
public class Spider {

    public static void WriteText(String fileName, List<String> list) {

        for (String url : list) {

            Document doc = Jsoup.parse(HttpClientUtil.httpClientGet(url, "UTF-8"));

            String str = doc.getElementsByClass("list-group-item").text();
            String h1 = doc.getElementsByTag("h1").text();
            try {
                FileWriter writer = new FileWriter(fileName,true);
                writer.write(h1 + ": " + str + "\r\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<String> getLinkList(String area, int start, int end) {
        List<String> stringList = new ArrayList<>();
        if(area.equals("中原区")) {
            area = "8084";
        } else if (area.equals("金水区")) {
            area = "8081";
        } else if (area.equals("管城回族区")) {
            area = "8082";
        } else if(area.equals("二七区")) {
            area = "8083";
        } else {
            System.out.println("输入有误，请检查");
            System.exit(0);
        }
        for (int i = start; i < end; i++) {
            String url = "http://www.poi86.com/poi/district/"+ area +"/"+ i +".html";

            Document doc = Jsoup.parse(HttpClientUtil.httpClientGet(url, "UTF-8"));

            Elements elements = doc.getElementsByClass("table table-bordered table-hover");
            Elements elements1 = elements.select("[href]");

            for(Element element : elements1) {
                String s =  element.attr("href");
                s = "http://www.poi86.com" + s;
                stringList.add(s);
            }
        }

        return stringList;
    }

}
