package com.wil.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wil on 2017/11/13.
 */
public class TransNumber {

    public static void main(String[] args) {
        List<String> numList = new ArrayList<>();
        List<Integer> numberList = new ArrayList<>();
        //1234,5567.34 1千2百3十4万 5千5百6十7块 3角4分
        String[] words = {"块","十","百","千",
                "万","十","百","千","亿"};
        String[] count = {"分","角"};
        double num = 12345567.34;
        double num2 = 12345567.34;

        while(num > 0) {
            int a = (int) (num%10);
            num = (int) (num/10);
            numberList.add(a);
            System.out.println(a);
        }


        for (int i = 0; i < numberList.size(); i++) {
            String mert = numberList.get(i)+words[i];
            numList.add(mert);
        }

        StringBuilder builder = new StringBuilder();
        int length = numList.size();
        for(int i = 0; i < numList.size(); i++) {
            String w = numList.get(length-i-1);
            builder.append(w);
        }

        //角分的控制
        int fen = (int) (num2*100%10);
        int jiao = (int) (num2*10%10);

        builder.append(jiao).append("角");
        builder.append(fen).append("分");
        System.out.println(builder.toString());

    }
}
