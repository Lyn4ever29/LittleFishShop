package cn.lyn4ever.services.goods.mapper;

import cn.lyn4ever.entity.TopAds;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @auther 微信公众号 “小鱼与Java”
 * @date 2020/3/25
 */
@Mapper
public interface GoodsMapper {
    TopAds selectOne();
}
