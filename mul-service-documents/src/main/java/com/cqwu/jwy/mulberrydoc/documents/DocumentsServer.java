package com.cqwu.jwy.mulberrydoc.documents;

import com.cqwu.jwy.mulberrydoc.documents.ribbon.rule.MyRoundRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name = "MULBERRYDOC-MUL-SERVICE-DOCUMENTS", configuration = MyRoundRule.class)
public class DocumentsServer
{
    public static void main(String[] args)
    {
        SpringApplication.run(DocumentsServer.class, args);
    }
}
