package com.wil.util;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wil on 2017/10/23.
 */
public class HttpClientUtil {

    public static String httpClientGet(String url,String encoding) {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        String res = null;

        HttpGet get = new HttpGet(url);
        try {
            HttpResponse resp = httpClient.execute(get);
            int code = resp.getStatusLine().getStatusCode();
            if(code == 200) {
                InputStream in = resp.getEntity().getContent();
                res = IOUtils.toString(in,encoding);
            } else {
                System.out.println("系统异常");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

}
