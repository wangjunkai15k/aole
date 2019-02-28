package com.jk.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_order_item")
public class OrderItem implements Serializable{
    @Id
    @GeneratedValue
    private   Long   id;
    @Column
    private   Long   item_id;
    @Column
    private   Long   goods_id;
    @Column
    private   Long   order_id;
    @Column
    private   String   title;
    @Column
    private   float   price;
    @Column
    private   Integer  num;
    @Column
    private    float    total_fee;
    @Column
    private    String     pic_path;
    @Column
    private    String     seller_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public float getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(float total_fee) {
        this.total_fee = total_fee;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }


    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", item_id=" + item_id +
                ", goods_id=" + goods_id +
                ", order_id=" + order_id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", total_fee=" + total_fee +
                ", pic_path='" + pic_path + '\'' +
                ", seller_id='" + seller_id + '\'' +
                '}';
    }
}
