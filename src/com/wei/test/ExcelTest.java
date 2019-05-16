package com.wei.test;

import com.wei.entity.EstateDealDO;
import com.wei.util.ExcelUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ExcelTest {


    @Test
    public void test1() {
        File file = new File("C:/Users/wei/Desktop/市场成交数据.xls");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<Integer, Map<Integer, String>> integerMapMap = ExcelUtils.readExcelContent(inputStream);
        List<EstateDealDO> estateDealDOList = new ArrayList<>();
        integerMapMap.forEach(
                (rowKey, rowData) -> {
                    EstateDealDO estateDealDO = new EstateDealDO();
                    estateDealDO.setCompanyName(rowData.get(0));
                    estateDealDO.setPropertyAddress(rowData.get(1));
                    estateDealDO.setArea(rowData.get(2));
                    estateDealDO.setDealPrice(rowData.get(3));
                    estateDealDO.setEstateName(rowData.get(4));
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.parse(rowData.get(5), dtf);
                    ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
                    estateDealDO.setDealDate(Date.from(zonedDateTime.toInstant()));
                    estateDealDOList.add(estateDealDO);
                }
        );
        System.err.println(estateDealDOList);
    }
}
