package cn.lyn4ever.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 首页最上边的广告，这个主要是由系统维护的，所以会包含一些自定义推送(TopAds)实体类
 *
 * @author makejava
 * @since 2020-03-24 20:30:34
 */
public class TopAds implements Serializable {
    private static final long serialVersionUID = -28296151709254764L;
    //id
    private Integer id;
    // 图片地址
    private String pic;
    //类型，0 商品，1 链接，2 商家 
    private String type;
    //内容地址
    private String url;
    //创建时间
    private Date createtime;
    //更新时间
    private Date updatetime;
    //操作人
    private String operate;
    //状态 0 不可用，1 可用
    private String zt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

}