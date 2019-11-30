package com.example.simplevent;

import java.util.ArrayList;

public class VenueData {

    private static String[] venueNames = {
            "University Club UGM Hotel & Convention",
            "Eastparc Hotel",
            "The Alana Yogyakarta",
            "Jogja National Museum",
            "Gedung Balai Pamungkas",
            "Grha Sabha Pramana",
            "Gedung PKKH UGM",
            "Jogja Expo Center",
            "GOR Amongrogo",
            "GOR UNY"
    };

    private static String[] venueDetails = {
            "Gadjah Mada University\n" +
                    "Hotel & Convention, Jl. Pancasila Bulaksumur No.2\n" +
                    "(0274) 563461",
            "Laksda Adisucipto KM. 6.5, Jl. Kapas No.1\n" +
                    "(0274) 4932000",
            "Jl. Palagan Tentara Pelajar Km. 7, Sariharjo, Ngaglik\n" +
                    "(0274) 888800",
            "Jl. Prof. DR. Ki Amri Yahya No.1\n" +
                    "(0274) 586105",
            "Jl. Atmosukarto No.1\n" +
                    "0815-6603-008",
            "Universitas Gadjah Mada\n" +
                    "Jl. Sosio Humaniora No.1, Karang Malang, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Gadjah Mada University\n" +
                    "Kampus Universitas Gadjah Mada (UGM Jalan Pancasila, Bulaksumur\n" +
                    "(0274) 557317",
            "Jalan Janti, Jl. Wonocatur\n" +
                    "(0274) 451001",
            "Stadium\n" +
                    "(0274) 374916",
            "Jl. Colombo No.1\n" +
                    "(0274) 561484",
    };

    private static int[] venueImages = {
            R.drawable.ucugm,
            R.drawable.eastparc,
            R.drawable.alana,
            R.drawable.jnm,
            R.drawable.bp,
            R.drawable.gsp,
            R.drawable.pkkh,
            R.drawable.jec,
            R.drawable.amongrogo,
            R.drawable.goruny,
    };

    static ArrayList<Venue> getListData() {
        ArrayList<Venue> list = new ArrayList<>();
        for (int position = 0; position < venueNames.length; position++){
            Venue venue = new Venue();
            venue.setName(venueNames[position]);
            venue.setDetail(venueDetails[position]);
            venue.setPhoto(venueImages[position]);
            list.add(venue);
        }
        return list;
    }

}
