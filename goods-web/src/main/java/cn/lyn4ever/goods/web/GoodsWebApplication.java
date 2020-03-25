package cn.lyn4ever.goods.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther 微信公众号 “小鱼与Java”
 * @date 2020/3/25
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //开启feign调用
public class GoodsWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsWebApplication.class,args);
    }
}
