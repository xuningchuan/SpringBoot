package com.xuningchuan.demo;

import com.xuningchuan.demo.mapper.mysql_db.StudentMapper;
import com.xuningchuan.demo.mapper.mysql_dynamic.DynamicStuMapper;
import com.xuningchuan.demo.mapper.mysql_master.MasterStuMapper;
import com.xuningchuan.demo.mapper.mysql_slave.SlaveStuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuningchuan
 * @Title: MysqlTest
 * @Description:
 * @date 2019/10/20下午7:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MysqlTest {

    @Autowired
    private MasterStuMapper masterMapper;

    @Autowired
    private SlaveStuMapper slaveMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private DynamicStuMapper dynamicStuMapper;


    /**
     * Description: 测试多数据源
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/10/20 下午7:55
     */
    @Test
    public void mysqlTest(){
        System.out.println(masterMapper.getStudentList());
        System.out.println(slaveMapper.getStudentList());
    }

    @Test
    public void mysqlTest1(){
        System.out.println(studentMapper.getStudentList());
    }

    @Test
    public void dynamicDataSourceTest(){
        System.out.println("master 库=======" + dynamicStuMapper.getStuFromMaster());
        System.out.println("slave  库=======" + dynamicStuMapper.getStuFromSlave());

    }
}
