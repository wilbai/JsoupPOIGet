package com.wil.test;

import com.wil.util.BaiduSpider;

import java.io.*;

/**
 * Created by xuejiqing on 2017/11/1.
 */
public class BaiduTest {

    public static void main(String[] args) {
        //BaiduSpider.writeText();
        try {
            Reader reader = new FileReader("d:/a.txt");
            Writer writer = new FileWriter("d:/b.txt");
            org.apache.commons.io.IOUtils.copy(reader, writer);
            writer.flush();
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
