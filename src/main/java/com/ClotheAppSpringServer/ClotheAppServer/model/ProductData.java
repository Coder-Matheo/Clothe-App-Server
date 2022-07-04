package com.ClotheAppSpringServer.ClotheAppServer.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
public class ProductData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String proName;
    private String proPrice;
    private String dateOff;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] imgProduct;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String getDateOff() {
        return dateOff;
    }

    public void setDateOff(String dateOff) {
        this.dateOff = dateOff;
    }

    public byte[] getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(byte[] imgProduct) {
        this.imgProduct = imgProduct;
    }


    @Override
    public String toString() {
        return "ProductData{" +
                "Id=" + Id +
                ", proName='" + proName + '\'' +
                ", proPrice='" + proPrice + '\'' +
                ", dateOff=" + dateOff +
                ", imgProduct=" + Arrays.toString(imgProduct) +
                '}';
    }
}
