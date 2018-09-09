package com.wil.test;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by wil on 2017/11/12.
 */
public class ExportExcelFileTest {

    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("d:/aaa.xls",true);

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("cc");
        Row titleRow = sheet.createRow(0);
        titleRow.createCell(0).setCellValue("姓名");
        titleRow.createCell(1).setCellValue("电话");
        titleRow.createCell(2).setCellValue("地址");
        titleRow.createCell(3).setCellValue("年龄");

        workbook.write(out);
        out.flush();
        out.close();


    }


}
