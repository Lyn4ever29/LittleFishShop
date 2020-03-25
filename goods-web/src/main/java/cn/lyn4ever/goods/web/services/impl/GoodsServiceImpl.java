package cn.lyn4ever.goods.web.services.impl;

import cn.lyn4ever.entity.TopAds;
import cn.lyn4ever.goods.web.feign.IGoodsServiceFeign;
import cn.lyn4ever.goods.web.services.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther 微信公众号 “小鱼与Java”
 * @date 2020/3/25
 */
@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private IGoodsServiceFeign iGoodsServiceFeign;

    @Override
    public TopAds getOne() {
        //这里使用的是openfeign调用，而不是restTemplate
        return iGoodsServiceFeign.getOne();
    }
}
