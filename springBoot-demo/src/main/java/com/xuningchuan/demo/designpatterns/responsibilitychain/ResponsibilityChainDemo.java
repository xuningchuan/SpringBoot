package com.xuningchuan.demo.designpatterns.responsibilitychain;

/**
 * @author xuningchuan
 * @Title: ResponsibilityChainDemo 责任链模式 行为型模式 --接收者与处理者解耦 适用于 多个接受者处理同一请求
 * @Description:
 * @date 2020-02-04 16:00
 */
public class ResponsibilityChainDemo {


    /**
     * Description:  责任链模式  假期审批依次经过 lead manager ..
     *               应用场景:异常处理 过滤器实现
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2020-02-04 16:44
     */
    public static void main(String[] args) {
      ApprovalHandler approvalHandler = ApprovalHandlerFactory.createApprovalHandler();

        approvalHandler.process(2);
        approvalHandler.process(4);
        approvalHandler.process(6);

    }
}
