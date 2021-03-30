/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wanghongfei[wang_hf@suixingpay.com] 
 * @date: 2018年4月23日 下午1:41:48   
 * @Copyright ©2018 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xuningchuan.demo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 请求公共参数
 * 
 * @author: wanghongfei[wang_hf@suixingpay.com]
 * @date: 2018年4月23日 下午1:41:48
 * @version: V1.0
 * @review: wanghongfei[wang_hf@suixingpay.com]/2018年4月23日 下午1:41:48
 */
@Data
public class Request<T> implements Serializable {

    private static final long serialVersionUID = -1846155278595545839L;
    /** 版本号 默认3.0 */
    private String version = "3.0";

    /** 签名 */
    // @NotEmpty
    private String sign;

    /** 签名类型 默认RSA */
    private String signType = "RSA";

    /** 机构编号 */
    @NotBlank
    @Length(max = 8, message = "partnerId最大长度为8")
    private String partnerId;

    /** 格式化编码 默认utf-8 */
    private String format = "utf-8";

    /** 时间戳 */
    @NotEmpty
    private String timestamp;

    /** 业务请求数据 */
    @Valid
    @NotNull
    private T data;

    /** 是否内部系统调用标识 true 0是，false 1否 */ // 目前只有跑批系统传innerFlag
    private String innerFlag;
}
