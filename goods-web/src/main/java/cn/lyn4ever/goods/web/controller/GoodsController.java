package cn.lyn4ever.goods.web.controller;

import cn.lyn4ever.entity.TopAds;
import cn.lyn4ever.services.goods.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个是从客户端调用的
 *
 * @auther 微信公众号 “小鱼与Java”
 * @date 2020/3/25
 */
@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private IGoodsService iGoodsService;

    @GetMapping("getOne")
    public TopAds getOne(){
        return iGoodsService.getOne();
    }

}
