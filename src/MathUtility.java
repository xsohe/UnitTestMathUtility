package com.src;

public class MathUtility {

    public static double HitungLuasPersegiPanjang(double panjang, double lebar) {
        if(panjang < 0 || lebar < 0) {
            throw new IllegalArgumentException("Panjang dan lebar harus bernilai positif");
        }

        return panjang * lebar;
    }

    public static double HitungHargaSetelahDiskon(double harga, double diskon) {
        if(harga < 0 || diskon < 0 || diskon > 100) {
            throw new IllegalArgumentException("Harga dan diskon harus bernilai positif, dan diskon maksimal 100%");
        }

        return harga - (harga * (diskon / 100));
    }

}
