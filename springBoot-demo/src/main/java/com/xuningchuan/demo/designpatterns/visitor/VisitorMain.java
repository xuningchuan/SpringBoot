package com.xuningchuan.demo.designpatterns.visitor;

/**
 * @author xuningchuan
 * @Title: Visitor 访问者模式 行为型模式 将数据操作和数据结构分离 数据的展示形式随着访问者的变化而变化 "变色龙"
 * @Description:
 * @date 2020-02-15 20:26
 */
public class VisitorMain {


    /**
     *
     * @param args 一段程序性能 DBA在乎数据库耗时 网络人员在乎网络延迟 不同的人员(访问者)在乎同一数据
     *              不同展示方式 随着访问者变化而变化
     */
    public static void main(String[] args) {
          Program program = new Program(Long.valueOf("10"), Long.valueOf("100"));
          Visitor dbaVisitor = new DBAVisitor();
          Visitor netVisitor = new NetVisitor();

          System.out.println("程序中sql耗时: " + dbaVisitor.visit(program) + "ms");
          System.out.println("程序中网络耗时: " + netVisitor.visit(program) + "ms");
    }
}
