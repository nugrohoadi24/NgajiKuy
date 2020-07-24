package com.example.ngajikuy;

import java.util.ArrayList;

public class DataMasjid {
    public static String[][] data = new String[][]{
            {"Masjid Al Azhar Summarecon", "Masjid Al Azhar - Sumarecon, Bekasi\n" +
                    "Jl. Bulevar Utara Blok L, Marga Mulya, Bekasi Utara, Kota Bekasi.", "https://notanescapee.files.wordpress.com/2014/06/img_6871.jpg", "Tetap Istiqomah Saat Ditimpa Musibah", "Ustadz Maududi Abdullah, Lc.", "Kamis, 1 Agustus 2019\n" + "Bada Ashar - Selesai"},

            {"Masjid Al Ihsan PTM VJS", "Masjid Al Ihsan - PTM VJS\n" +
                    "Perumahan Pondok Timur Mas, Jalan Pondok Jingga Mas IV Blok E2, Jaka Setia, Bekasi Selatan.","https://s.republika.co.id/uploads/images/inpicture_slide/kajian-quran-and-sunnah-solution-_170312170525-873.jpg", "Al-Quran Sunnah Solution", "Ustadz Adi Hidayat, Lc.MA.", "Kamis, 1 Agustus 2019\n" + "Bada Maghrib - Selesai"},

            {"Masjid Jogokariyan", "Masjid Jogokariyan Yogyakarta\n" +
                    "Jl. Jogokaryan No.36, Mantrijeron, Kec. Mantrijeron, Kota Yogyakarta, Daerah Istimewa Yogyakarta.", "https://kabarkota.com/wp-content/uploads/2019/01/20190131_204512.png", "Seputar Orang Tua & Kelahiran Rasulullah", "Ustadz Salim A. FIllah", "Sabtu, 3 Agustus 2019\n" + "Bada Ashar - Selesai"},

            {"Masjid Salman ITB", "Masjid Salman Institut Teknologi Bandung\n" +
                    "Jl. Ganesa No.7, Lb. Siliwangi, Kecamatan Coblong, Kota Bandung, Jawa Barat.", "https://cdn.akurat.co/images/uploads/akurat_20170514_RM6Z4R.jpg", "Kaum 'AAD yang Melupakan Sejarah", "Ustadz Muhammad Jamaluddin, Lc.MA", "Kamis, 1 Agustus 2019\n" + "Bada Maghrib - Selesai"},

            {"Masjid PUSDAI Bandung", "Masjid Pusat Dakwah Islam Kota Bandung\n" +
                    "Jl. Diponegoro No.63, Cihaur Geulis, Kec. Cibeunying Kaler, Kota Bandung, Jawa Barat.","https://qoobah.co.id/wp-content/uploads/2018/10/Masjid-PUSDAI1-600x400.jpg", "Yakin Siap Menikah ?", "Ustadz Abu Takeru", "Selasa, 30 Juli 2019\n" + "Bada Maghrib - Selesai"},

            {"Masjid Al Lathiif Shift", "Masjid Al Lathiief Pemuda Hijrah\n" +
                    "Jl. Saninten No.2, Cihapit, Kec. Bandung Wetan, Kota Bandung, Jawa Barat.","https://bagoessidharta.files.wordpress.com/2015/08/wpid-p_20150731_125420_1_1.jpg", "Pesan Trend Pemuda", "Ustadz Hanan Attaki, Lc.", "Rabu, 31 Juli 2019\n" + "Bada Isya - Selesai"},

            {"Masjid Agung Sunda Kelapa", "Majid Agung Sunda Kelapa Jakarta\n" +
                    "Jl. Taman Sunda Kelapa No.16, RT.6/RW.4, Menteng, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta","https://kontraktorkubahmasjid.com/wp-content/uploads/2017/12/Masjid-Agung-Sunda-Kelapa-3.png", "Membawa Keluarga Menuju Surga", "Ustadz Bendri Jaisurahman", "Jumat, 2 Agustus 2019\n" + "Bada Isya - Selesai"},

            {"Masjid At Tin", "Masjid At Tin TMII\n"+
                    "Jl. Taman Mini I No.3, RW.3, Pinang Ranti, Kec. Makasar, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta.","https://situsbudaya.id/wp-content/uploads/2018/01/Ini-Dia-5-Fakta-Seputar-Masjid-At-Tin-yang-Menarik-untuk-Diketahui.jpg", "[MABIT] - Kunci Keluarga Dalam Pemikiran Abad 21", "Ustadz Akmal Sjafril", "Sabtu, 27 Juli 2019\n" + "Bada Ashar - Selesai"},

            {"Masjid Istiqlal", "Masjid Istiqlal Jakarta\n" +
                    "Jl. Taman Wijaya Kusuma, Ps. Baru, Kecamatan Sawah Besar, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta.","https://cdn1-production-images-kly.akamaized.net/n8uNqIv9lZ3PJVYw-8rfy8DZotE=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/925193/original/054708200_1436525200-6-Masjid-Megah-Istiqlal.jpg", "Be A Great Millenial Muslimah", "Sherly Annavita\n" + "Oki Setiana Dewi\n" + "Dewi Sandra\n" + "Ustadzah Nabila\n" + "Fenita Arie", "Ahad, 21 Juli 2019\n" + "07.00 - Selesai"},

            {"Masjid Agung Al Azhar", "Masjid Agung Al Azhar BLOK M\n" +
                    "Jl. Sisingamangaraja, RT.2/RW.1, Selong, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta.","https://kontraktorkubahmasjid.com/wp-content/uploads/2017/12/masjid-al-azhar.png", "Muslim Billionare", "Dr. Andhyka Sedyawan\n" + "Randy Saputra (Presiden Jejaring Masjid Titik Cahaya)\n" + "Ustadz Hendy Irawan Saleh", "Ahad, 4 Agustus 2019\n" + "Bada Dzuhur - Selesai"},
    };

    public static ArrayList<Masjid>getListData(){
        ArrayList<Masjid> list = new ArrayList<>();
        for (String[] aData : data) {
            Masjid masjid = new Masjid();
            masjid.setMasjid(aData[0]);
            masjid.setAlamat(aData[1]);
            masjid.setGambar(aData[2]);
            masjid.setMateri(aData[3]);
            masjid.setPemateri(aData[4]);
            masjid.setWaktu(aData[5]);

            list.add(masjid);
        }
        return list;
    }
}
