package com.imall.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_promotion")
public class TbPromotion {
    /**
     * 促销活动id
     */
    @Id
    private Long id;

    /**
     * 活动类型，目前可选的有：0没有促销，1满减，2满额送抵扣券，3秒杀
     */
    private String type;

    /**
     * 促销活动说明
     */
    private String description;

    /**
     * 满减条件，秒杀的话设置为0
     */
    private Long condition;

    /**
     * 满减后的折扣金额
     */
    private Long reduction;

    /**
     * 秒杀价格，如果是秒杀活动，需要填写
     */
    @Column(name = "seckill_price")
    private Long seckillPrice;

    /**
     * 满额送券，关联的优惠券id
     */
    @Column(name = "coupon_id")
    private Long couponId;

    /**
     * 作用的目标sku的id拼接，以','拼接
     */
    private String targets;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    /**
     * 获取促销活动id
     *
     * @return id - 促销活动id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置促销活动id
     *
     * @param id 促销活动id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取活动类型，目前可选的有：0没有促销，1满减，2满额送抵扣券，3秒杀
     *
     * @return type - 活动类型，目前可选的有：0没有促销，1满减，2满额送抵扣券，3秒杀
     */
    public String getType() {
        return type;
    }

    /**
     * 设置活动类型，目前可选的有：0没有促销，1满减，2满额送抵扣券，3秒杀
     *
     * @param type 活动类型，目前可选的有：0没有促销，1满减，2满额送抵扣券，3秒杀
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取促销活动说明
     *
     * @return description - 促销活动说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置促销活动说明
     *
     * @param description 促销活动说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取满减条件，秒杀的话设置为0
     *
     * @return condition - 满减条件，秒杀的话设置为0
     */
    public Long getCondition() {
        return condition;
    }

    /**
     * 设置满减条件，秒杀的话设置为0
     *
     * @param condition 满减条件，秒杀的话设置为0
     */
    public void setCondition(Long condition) {
        this.condition = condition;
    }

    /**
     * 获取满减后的折扣金额
     *
     * @return reduction - 满减后的折扣金额
     */
    public Long getReduction() {
        return reduction;
    }

    /**
     * 设置满减后的折扣金额
     *
     * @param reduction 满减后的折扣金额
     */
    public void setReduction(Long reduction) {
        this.reduction = reduction;
    }

    /**
     * 获取秒杀价格，如果是秒杀活动，需要填写
     *
     * @return seckill_price - 秒杀价格，如果是秒杀活动，需要填写
     */
    public Long getSeckillPrice() {
        return seckillPrice;
    }

    /**
     * 设置秒杀价格，如果是秒杀活动，需要填写
     *
     * @param seckillPrice 秒杀价格，如果是秒杀活动，需要填写
     */
    public void setSeckillPrice(Long seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    /**
     * 获取满额送券，关联的优惠券id
     *
     * @return coupon_id - 满额送券，关联的优惠券id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 设置满额送券，关联的优惠券id
     *
     * @param couponId 满额送券，关联的优惠券id
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取作用的目标sku的id拼接，以','拼接
     *
     * @return targets - 作用的目标sku的id拼接，以','拼接
     */
    public String getTargets() {
        return targets;
    }

    /**
     * 设置作用的目标sku的id拼接，以','拼接
     *
     * @param targets 作用的目标sku的id拼接，以','拼接
     */
    public void setTargets(String targets) {
        this.targets = targets;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}