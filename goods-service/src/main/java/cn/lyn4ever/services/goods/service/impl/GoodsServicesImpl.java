package cn.lyn4ever.services.goods.service.impl;

import cn.lyn4ever.entity.TopAds;
import cn.lyn4ever.services.goods.mapper.GoodsMapper;
import cn.lyn4ever.services.goods.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther 微信公众号 “小鱼与Java”
 * @date 2020/3/25
 */
@Service
public class GoodsServicesImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public TopAds getOne() {

        return goodsMapper.selectOne();
    }
}
