package com.leex.alg.JAVA8.lambda;

/**
 * @title: Mask
 * @Author LeeX
 * @Date: 2022/7/17 22:41
 * @Version 1.0
 */
public class Mask {
    public Mask(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
    public Mask(String brand, String type,double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    /**
     * 品牌
     */
    private String brand;
    /**
     * 类型
     */
    private String type;

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
