package com.xuningchuan.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author xuningchuan
 * @Title: DataSourceDB
 * @Description:
 * @date 2019/10/23下午3:01
 */
@Configuration
@MapperScan(basePackages = "com.xuningchuan.demo.mapper.mysql_db", sqlSessionFactoryRef = "dbSqlSessionFactory")
public class DataSourceDB {

    // 数据源  DataSource
    @Bean(name = "dbDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource slaveDataSource() {
        return DataSourceBuilder.create().build();
    }

    // SqlSessionFactory
    @Bean(name = "dbSqlSessionFactory")
    public SqlSessionFactory slaveSqlSessionFactory(@Qualifier("dbDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/mysql_db/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }
}
