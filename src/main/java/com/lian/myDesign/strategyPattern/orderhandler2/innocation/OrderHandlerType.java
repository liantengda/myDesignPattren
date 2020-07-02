package com.lian.myDesign.strategyPattern.orderhandler2.innocation;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/1 21:38
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface OrderHandlerType {
    String source();
    String payMethod();
}
