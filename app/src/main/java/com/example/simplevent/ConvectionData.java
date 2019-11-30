package com.example.simplevent;

import java.util.ArrayList;

public class ConvectionData {

    private static String[] convectionNames = {
            "NOV Konveksi",
            "TexcoKonveksi",
            "Diamond Konveksi Jogja",
            "Koncoveksi Konveksi",
            "Arto Convection",
            "INDO Konveksi",
            "Univershirt Jogja",
            "JFC Konveksi",
            "Warhole Convection",
            "Diseragam Konveksi"
    };

    private static String[] convectionDetails = {
            "Bantul Regency, Special Region of Yogyakarta\n" +
                    "0878-3866-2076",
            "Sleman Regency, Special Region of Yogyakarta\n" +
                    "0896-7159-0061",
            "Sleman Regency, Special Region of Yogyakarta\n" +
                    "0857-2651-9735",
            "Sleman Regency, Special Region of Yogyakarta\n" +
                    "0813-2718-9899",
            "Bantul Regency, Special Region of Yogyakarta\n" +
                    "0856-3330-071",
            "Sleman Regency, Special Region of Yogyakarta\n" +
                    "0811-2952-911",
            "Sleman Regency, Special Region of Yogyakarta\n" +
                    "0819-0370-0070",
            "Sleman Regency, Special Region of Yogyakarta\n" +
                    "0838-6948-1965",
            "Yogyakarta City, Special Region of Yogyakarta\n" +
                    "0856-4387-9273",
            "Sleman Regency, Special Region of Yogyakarta\n" +
                    "(0274) 4333304",
    };

    private static int[] convectionImages = {
            R.drawable.nov,
            R.drawable.texco,
            R.drawable.diamond,
            R.drawable.koncoveksi,
            R.drawable.arto,
            R.drawable.indo,
            R.drawable.uni,
            R.drawable.jfc,
            R.drawable.warhole,
            R.drawable.diseragam,
    };

    static ArrayList<Convection> getListData() {
        ArrayList<Convection> list = new ArrayList<>();
        for (int position = 0; position < convectionNames.length; position++){
            Convection convection = new Convection();
            convection.setName(convectionNames[position]);
            convection.setDetail(convectionDetails[position]);
            convection.setPhoto(convectionImages[position]);
            list.add(convection);
        }
        return list;
    }

}
