package com.xuningchuan.demo.designpatterns.visitor;

import lombok.Data;

/**
 * @author xuningchuan
 * @Title: Program  一段程序类
 * @Description:
 * @date 2020-02-16 09:18
 */
@Data
public class Program {

    private Long sqlTime;

    private Long NetTime;

    public Program(Long sqlTime, Long netTime) {
        this.sqlTime = sqlTime;
        NetTime = netTime;
    }
}
