package com.xuningchuan.demo.config;

import com.xuningchuan.demo.constants.DataSourceType;
import com.xuningchuan.demo.constants.DynamicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuningchuan
 * @Title: DataSourceDynamic
 * @Description:
 * @date 2019/10/23下午3:51
 */

@Configuration
@MapperScan(basePackages = "com.xuningchuan.demo.mapper.mysql_dynamic", sqlSessionTemplateRef = "dynamicSqlSessionTemplate" )
public class DataSourceDynamic {


    @Bean(name = "dynamicDataSource")
    public DynamicDataSource getDataSource(@Qualifier("masterDataSource") DataSource masterDataSource, @Qualifier("slaveDataSource") DataSource slaveDataSource){
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceType.DataBaseType.master, masterDataSource);
        targetDataSources.put(DataSourceType.DataBaseType.slave, slaveDataSource);
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setTargetDataSources(targetDataSources);
        dynamicDataSource.setDefaultTargetDataSource(masterDataSource);
        return dynamicDataSource;
    }

    @Bean("dynamicSqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory(@Qualifier("dynamicDataSource") DataSource dynamicDataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dynamicDataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/mysql_dynamic/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean("dynamicSqlSessionTemplate")
    public SqlSessionTemplate getSqlSessionTemplate(@Qualifier("dynamicSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
