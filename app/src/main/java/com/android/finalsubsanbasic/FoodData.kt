package com.android.finalsubsanbasic

import com.android.finalsubsanbasic.Model.Food

object FoodData {
    private val NamaMakan = arrayOf(
        "Sate",
        "Bakso",
        "Soto",
        "Nasi Pecel",
        "Gado-Gado",
        "Gudeg",
        "Rendang",
        "Pempek",
        "Kerak Telor",
        "Rawon"
    )

    private val DetailMakan = arrayOf(
        "200 gram kacang tanah goreng\n" +
                "5 siung bawang merah\n" +
                "3 siung bawang putih\n" +
                "2 buah kemiri, bagi dua\n" +
                "4 buah cabai merah keriting\n" +
                "70 ml santan (kemasan)\n" +
                "170 ml air\n" +
                "Gula secukupnya\n" +
                "Garam secukupnya\n" +
                "Minyak goreng secukupnya",
                "4 siung bawang putih, haluskan.\n" +
                "2 sdm bawang merah goreng.\n" +
                "telur 1 butir.\n" +
                "40 g es batu, hancurkan.\n" +
                "1 kg daging ayam, tanpa tulang, giling.\n" +
                "50 g tepung kanji.\n" +
                "½ sdt lada bubuk.\n" +
                "1 sdt garam.",
        "    4 siung bawang putih, haluskan\n" +
                "    2 sdm bawang merah goreng\n" +
                "    telur 1 butir\n" +
                "    40 g es batu, hancurkan\n" +
                "    1 kg daging ayam, tanpa tulang, giling\n" +
                "    50 g tepung kanji\n" +
                "    ½ sdt lada bubuk\n" +
                "    1 sdt garam\n" +
                "    2 l air\n",
         "Ayam 1 ekor" +
                "    Kol 200 g, iris tipis\n" +
                "    Tauge 200 g, bersihkan dan kukus hingga matang\n" +
                "    kentang 4 buah, bersihkan, iris tipis\n" +
                "    Tomat 2 buah, bagi menjadi 6 bagian\n" +
                "    Soun 50 g, rendam dengan air panas\n" +
                "    Telur ayam 3 butir, rebus hingga matang kemudian iris menjadi 4 bagian\n" +
                "    Air 2 L\n" +
                "    Bawang goreng 50 g\n" +
                "    Daun jeruk 3 lembar\n" +
                "    Serai 2 batang\n" +
                "    Daun salam 2 lembar\n" +
                "    Daun bawang 1 batang, iris halus\n" +
                "    Lengkuas 25 g\n" +
                "    Minyak goreng 2 sdm\n" +
                "    Kunyit 2 cm\n" +
                "    Kemiri 4 buah\n" +
                "    Jahe 15 g\n" +
                "    Bawang merah 3 buah\n" +
                "    Bawang putih 2 siung\n" +
                "    Merica ½ sdt\n" +
                "    Garam 2 sdm\n" +
                "    jeruk nipis 1 buah, bagi menjadi 8 bagian\n",
        "600 gram kacang tanah\n" +
                "500 gram gula merah\n" +
                "1cm kencur\n" +
                "2 gram asam jawa\n" +
                "500 gram cabai merah\n" +
                "7 lembar daun jeruk\n" +
                "1 sdt garam\n" +
                "4 siung bawang putih\n" +
                "cabai rawit secukupnya (sesuai selera)",
        "Kubis/ Kol sebanyak 150 gram diiris-iris kecil\n" +
                "Bayam sebanyak 175 gram\n" +
                "Mentimun sebanyak 200 gram diiris-iris kecil\n" +
                "Tauge sebanyak 175 gram\n" +
                "Kentang rebus sebanyak 300 gram diiris dadu\n" +
                "Kacang panjang sebanyak 200 gram\n" +
                "Tahu kuning sebanyak 300 gram digoreng dan diiris dadu\n" +
                "Telur rebus dibelah menjadi dua\n" +
                "Kerupuk dan emping\n" +
                "Bawang goreng",
        "Nangka muda saya pake 1 plastik beli udah potongan\n" +
                "5 telur ayam\n" +
                "4 tahu putih di potong segitiga\n" +
                "2 bungkus santan kara\n" +
                "1 lt Air sekitar\n" +
                "2 lembar daun jati\n" +
                "Bumbu cemplung\n" +
                "Daun salam\n" +
                "Sereh\n" +
                "Laos\n" +
                "Bumbu halus\n" +
                "Bawang merah\n" +
                "Bawang putih\n" +
                "Kemiri sangrai\n" +
                "Tumbar ",
         "5 butir kemiri\n" +
                "    6 siung bawang putih\n" +
                "    100 g cabe merah besar\n" +
                "    12 butir bawang merah\n" +
                "    100 g cabe merah keriting\n" +
                "    2 cm jahe, bakar\n" +
                "    2 cm lengkuas\n" +
                "    3 cm kunyit, bakar\n" +
                "    1/2 sdm ketumbar\n" +
                "    2 sdt garam\n" +
                "    1/2 sdt pala\n" +
                "    1 sdt jintan, sangrai\n" +
                "    Penyedap rasa secukupnya\n",
          "250 gram tepung\n" +
                "250 gram tepung aci\n" +
                "3 butir telur\n" +
                "1 sdt garam\n" +
                "Air secukupnya(panas)\n" +
                "Penyedap rasa\n" +
                "Minyak goreng\n" +
                "Mentimun sebagai pelengkap\n" +
                "Kuah:\n" +
                "Bawang putih\n" +
                "Asam jawa\n" +
                "Terasi\n" +
                "Gula aren\n" +
                "Cabe rawit ",
           "250 gram tepung\n" +
                "250 gram tepung aci\n" +
                "3 butir telur\n" +
                "1 sdt garam\n" +
                "Air secukupnya(panas)\n" +
                "Penyedap rasa\n" +
                "Minyak goreng\n" +
                "Mentimun sebagai pelengkap\n" +
                "Kuah:\n" +
                "Bawang putih\n" +
                "Asam jawa\n" +
                "Terasi\n" +
                "Gula aren\n" +
                "Cabe rawit ",
            "1 kg daging sapi\n" +
                "2 lt air (air kaldu)\n" +
                "seruas jahe, geprek\n" +
                "Bumbu Halus :\n" +
                "7 bh kluwek\n" +
                "10 siuang bawang merah\n" +
                "4 siung bawang putih\n" +
                "seruas jahe\n" +
                "seruas kunyit\n" +
                "2 sdt merica\n" +
                "1 sdm ketumbar sangrai\n" +
                "10 bh cabe keriting (me: 4 bh)\n" +
                "10 bh cabe rawit (me: gak pake)\n" +
                "2 btg sereh, geprek\n" +
                "10 lbr daun jeruk\n" +
                "secukupnya garam dan gula\n" +
                "Telor asin\n" +
                "Toge pendek\n" +
                "Kerupuk (me: emping) "
    )
    private  val foodimages = intArrayOf(

        R.drawable.sate,
        R.drawable.bakso ,
        R.drawable.soto ,
        R.drawable.pecel,
        R.drawable.gafo,
        R.drawable.gudeg ,
        R.drawable.rendag,
        R.drawable.pempek,
        R.drawable.kerak,
        R.drawable.rawon
    )
val listData:ArrayList<Food>
    get(){
        val list= arrayListOf<Food>()
        for(position in foodimages.indices){
            val food =Food()
            food.NamaMakanan= NamaMakan[position]
            food.Photo = foodimages[position]
            food.DetailMakanan = DetailMakan[position]
            list.add(food)
        }
        return list
    }
}