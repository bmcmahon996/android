package org.gc.musicshopclient;

public class MusicShopData {

    private int id;
    private String product;

    private String type;

    private int price;

    private int strings;

    private String manufacturer;

    public int stock;


        public String toString()
        {
            return id + " " + product + " " + type + " " + price + " " + strings + " " + manufacturer + " " + stock+ "";
        }

}
