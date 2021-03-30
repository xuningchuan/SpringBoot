package com.xuningchuan.demo.controller;

import com.xuningchuan.demo.entity.Request;
import com.xuningchuan.demo.entity.TradePayRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuningchuan
 * @Title: DemoController
 * @Description:
 * @date 2019/7/8下午8:53
 */
@RestController
public class DemoController {

    static String url = "https://openapi-gtm.tianquetech.com/order/reverseScan";

    static String url1 = "http://172.16.138.138:4231/pay/tradePay";
    static String url2 = "http://172.16.175.43:8080/order/reverseScan";


    @RequestMapping("/gtm")
    public Object getStudent() {

        RestTemplate restTemplate = new RestTemplate();

        Request<TradePayRequest> request = new Request<>();
        TradePayRequest orderRequest = new TradePayRequest();
        // 构建参数-公共参数
        request.setVersion("2.0");
        request.setFormat("UTF-8");
        request.setSignType("RSA");
        request.setTimestamp("2014 - 07 - 24 03: 07: 50");
        request.setPartnerId("10000614");
        request.setFormat("UTF-8");
        request.setSignType("RSA");
        request.setTimestamp("2014 - 07 - 24 03: 07: 50");
        request.setInnerFlag("0");// 不验签
        // 构建参数-用户信息
        orderRequest.setOrderType("WECHAT");
        orderRequest.setScene("1");
        orderRequest.setAuthCode("134635638081193023"); // 每次单元测试都要 修改两维码
        // AUTHCODE
        // 构建参数-商户信息
        orderRequest.setOutTradeNo(String.valueOf(Math.random()));
        orderRequest.setMerchantCode("836822058111002");
        orderRequest.setTotalAmount("0.02");
        orderRequest.setSubject("测试交易LIJIN");
        orderRequest.setOperatorId("001");
        orderRequest.setStoreId("001");
        // orderRequest.setTerminalId("81000217");
        orderRequest.setTerminalIp("192.168.1.1");
        orderRequest.setExtend("附加信息");
        orderRequest.setTimeExpire("10");
        orderRequest.setLimitPay("01");
        orderRequest.setNotifyUrl("111");
        request.setData(orderRequest);
        // 构建参数-加签数据
        request.setSign("测试");
        request.setInnerFlag("0");
        ResponseEntity<Object> response = restTemplate.postForEntity(url, request, Object.class);
        return response;
    }
}
