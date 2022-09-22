package com.elf.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Configuration
public class Alipay {
    /*** APPID */
    @Value("alipay.appId")
    private String appId;
    /** * 应用私钥 */
    @Value("alipay.appPrivateKey")
    private String appPrivateKey;
    /*** 支付宝公钥*/
    @Value("alipay.alipayPublicKey")
    private String alipayPublicKey;
    /** * 支付宝异步通知路径 */
    @Value("alipay.notifyUrl")
    private String notifyUrl;
}
