package com.xuningchuan.demo.constants;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author xuningchuan
 * @Title: DynamicDataSource
 * @Description:
 * @date 2019/10/23下午4:04
 */


public class DynamicDataSource extends AbstractRoutingDataSource {


    @Override
    protected Object determineCurrentLookupKey() {
        DataSourceType.DataBaseType dataBaseType = DataSourceType.getDataBaseTypeThreadLocal();
        return dataBaseType;
    }
}
