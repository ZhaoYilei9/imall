package com.imall.pojo;

import javax.persistence.*;

@Table(name = "tb_specification")
public class TbSpecification {
    /**
     * 规格模板所属商品分类id
     */
    @Id
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * 规格参数模板，json格式
     */
    private String specifications;

    /**
     * 获取规格模板所属商品分类id
     *
     * @return category_id - 规格模板所属商品分类id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置规格模板所属商品分类id
     *
     * @param categoryId 规格模板所属商品分类id
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取规格参数模板，json格式
     *
     * @return specifications - 规格参数模板，json格式
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * 设置规格参数模板，json格式
     *
     * @param specifications 规格参数模板，json格式
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }
}