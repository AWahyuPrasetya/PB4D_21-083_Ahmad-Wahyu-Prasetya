package com.example.praktikumm_modul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val universitaslist = listOf<Universitas>(
            Universitas(
                R.drawable.g1,
                nameUniversitas = "Universitas 11 Maret",
                descUniversitas = "Pada tanggal 11 Maret 1976, dengan dibacanya Surat Keputusan Presiden Republik Indonesia tentang pembukaan Universitas Negeri Surakarta Sebelas Maret, maka universitas ini resmi berdiri sebagai perguruan tinggi negeri di Surakarta.[1] Cikal bakal pendirian UNS dapat dirunut jejaknya sejak 1950-an.\n" +
                        "\n" +
                        "Pada masa itu, Surakarta telah memiliki keinginan untuk mendirikan sebuah universitas negeri sendiri, mengingat kota lain telah memiliki universitas yang umurnya bahkan telah mencapai puluhan tahun. Namun, akibat perang, penyatuan pemerintahan, kekeruhan arus politik, ekonomi rakyat rusak, dan lain-lainnya, rencana pembangunan universitas negeri di Surakarta belum dapat diwujudkan.\n" +
                        "\n" +
                        "Pada 1953, setelah semua kekacauan berakhir, timbul keinginan mewujudkan universitas itu kembali. Hal ini mengingat Surakarta sebagai pusat kebudayaan Jawa asli dan memiliki potensi yang besar di lapangan perguruan, baik tenaga pengajar dan siswanya. Panitia pendirian universitas pun dibentuk, dengan ketua Mohammad Saleh, Wali Kota Surakarta saat itu. Hanya saja, usaha ini gagal sebelum sempat dimulai. Penyebabnya adalah tidak adanya sumber keuangan baik dari pemerintah daerah dan pusat, timbulnya keinginan sementara golongan untuk mendirikan universitas swasta secara sendiri-sendiri, dan kurang mendapat simpati beberapa orang dari Universitas Gajah Mada. Adanya hambatan dan pembangunan yang sedang dilakukan di Kota Surakarta membuat gagasan pendirian itu pun lenyap. Hal itu ditambah pula dengan kegaduhan politik antarpartai yang berebut kekuasaan di pemerintahan."
            ),
            Universitas(
                R.drawable.w2,
                nameUniversitas = "Unair",
                descUniversitas = "Universitas Airlangga (Unair) Surabaya, juga menyimpan sejarah panjang dalam perjalanan pendidikan tinggi di Indonesia. Unair begitu kental dan berarti. Bukan saja dalam catatan sejarah pendidikan, juga peranannya dalam pergerakan dan sejarah kemerdekaan Indonesia. Sejarah Universitas Airlangga berawal dari cikal-bakal lembaga pendidikan Nederlands Indische Artsen School (NIAS) dan School Tot Opleiding van Indische Tandartsen (STOVIT). Masing-masing didirikan oleh pemerintah Hindia Belanda pada tahun 1913 dan 1928. Setelah di masa pergolakan kemerdekaan sempat terganggu kelancarannya, pada tahun 1948 pemerintah pendudukan Belanda mendirikan Tandheelkunding Institut yang merupakan cabang Universiteit Van Indonesie Jakarta, dan membuka kembali NIAS yang kemudian diberi nama Fakulteit der Geneeskunde, yang juga sebagai cabang Universiteit Van Indonesie, Jakarta."
            ),
            Universitas(
                R.drawable.w3,
                nameUniversitas = "UNESA",
                descUniversitas = "Universitas Negeri Surabaya (Unesa) tidak dapat dipisahkan dari bagian utuh perjalanan panjang pendidikan nasional. Dengan telah menghasilkan sekitar 80.000 lulusan, Unesa berani memosisikan diri sebagai salah satu penyelenggara pendidikan tinggi yang mampu merencanakan pengembangan untuk menyelenggarakan pendidikan yang bermutu, mengevaluasi diri untuk menyiapkan lulusan yang berdaya saing tinggi (nation competitiveness) dan berjiwa kewirausahaan (entrepreneurship), serta mengatur segala kegiatannya dalam suatu mekanisme organisiasi yang sehat (organizational health).\n" +
                        "Unesa harus mandiri (autonomy) sebagai sebuah Badan Hukum Pendidikan Pemerintah (BHPP) seperti yang diamanatkan oleh Undang-Undang Nomor 20/2003 tentang Sistem Pendidikan Nasional (UU Sisdiknas).\n" +
                        "\n" +
                        "Sejarah Unesa tidak dapat dipisahkan dari IKIP Surabaya yang dimulai sekitar tahun 1950. Berawal dari kursus B-I dan B-II bidang Ilmu Kimia dan Ilmu Pasti yang memanfaatkan sarana dan prasarana berupa ruang kelas dan laboratorium dari pendidikan Belanda, Hoogere Burger Schol (HBS). Kursus-kursus tersebut diselenggarakan di Surabaya untuk memenuhi kebutuhan tenaga guru setingkat SLTP dan SLTA. Kursus-kursus tersebut meliputi: (a) B-I dan B-II Kimia, (b) B-I dan BII Ilmu Pasti, (c) B-I Bahasa Inggris, (d) B-I Bahasa Jerman, (e) B-I Teknik, (f) B-I Pendidikan Jasmani, (g) B-I Ekonomi, (h) B-I Perniagaan, dan (i) B-I Ilmu Pesawat. Pada tahun 1957, kursus-kursus B-I dikelompokkan menjadi dua, yaitu (1) Kursus B-I Umum, yang meliputi Bahasa Inggris dan bahasa Jerman, dan (2) Kursus B-I Kejuruan, yang meliputi Kimia, Ilmu Pasti, Ekonomi, Perniagaan, Teknik, Pendidikan Jasmani, dan Ilmu Pesawat. Kursus-kursus tersebut berlangsung sampai tahun 1960."
            ),
            Universitas(
                R.drawable.w4,
                nameUniversitas = "ITS",
                descUniversitas = "Sejarah didirikannya Institut Teknologi Sepuluh Nopember berawal dari pengusulan pendirian Yayasan Perguruan Tinggi Teknik (YPTT) di Surabaya oleh dr. Angka pada Lustrum I PII Jawa Timur 10 November 1957. Pada tahun 1960, namanya berubah menjadi Institut Teknologi Sepuluh Nopember (ITS), dan satu tahun kemudian, resmi menjadi Perguruan Tinggi. Perubahan status ini juga disertai penambahan menjadi lima fakultas, yaitu Teknik Sipil, Teknik Mesin, Teknik Kimia, Teknik Elektro, dan Teknik Perkapalan.\n" +
                        "\n" +
                        "Di tahun 2002, ITS terdiri dari lima fakultas dan dua politeknik. Pada 2014, ITS ditetapkan sebagai Perguruan Tinggi Negeri Berbadan Hukum (PTNBH) berdasar Peraturan Pemerintah No. 83 Tahun 2014. ITS mengemban amanah baru yaitu mampu melakukan pengelolaan secara otonom di bidang akademik, norma dan kebijaksanaan operasional serta pelaksanaan organisasi, keuangan, kemahasiswaan, ketenagaan, serta sarana prasarana. Berdasarkan peraturan Rektor ITS No, 25 Tahun 2019 Tentang Organisasi dan Tata Kerja Fakultas di Lingkungan ITS, ITS saat ini memiliki 7 fakultas, 39 departemen, dan 82 program studi."
            ),
            Universitas(
                R.drawable.w1,
                nameUniversitas = "UTM",
                descUniversitas = "Universitas Trunojoyo Madura merupakan kelanjutan dari Universitas Bangkalan Madura (Unibang) yang \" berubah statusnya \" dari Perguruan Tinggi Swasta menjadi Perguruan Tinggi Negeri berdasarkan Keputusan Presiden (Keppres) RI Nomor 85 Tahun 2001 Tertanggal 5 Juli 2001. Peresmian berlangsung pada tanggal 23 Juli 2001. Dalam sambutannya KH. Abdurrahman Wahid sebagai Presiden Republik Indonesia pada waktu itu, mengatakan bahwa salah satu keinginan Masyarakat Madura untuk memiliki Universitas Negeri telah tercapai. Keinginan lainnya agar pulau Madura dihubungkan dengan pulau Jawa juga telah tercapai dengan diresmikannya Jembatan Suramadu pada tanggal 10 Juli 2009 oleh Presiden Republik Indonesia Susilo Bambang Yudhoyono.\n" +
                        "\n" +
                        "   Keberadaan Universitas Trunojoyo Madura seperti kondisinya yang ada saat ini, masih dalam tahap pembenahan-pembenahan mendasar, seperti renovasi gedung perkuliahan, kantor administrasi, kantor pusat maupun fakultas, dan prasarana kampus seperti instalasi listrik dan air serta sarana olahraga dalam kampus. Saat ini dilakukan pula upaya untuk melengkapi sarana laboratorium yang ada di semua fakultas."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_mobil)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = UniversitasAdapter(this, universitaslist){
            val intent = Intent (this, DetailUniversitasActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}