package com.wk.shopp.pojo;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "product")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer"})
@Document(indexName = "shopp",type = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @ManyToOne
    @JoinColumn(name="cid")
    private Category category;

    //如果既没有指明 关联到哪个Column,又没有明确要用@Transient忽略，那么就会自动关联到表对应的同名字段
    private String name;
    private String subtitle;
    private float originalprice;
    private float promoteprice;
    private int stock;
    private Date createdate;
    @Transient
    private ProductImage firstProductImage;
    @Transient
    private List<ProductImage> productSingleImages;
    @Transient
    private List<ProductImage> productDetailImages;
    @Transient
    private int reviewCount;
    @Transient
    private int saleCount;

    public ProductImage getFirstProductImage() {
        return firstProductImage;
    }

    public void setFirstProductImage(ProductImage firstProductImage) {
        this.firstProductImage = firstProductImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public float getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(float originalprice) {
        this.originalprice = originalprice;
    }

    public float getPromoteprice() {
        return promoteprice;
    }

    public void setPromoteprice(float promoteprice) {
        this.promoteprice = promoteprice;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List <ProductImage> getProductSingleImages() { return productSingleImages; }

    public void setProductSingleImages(List <ProductImage> productSingleImages) { this.productSingleImages = productSingleImages; }

    public List <ProductImage> getProductDetailImages() { return productDetailImages; }

    public void setProductDetailImages(List <ProductImage> productDetailImages) { this.productDetailImages = productDetailImages; }

    public int getReviewCount() { return reviewCount; }

    public void setReviewCount(int reviewCount) { this.reviewCount = reviewCount; }

    public int getSaleCount() { return saleCount; }

    public void setSaleCount(int saleCount) { this.saleCount = saleCount; }

    @Override
    public String toString() {
        return "Product [id=" + id + ", category=" + category + ", name=" + name + ", subTitle=" + subtitle
                + ", originalPrice=" + originalprice + ", promotePrice=" + promoteprice + ", stock=" + stock
                + ", createDate=" + createdate + ", firstProductImage=" + firstProductImage + ", reviewCount="
                + reviewCount + ", saleCount=" + saleCount + "]";}
}
