package com.leyou.cart.pojo;

import lombok.Data;

/**
 * 购物车一个商品的实体类
 */
@Data
public class Cart {
    private Long skuId;// 商品id
    private String title;// 标题
    private String image;// 图片
    private Long price;// 加入购物车时的价格
    private Integer num;// 购买数量
    private String ownSpec;// 商品规格参数
}
