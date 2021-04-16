package org.gc.musicshopclient;

public class MusicShopData {

    private int Id;
    private String Product;

    private String Type;

    private int Price;

    private int Strings;

    private String Manufacturer ;

    public int Stock;

        public String toString()
        {
            return Id + " " + Product + " " + Type + " " + Price + " " + Strings + " " + Manufacturer + " " + Stock;
        }

}
