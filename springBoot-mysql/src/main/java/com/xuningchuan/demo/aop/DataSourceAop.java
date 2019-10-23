package com.xuningchuan.demo.aop;

import com.xuningchuan.demo.constants.DataSourceType;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: DataSourceAop
 * @Description:
 * @date 2019/10/23下午4:24
 */

@Aspect
@Component
@Slf4j
public class DataSourceAop {

    /**
     * Description: aop 切换数据源
     *           detail:   执行 com.xuningchuan.demo.mapper.mysql_dynamic 包及其子包 下所有类中 以 Master结尾的方法 前 将数据源改为 master 数据源
     *           execution 表达式简介:
     *                        1. *  返回类型 * 表示 all
     *                        2. com.xuningchuan.demo.mapper.mysql_dynamic..包名 结尾.. 表示当前包及其子包
     *                        3. * 类名 * 表示 all
     *                        4. *Master 方法名  *Master 模糊匹配以 Master结尾的方法
     *                        5. (..) 方法参数类型 (..) 代表 all
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/10/23 下午5:54
     */
    @Before("execution(* com.xuningchuan.demo.mapper.mysql_dynamic..*.*Master(..))")
    public void setMasterDataSource(){
        log.info("正在由[{}]库切向[{}]库", DataSourceType.getDataBaseTypeThreadLocal(), DataSourceType.DataBaseType.master);
        DataSourceType.setDataBaseTypeThreadLocal(DataSourceType.DataBaseType.master);
    }



    /**
     * Description: aop 切换数据源 同上
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/10/23 下午6:02
     */
    @Before("execution(* com.xuningchuan.demo.mapper.mysql_dynamic..*.*Slave(..))")
    public void setSlaveDataSource(){
        log.info("正在由[{}]库切向[{}]库", DataSourceType.getDataBaseTypeThreadLocal(), DataSourceType.DataBaseType.slave);
        DataSourceType.setDataBaseTypeThreadLocal(DataSourceType.DataBaseType.slave);
    }
}
