package cn.lyn4ever.goods.web.feign;

import cn.lyn4ever.entity.TopAds;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * feign客户端的接口
 *
 * @auther 微信公众号 “小鱼与Java”
 * @date 2020/3/25
 */
@Component //注册进Spring容器
@FeignClient(value = "goods-service") //这个value是你要调用的微服务的名
public interface IGoodsServiceFeign {


    /**
     * 这个是你打算调用的远程服务的接口
     * @return
     */
    @GetMapping("goods/getOne")
    public TopAds getOne();

}
