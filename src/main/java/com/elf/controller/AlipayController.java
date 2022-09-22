package com.elf.controller;

import com.elf.bean.Alipay;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class AlipayController {
    Alipay alipay;
    // 字符编码
    private final String charSet = "UTF-8";
    //沙箱接口路径
    private final String gatewayUrl ="https://openapi.alipaydev.com/gateway.do";
    //格式
    private final String format = "JSON";
    //签名方式
    private final String signType = "RSA2";
    //支付宝同步通知路径                          这里要写你的
    private final String returnUrl = "http://localhost:9090/returnUrl";


}
