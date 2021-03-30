package com.xuningchuan.demo.entity;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

@Data
public class BasePayRequest {
    /** 结算批次点*/
    @Pattern(regexp = "00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23", message = "结算批次点只能在00到23之间")
    private String settlementBatchNo;
    /** 账务规则ID */
    @Length(max = 36)
    private String ruleId;
    /** 分账业务类型*/
    @Length(max = 64)
    private String businessType;
    /** 四方自定义分账规则,json数组,businessType出现时，ruleContent必传 */
    @Length(max = 1200)
    private String ruleContent;
    /**
     * 计算手续费标识
     * @see com.suixingpay.trading.trader.enums.CalRecFeeFlagEnum
     */
    @Pattern(regexp = "00|10|11", message = "calRecFeeFlag参数暂仅开放00、10、11枚举值")
    private String calRecFeeFlag;
}
