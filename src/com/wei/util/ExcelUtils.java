package com.wei.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mr.Wei
 * @version 1.0.0
 * @program wei-up
 * @description
 * @date 2019-05-07 11:41
 */
public class ExcelUtils {

    public static void main(String[] args) {

    }

    private static Workbook wb;
    private static Sheet sheet;
    private static Row row;


    /**
     * 读取表头
     *
     * @param inputStream 输入流
     * @return List<String> 返回list
     */
    public static List<String> readExcelTitle(InputStream inputStream) {
        try {
            wb = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = wb.getSheetAt(0);
        row = sheet.getRow(0);
        // 标题总列数
        int colNum = row.getPhysicalNumberOfCells();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < colNum; i++) {
            list.add(row.getCell(i).getCellFormula());
        }
        return list;
    }

    /**
     * 读取excel内容
     *
     * @param inputStream 输入流
     * @return Map<行, Map < 下标, Object>>
     */
    public static Map<Integer, Map<Integer, Object>> readExcelContent(InputStream inputStream) {
        try {
            wb = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<Integer, Map<Integer, Object>> content = new HashMap<>();
        sheet = wb.getSheetAt(0);
        // 得到总行数
        int rowNum = sheet.getLastRowNum();
        row = sheet.getRow(0);
        int colNum = row.getPhysicalNumberOfCells();
        // 正文内容应该从第二行开始,第一行为表头的标题
        for (int i = 1; i <= rowNum; i++) {
            row = sheet.getRow(i);
            int j = 0;
            Map<Integer, Object> cellValue = new HashMap<>();
            while (j < colNum) {
                Object obj = getCellFormatValue(row.getCell(j));
                cellValue.put(j, obj);
                j++;
            }
            content.put(i, cellValue);
        }
        return content;
    }


    private static Object getCellFormatValue(Cell cell) {
        Object cellValue;
        if (cell != null) {
            // 判断当前Cell的Type
            switch (cell.getCellType()) {
                // 如果当前Cell的Type为NUMERIC
                case Cell.CELL_TYPE_NUMERIC:
                case Cell.CELL_TYPE_FORMULA: {
                    // 判断当前的cell是否为Date
                    if (DateUtil.isCellDateFormatted(cell)) {
                        cellValue = cell.getDateCellValue();
                    } else {
                        // 如果是纯数字
                        // 取得当前Cell的数值
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                // 如果当前Cell的Type为STRING
                case Cell.CELL_TYPE_STRING:
                    // 取得当前的Cell字符串
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                default:
                    // 默认的Cell值
                    cellValue = "";
            }
        } else {
            cellValue = "";
        }
        return cellValue;
    }

}