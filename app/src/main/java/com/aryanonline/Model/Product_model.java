package com.aryanonline.Model;


import java.io.Serializable;

public class Product_model implements Serializable {

    String product_id;
    String product_name;
    String product_description;
    String product_image;
    String category_id;
    String in_stock;
    String price;
    String unit_value;
    String unit;
    String increament;
    String title;
    String Mrp;
    String today_deals;
    String offers_cat;
    String deals_description;
    String offers_cat_desc;
    String emi;
    String warranty;
    String product_offer_image;
    String p_offer_description;
    String top_product_status;
    String stock;


    public String getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public String getProduct_image() {
        return product_image;
    }

    public String getCategory_id() {
        return category_id;
    }

    public String getIn_stock() {
        return in_stock;
    }

    public String getPrice() {
        return price;
    }

    public String getUnit_value() {
        return unit_value;
    }

    public String getUnit() {
        return unit;
    }

    public String getP_offer_description() {
        return p_offer_description;
    }

    public String getStock() {
        return stock;
    }

    public String getTop_product_status() {
        return top_product_status;
    }

    public String getProduct_offer_image() {
        return product_offer_image;
    }

    public String getEmi() {
        return emi;
    }

    public String getWarranty() {
        return warranty;
    }

    public String getOffers_cat_desc() {
        return offers_cat_desc;
    }

    public String getDeals_description() {
        return deals_description;
    }

    public String getOffers_cat() {
        return offers_cat;
    }

    public String getIncreament() {
        return increament;
    }

    public String getTitle() {
        return title;
    }

    public String getMrp() {
        return Mrp;
    }

    public String getToday_deals() {
        return today_deals;
    }
}
