package cn.lyn4ever.services.goods.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @auther 微信公众号 “小鱼与Java”
 * @date 2020/3/25
 */
//@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl("jdbc:mysql://49.232.165.226:3306/shop_captial");
        datasource.setUsername("user");
        datasource.setPassword("1234");
        return datasource;
    }

}
