/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wanghongfei[wang_hf@suixingpay.com] 
 * @date: 2018年5月7日 下午1:30:48   
 * @Copyright ©2018 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xuningchuan.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;

/**
 * 条码交易
 *
 * @author: wanghongfei[wang_hf@suixingpay.com]
 * @date: 2018年5月7日 下午1:30:48
 * @version: V1.0
 * @review: wanghongfei[wang_hf@suixingpay.com]/2018年5月7日 下午1:30:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TradePayRequest extends BasePayRequest {
    /** 外部订单号 */
    @NotBlank
    @Length(max = 32)
    private String outTradeNo;
    /** 商户号 */
    @NotBlank
    private String merchantCode;
    /** 订单金额 */
    @NotBlank
    @Length(max = 9)
    @Digits(integer = 7, fraction = 2)
    @DecimalMin("0.01")
    private String totalAmount;
    /**
     * 订单类型 WECHAT--微信扫码 ALIPAY--支付宝扫码 UNIONPAY--银联扫码
     * JSAPI--公众号支付、APP--app支付、LETPAY-小程序、FWC--支付宝服务窗
     */
    @NotBlank
    @Length(max = 10)
    private String orderType;
    /** 订单标题，格式最终为：商户签购单名称+‘_识别码’+‘（流水号） */
    @NotBlank
    private String subject;
    /** 订单详情 SingleDiscountDetailRequest */
    private String detail;
    /** 商户操作员编号 */
    @Length(max = 28)
    private String operatorId;
    /** 商户门店编号 */
    @Length(max = 32)
    private String storeId;
    /** 商户终端编号 */
    @Length(max = 64)
    private String terminalId;
    /** 商户终端IP地址 */
    @Length(max = 16)
    private String terminalIp;
    /** 支付场景 条码支付，取值：MICROPAY  ; 刷脸支付，取值：FACEPAY  ; 1-条码支付，2-刷脸支付 默认值1 */
    @Length(max = 1)
    private String scene;
    /** 支付授权码 */
    @NotBlank
    @Length(max = 64)
    @NumberFormat
    private String authCode;
    /** 异步通知地址 */
    @NotBlank
    @Length(max = 256)
    private String notifyUrl;
    /**
     * 是否限制信用卡,00-
     * 不禁用,01-限定不能,02-禁用积分支付,默认值00，禁用支付渠道,多个渠道以逗号分割，如同时禁用信用支付类型和积分则limitPay="01,02"
     */
    @Length(max = 15)
    private String limitPay;
    /** 扩展字段 ,在查询和通知中原样返回，该字段主要用于商户携带订单的自定义数据 */
    @Length(max = 128)
    private String extend;

    // @Length(max = 28)
    // private String source;
    /** 订单失效时间 ,以分钟为单位 */
    @Range(min = 1, max = 1440)
    private String timeExpire;

    @Length(max = 60)
    private String subAppId;
    /**
     * 终端号
     *
     * @Length(max = 8) private String trmNo;
     */

    // 2.0
    /** 微信支付分配的子商户号 */
    @Length(max = 32)
    private String subMchId;
    /** 微信支付分配给收单服务商的ID */
    @Length(max = 32)
    private String channelId;
    /** 微信开具电子发票使用,00：不需要开具发票01：需要开具发票 */
    @Length(max = 2)
    private String needReceipt;
    /** 实名支付 IdentityRequest */
    private String identity;
    /** 销售产品码，支付宝使用 */
    @Length(max = 32)
    private String productCode;
    /** 支付宝的店铺编码，口碑入驻使用 */
    @Length(max = 32)
    private String alipayStoreId;
    /** json 格式；商户传入终端设备 */
    @Length(max = 2048)
    private String terminalParams;
    /**
     * 分账交易类型, 00：正常消费（入现金户） 02：正常消费退货 61：科技消费（入临时账号） 62：科技消费退货（临时出款）
     * 63：科技消费确认（临时到现金）64：科技消费确认退货 65：科技消费分账 66：科技消费分账退货（现金户出）
     */
    @Length(max = 2)
    private String accTranType;
    /** 订单优惠标记，代金券或立减优惠功能的参数，微信专用 */
    @Length(max = 32)
    private String goodsTag;
	/** 版本号，85号文改造要求 */
	@Length(max = 10)
	private String appVersion;
	/** 78域 端通讯信息，85号文改造要求 */
	@Length(max = 128)
	private String txnRsv1;

    /** 终端号, 透传给银联二维码*/
    @Length(max = 8)
    private String trmNo;


    /**
     * 花呗分期数只支持6、12期
     */
    @Length(max = 2)
    private String hbFqNum;
    /**
     * 使用花呗分期需要卖家承担的 手续费比例的百分值，传入 100 代表100%
     */
    @Length(max = 3)
    private String hbFqPercent;
    /**
     * 行业数据回流信息
     */
    @Length(max = 512)
    private String industryRefluxInfo;
    /**
     * 卡类型
     */
    @Length(max = 32)
    private String cardType;


    /**
     *  参与优惠计算的金额
     */
    @DecimalMin("0")
    private BigDecimal discountAmt;

    /**
     *  不参与优惠计算的金额
     */
    @DecimalMin("0")
    private BigDecimal unDiscountAmt;
    /** 批次号 */
    private String batNo;

}
