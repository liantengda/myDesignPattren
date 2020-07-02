package com.lian.myDesign.strategyPattern.orderhandler1.Model;

import java.math.BigDecimal;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/1 21:30
 */

public class Order {
    private String source;
    private String payMethod;
    private String code;
    private BigDecimal amount;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
