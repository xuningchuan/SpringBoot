package com.xuningchuan.demo.constants;


/**
 * @author xuningchuan
 * @Title: DataSourceType
 * @Description:
 * @date 2019/10/23下午3:45
 */
public class DataSourceType {

    public enum DataBaseType {
        master, slave
    }

    private static final ThreadLocal<DataBaseType> DATA_BASE_TYPE_THREAD_LOCAL = new ThreadLocal<DataBaseType>() {

        @Override
        protected DataBaseType initialValue() {
            return DataBaseType.master;
        }
    };

    public static void setDataBaseTypeThreadLocal(DataBaseType dataBaseType) {
        DATA_BASE_TYPE_THREAD_LOCAL.set(dataBaseType);
    }

    public static DataBaseType getDataBaseTypeThreadLocal() {
        return DATA_BASE_TYPE_THREAD_LOCAL.get();
    }

    public static void clearDataBaseTypeThreadLocal() {
        DATA_BASE_TYPE_THREAD_LOCAL.remove();
    }
}
