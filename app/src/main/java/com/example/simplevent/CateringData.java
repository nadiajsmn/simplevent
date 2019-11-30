package com.example.simplevent;

import java.util.ArrayList;

public class CateringData {

    private static String[] cateringNames = {
            "H.Kasmu",
            "Anna Catering",
            "Khalila Catering",
            "Citra Catering",
            "Cemara Catering",
            "Karunia Catering",
            "Cita Catering",
            "Yuri Catering",
            "Tiara Catering",
            "Salsa Catering and Bakery"
    };

    private static String[] cateringDetails = {
            "",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "k",
    };

    private static int[] cateringImages = {
            R.drawable.kasmu,
            R.drawable.anna,
            R.drawable.khalila,
            R.drawable.citra,
            R.drawable.kasmu,
            R.drawable.kasmu,
            R.drawable.kasmu,
            R.drawable.kasmu,
            R.drawable.kasmu,
            R.drawable.kasmu,
    };

    static ArrayList<Catering> getListData() {
        ArrayList<Catering> list = new ArrayList<>();
        for (int position = 0; position < cateringNames.length; position++){
            Catering catering = new Catering();
            catering.setName(cateringNames[position]);
            catering.setDetail(cateringDetails[position]);
            catering.setPhoto(cateringImages[position]);
            list.add(catering);
        }
        return list;
    }

}
