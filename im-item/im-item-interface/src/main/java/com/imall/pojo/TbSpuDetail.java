package com.imall.pojo;

import javax.persistence.*;

@Table(name = "tb_spu_detail")
public class TbSpuDetail {
    @Id
    @Column(name = "spu_id")
    private Long spuId;

    /**
     * 全部规格参数数据
     */
    private String specifications;

    /**
     * 特有规格参数及可选值信息，json格式
     */
    @Column(name = "spec_template")
    private String specTemplate;

    /**
     * 包装清单
     */
    @Column(name = "packing_list")
    private String packingList;

    /**
     * 售后服务
     */
    @Column(name = "after_service")
    private String afterService;

    /**
     * 商品描述信息
     */
    private String description;

    /**
     * @return spu_id
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * @param spuId
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * 获取全部规格参数数据
     *
     * @return specifications - 全部规格参数数据
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * 设置全部规格参数数据
     *
     * @param specifications 全部规格参数数据
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    /**
     * 获取特有规格参数及可选值信息，json格式
     *
     * @return spec_template - 特有规格参数及可选值信息，json格式
     */
    public String getSpecTemplate() {
        return specTemplate;
    }

    /**
     * 设置特有规格参数及可选值信息，json格式
     *
     * @param specTemplate 特有规格参数及可选值信息，json格式
     */
    public void setSpecTemplate(String specTemplate) {
        this.specTemplate = specTemplate;
    }

    /**
     * 获取包装清单
     *
     * @return packing_list - 包装清单
     */
    public String getPackingList() {
        return packingList;
    }

    /**
     * 设置包装清单
     *
     * @param packingList 包装清单
     */
    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    /**
     * 获取售后服务
     *
     * @return after_service - 售后服务
     */
    public String getAfterService() {
        return afterService;
    }

    /**
     * 设置售后服务
     *
     * @param afterService 售后服务
     */
    public void setAfterService(String afterService) {
        this.afterService = afterService;
    }

    /**
     * 获取商品描述信息
     *
     * @return description - 商品描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品描述信息
     *
     * @param description 商品描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }
}