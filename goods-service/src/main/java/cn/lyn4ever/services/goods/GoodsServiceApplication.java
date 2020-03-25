package cn.lyn4ever.services.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther 微信公众号 “小鱼与Java”
 * @date 2020/3/25
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.lyn4ever.services.goods.mapper")
public class GoodsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class, args);
    }
}
