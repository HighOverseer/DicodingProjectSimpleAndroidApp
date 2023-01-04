package com.fajar.dicodingprojectsimpleandroidapp.Constant

import com.fajar.dicodingprojectsimpleandroidapp.DataModel.UKM
import com.fajar.dicodingprojectsimpleandroidapp.R

object ukm {
    fun getAllUkm():ArrayList<UKM>{
        val listUKM = ArrayList<UKM>()
        for(i in nama.indices){
            listUKM.add(
                UKM(logo[i], nama[i], deskripsi[i], visi[i], misi[i], favorite[i])
            )
        }
        return listUKM
    }

    val mapToNumber = mapOf<String, Int>(
        "Neo Telemetri" to 0,
        "AIESEC" to 1,
        "Genta Andalas" to 2,
        "HIPMI PT Unand" to 3,
        "KOPMA Unand" to 4,
        "KOSBEMA Unand" to 5,
        "KSR PMI Unit Unand" to 6,
        "MAPALA Unand" to 7,
        "Resimen Mahasiswa (Menwa)" to 8,
        "Pandekar" to 9,
        "Pengenalan Hukum dan Politik (PHP)" to 10,
        "PIKA" to 11,
        "PIKMAG" to 12,
        "Pramuka Unand" to 13,
        "FKI Rabbani" to 14,
        "Andalas Sinematografi" to 15,
        "UKM Penalaran Unand" to 16,
        "Unit Kegiatan Olahraga (UKO)" to 17,
        "Unit Kegiatan Seni (UKS)" to 18
    )

    val nama = listOf(
        "Neo Telemetri",
        "AIESEC",
        "Genta Andalas",
        "HIPMI PT Unand",
        "KOPMA Unand",
        "KOSBEMA Unand",
        "KSR PMI Unit Unand",
        "MAPALA Unand",
        "Resimen Mahasiswa (Menwa)",
        "Pandekar",
        "Pengenalan Hukum dan Politik (PHP)",
        "PIKA",
        "PIKMAG",
        "Pramuka Unand",
        "FKI Rabbani",
        "Andalas Sinematografi",
        "UKM Penalaran Unand",
        "Unit Kegiatan Olahraga (UKO)",
        "Unit Kegiatan Seni (UKS)"
    )

    val logo = listOf(
        R.drawable.neo,
        R.drawable.aiesec,
        R.drawable.genta,
        R.drawable.hipmi,
        R.drawable.kopma,
        R.drawable.kosbema,
        R.drawable.ksrpmi,
        R.drawable.mapala,
        R.drawable.menwa,
        R.drawable.pandekar,
        R.drawable.php,
        R.drawable.pika,
        R.drawable.pikmag,
        R.drawable.pramuka,
        R.drawable.rabbani,
        R.drawable.sinema,
        R.drawable.ukmp,
        R.drawable.uko,
        R.drawable.uks
    )

    val deskripsi = listOf(
        "Neo Telemetri adalah UKM yang bergerak di bidang teknologi dan informasi. Neo Telemetri memiliki tiga divisi Operasional, yaitu divisi Pemrograman, divisi Sistem Komputer dan Jaringan (SKJ), dan divisi Multimedia dan Design (MMD). Ketiga divisi operasional memiliki masing-masing sub divisi. Pemrograman memiliki sub divisi Web Programming, Mobile Programming, Desktop Programming, dan Machine Learning. Sistem Komputer dan Jaringan memiliki sub divisi System Engineering dan Network Engineering. Multimedia dan Design memiliki sub divisi Video Editing, UI/UX dan 3D.",
        "AIESEC merupakan organisasi internasional, tersebar di 126 negara, yang bergerak dibidang kepemimpinan dan dijalankan oleh pemuda. AIESEC bersifat not for profit dan non political. AIESEC menjembatani isu sosial kepada seluruh elemen masyarakat untuk memberikan dampak positif dalam kehidupan sehari-hari",
        "Unit Kegiatan Pers Mahasiswa (UKPM) Genta Andalas bertujuan untuk mengembangkan wawasan, memunculkan kepekaan lingkungan, dan menjadi kontrol sosial dalam masyarakat kampus. Resmi berdiri pada tanggal 16 Oktober 1986, Genta Andalas menerbitkan berita dalam bentuk tabloid, elektronik tabloid, serta portal berita yang meng-update berita setiap hari.",
        "HIPMI PT UNAND merupakan suatu unit kegiatan mahasiswa di Universitas Andalas yang bergerak di bidang kewirausahaan dansebagai media serta fasilitator dalam meningkatkan jiwa entrepreneur muda di kalangan mahasiswa.",
        "Koperasi Mahasiswa Universitas Andalas (KOPMA Unand) merupakan Unit Kegiatan Mahasiswa (UKM) yang bergerak dibidang perkoperasian, memiliki usaha yang berbadan hukum, yang bertujuan untuk menyejahterakan anggotanya. Tidak hanya itu, Kopma Unand juga memiliki peran sebagai lembaga mahasiswa yang memiliki wadah kaderisasi kepemimpinan bagi mahasiswa",
        "Unit Kegiatan Mahasiswa Komite Siaga Bencana Mahasiswa Universitas Andalas (KOSBEMA UNAND) merupakan suatu organisasi mahasiswa yang bergerak dibidang pendidikan, pelatihan dan pengabdian dalam pengurangan risiko bencana sesuai dengan Tri Dharma Perguruan Tinggi.",
        "Merupakan salah satu Unit Kegiatan Mahasiswa (UKM) yang berada di kampus Universitas Andalas, tepatnya di gedung pusat kegiatan mahasiswa (PKM) lantai II, yang bergerak di bidang kepalangmerahan, serta mempunyai tugas untuk mengemban misi kemanusiaan selaras dengan Tri Dharma Perguruan Tinggi dan Prinsip-prinsip Dasar Gerakan Internasional Palang Merah dan Bulan Sabit Merah.",
        "MAPALA UNAND merupakan UKM yang bergerak di bidang olahraga alam bebas dan pelestarian lingkungan hidup. 4 divisi Mapala Unand : Rimba Gunung, Olahraga Air, Gua (Caving), Panjat Tebing MAPALA UNAND sebagai salah satu UKM di Universitas Andalas melaksanakan Bina Bakat Minat dan Kepemimpinan ini bertujuan untuk menarik minat mahasiswa baru untuk bergabung dalam bidang Kepecintaalaman. Selain itu juga untuk memperkenalkan organisasi MAPALA UNAND serta mengajak mereka untuk aktif dalam organisasi. Kegiatan ini dilaksanakan dalam bentuk pemberian materi dalam ruangan mengenai pengenalan organisasi MAPALA UNAND, pengenalan 4 Divisi yang ada di MAPALA UNAND serta penjelasan materi kepemimpinan secara virtual melalui zoom meeting. Timeline Kegiatan BBMK MAPALA UNAND : • Pendaftaran peserta BBMK MAPALA UNAND : 1 -4 November 2021 • Pendaftaran Ulang / Verifikasi data peserta : 5 November 2021 • Kegiatan BBMK MAPALA UNAND (2 hari) : 20 – 21 November 2021 melalui virtual room zoom meeting.",
        "Menwa (resimen mahasiswa) merupakan salah satu UKM yang ada di perguruan tinggi se-Indonesia yang bergerak di bidang ilmu pengetahuan dan ilmu keprajuritan. Semboyan Menwa Indonesia adalah Widya Castrena Dharma Siddha yang artinya Penyempurnaan pengabdiaan dengan ilmu pengetahuan dan ilmu keprajuritan. Menwa bukanlah militer, tetapi Menwa berada dibawah naungan TNI dan bekerja berdasarkan KB 4 Menteri (Keputusan Bersama Empat Menteri).",
        "UKM Pandekar merupakan suatu wadah bagi Mahasiswa dalam menyalurkan minat dan bakat dalam bidang organisasi dan beladiri dan kesadaran akan bela almamater. Organisasi yang menaungi delapan beladiri terkemuka, yaitu Karate, Tarung Derajat, Taekwondo, Wushu, Kempo, PSTD Indonesia, Tapak Suci Putera Muhammadiyah, dan Seiki Kai Aikido.",
        "Ukm Pengenalan hukum dan politik universitas andalas merupakan organisasi berasas pergerakan dan memiliki peran dalam hal pendidikan politik dan hukum dilingkungan unand dan masyarakat sekitar. Berdiri pada tanggal 12 juni 2003 merupakan organisasi Mahasiswa setingkat universitas andalas, ukm Pengenalan hukum dan politik biasa disingkat ukm php memiliki slogan yaitu \"berpikir, bergerak, atau mati ditempat",
        "UKM Pengembangan Ilmu Kandungan Al-Quran (PIKA) Adalah Lembaga Ekstrakurikuler atau Unit Kegiatan Mahasiswa yang bergerak dalam Bidang Seni Baca Tulis Al-Quran. Lembaga ini bersinergis dengan Universitas Andalas dalam membentuk Kader dan Kafilah MTQ secara teratur dan terprogram yang Mampu bersaing dengan Universitas di Indonesia melalui pengadaan Pelatihan Seni Baca dan Tulis Alquran.",
        "PIKMAG adalah layanan informasi dan konseling dari, oleh, dan untuk remaja. Tujuannya adalah Meningkatkan informasi, pengembangan, pelestarian nilai-nilai sosial dan moral terhadap permasalahan HIV-AIDS, NAPZA, Kesehatan Reproduksi Remaja (TRIAD KRR) melalui pelayanan informasi dan konseling.",
        "Salam Pramuka! Unit Kegiatan Mahasiswa Pramuka Gudep Padang 06.067-06.068 Univeristas Andalas adalah Organisasi kepramukaan yang dikenal dengan RACANA SWARNADWIPA didirkan pada tanggal 1 September 1986 di Pulau Belibis Solok oleh Kakak Fachry Sulaiman selaku dan rekan rekan. Gerakan pramuka merupakan salah satu wadah yang tepat untuk membina generasi muda yang dibekali dengan bekal pengetahuan dan keterampilan baik untuk membina dirinya, satuan ataupun berpartisipasi dalam lingkungan masyarakat seperti tertuang dalam Tri Bina Gerakan Pramuka dan Tri Dharma Perguruan Tinggi Dalam pembentukan karakter, Gerakan Pramuka Gugus Depan Padang 06.067-06.068 Racana Putera Puteri Swarnadwipa Universitas Andalas bertujuan menciptakan seorang mahasiswa dan pemuda pemudi yang aktif ditengah-tengah masyarakat tanpa melupakan kewajibannya sebagai manusia yang unggul dalam softskill. Lokasi Sekre : PKM Unand, Lt.1, Sayap Kanan Viva Swarnadwipa!",
        "UKM FKI Rabbani Unand merupakan unit kegiatan mahasiswa yang bergerak di bidang kerohanian. UKM FKI Rabbani memiliki hubungan koordinasi dengan Forum Studi Islam (FSI) di setiap fakultas. UKM ini lebih menekankan kegiatannya kepada pendalaman pemahaman ajaran Islam dan berupaya untuk melaksanakannya secara kaffah",
        "Andalas Sinematografi berbentuk Unit Kegiatan Mahasiswa yang bergerak dibidang film dan fotografi dan mempunyai tiga divisi yaitu PSDO (Pengembangan dan Mempunyai Daya Organisasi), produksi, dan fotografi.",
        "UKM Penalaran Unand yang terletak di Lt II gedung PKM Unand, Limau Manis merupakan lembaga mahasiswa yang bergerak dibidang kepenulisan ilmiah dan berpartisipasi dalam bidang kepenulisan. Kegitan UKM Penalaran Unand diantaranya yaitu workshop Program Kreatifitas Mahasiswa (PKM), kegiatan lomba LKTI, Lomba essay, bedah jurnal, bedah buku, seminar nasional dan internasional.",
        "Unit Kegiatan Olahraga Universitas Andalas ( UKO UNAND ) adalah sebuah unit kegiatan mahasiswa ( UKM ) yang bergerak di bidang olahraga. UKO UNAND ini mempunyai 10 divisi olahraga, diantaranya Futsal, Sepak Bola, Bola Voli, Bola Basket, Sepak Takraw, Bulu Tangkis, Tenis Meja, Tenis Lapangan, Catur, dan Panahan.",
        "Unit Kegiatan Seni Universitas Andalas adalah unit kegiatan mahasiswa yang bergerak dalam bidang kesenian. UKS Unand memiliki 5 (lima) divisi yaitu, Divisi Vokal (Andalaswara), Divisi Teater (Rumah Teduh), Divisi Musik (Harpa Music Studio), Divisi Tari (Andalas Seruni Dance) dan Divisi Seni Rupa (Saroman)."

    )

    val visi =  listOf(
        "Mewujudkan kampus Universitas Andalas yang berwawasan teknologi informasi",
        "We strive to achieve peace and fulfillment of humankind's potential",
        "1. Menampung dan menyalurkan aspirasi civitas akademika Universitas Andalas\n" +
                "2. Membentuk masyarakat ilmiah yang penuh cita- cita luhur, mencintai, dan menjunjung tinggi nilai- nilai kebenaran, keadilan serta kemanusiaan\n" +
                "3. Mewujudkan terciptanya mahasiswa yang kritis, objektif, berinisiatif, dan kreatif sebagai insan pengabdi yang bertanggung jawab terhadap Tuhan Yang Maha Esa, rakyat, bangsa, dan negara",
        "Mewujudkan HIPMI PT UNAND sebagai organisasi wirausahawan muda yang kolaboratif dan inovatif",
        "Menjadikan Koperasi Mahasiswa Universitas Andalas sebagai organisasi terkemuka, profesional, mandiri, dan sebagai inkubator pengembangan usaha dalam mensejahterakan anggota berdasarkan prinsip koperasi",
        "Menjadi unit kegiatan mahasiswa dalam pengurangan resiko bencana yang memiliki reputasi nasional dan internasional",
        "Menjadikan UKM KSR PMI Unit UNAND lebih baik dan menjadi wadah untuk seluruh anggota dalam kegiatan kemanusiaan",
        "Membawa MAPALA UNAND sebagai organisasi yang unggul, mandiri, serta berprestasi.",
        "Resimen Mahasiswa Batalyon 101 Mahawira Universitas Andalas sebagai wadah pendidikan, pembangunan jiwa kepemimpinan dan karakter yang handal dan profesional dalam melaksanakan setiap kegiatan khususnya dalam bidang Pertahanan dan Keamanan kampus yang berlandaskan kepada Pancasila, UUD 1945, Panca Dharma Satya, dan Tri Dharma Perguruan Tinggi.",
        "Menjadi organisasi beladiri yang memiliki integritas tinggi dan terdepan dalam prestasi kebeladirian maupun keorganisasian.",
        "Menjadi wadah dalam mengembangkan pengetahuan hukum dan politik yang sehat khususnya di kalangan mahasiswa dan masyarakat pada umumnya",
        "Membentuk pribadi mahasiswa yang kreatif, inovatif dan berkompeten dalam bidang ilmu-ilmu Alquran, serta berprestasi pada kancah Musabaqah Tilawatil Quran.",
        "Sebagai pusat informasi dan konseling yang ramah remaja dan menjadi sahabat remaja",
        "Menciptakan pramuka dan pemuda pemudi yang aktif ditengah-tengah masyarakat tanpa melupakan kewajibannya sebagai manusia unggul dalam softskill yang berkualitas dan memiliki kemandirian .",
        "Mewujudkan kesolidan internal UKM FKI Rabbani UNAND dari aspek manajemen dan SDM serta menjadikan LDK mengakar kuat di kalangan civitas akademika kampus.",
        "Visi dari UKM Andalas Sinematografi adalah mewujudkan mahasiswa yang kreatif, inovatif dan berprestasi dalam kompetensi Sinematografi dan Fotografi yang mampu mengikuti perkembangan IPTEK.",
        "Terbinanya mahasiswa yang berpikir analisis, kritis dan berkarakter mulia demi terwujudnya Tri Dharma perguruan tinggi.",
        "Menjadikan UKO UNAND sebagai organisasi olahraga yang terkemuka dan bermartabat dalam mengembangkan prestasi olahraga Universitas Andalas.",
        "UKS Unand adalah wadah penciptaan dan penempaan seniman intelektual yang berbudaya di Indonesia."
    )

    val misi = listOf(
        "1. Membentuk pribadi mandiri yang menguasai teknologi informasi di Universitas Andalas\n" +
                "2. Sebagai wadah kegiatan perencanaan, pengorganisasian dan pelaksanaan kegiatan teknologi informasi di Universitas Andalas\n" +
                "3. Meningkatkan intelektual civitas akademika di bidang teknologi informasi\n" +
                "4. Membudayakan profesionalisme kerja\n" +
                "5. Menjadi motor penggerak teknologi informasi di Universitas Andalas\n" +
                "6. Menumbuhkan rasa memiliki pada civitas akademika terhadap kegiatan yang diadakan oleh UKM Neo Telemetri\n" +
                "7. Mewujudukan Tri Dharma Perguruan Tinggi dengan berlandaskan teknologi informasi",
        "We place our confidence in youth as the key to unlock a better future. We believe that leadership is the fundamental solution and it can be developed in anyone",
        "1. Menerbitkan media mahasiswa Genta Andalas\n" +
                "2. Mengadakan kegiatan-kegiatan lain yang menunjang tujuan UKPM Genta Andalas\n" +
                "3. Menjalani kerja sama dengan berbagai pihak yang tidak bertentangan dengan Anggaran Dasar/Anggaran Rumah Tangga UKPM Genta Andalas",
        "1. Meningkatkan solidaritas HIPMI PT UNAND dengan nilai-nilai kekeluargaan dan professionalitas\n" +
                "2. Menjalin hubungan dan kerjasama yang baik dengan seluruh stakeholder dari internal dan eksternal kampus\n" +
                "3. Meningkatkan pengetahuan, kemampuan dan keterampilan kewirausahaan\n" +
                "4. Optimalisasi media digital sebagai saluran edukasi dan informasi guna meningkatkan minat dan jiwa kewirausahaan",
        "1.Meningkatkan kualitas sumber daya anggota yang lebih berkomitmen\n" +
                "2. Meningkatkan kesadaran anggota akan peran dan kewajibannya\n" +
                "3. Mentransformasikan Kopma Unand menghadapi revolusi industri 4.0\n" +
                "4. Menerapkan sistem keuangan yang transparansi dan akuntabilitas\n" +
                "5. Menyelenggarakan atau mengikuti program pelatihan dan pengembangan usaha bagi anggota\n" +
                "6. Mengoptimalkan kegiatan formal dan informal untuk menjalin hubungan yang harmonis dengan seluruh stakeholder\n" +
                "7. Mengoptimalkan penggunaan media sosial Kopma Unand dalam menyampaikan informasi kepada seluruh stakeholder",
        "1. Meningkatkan kapasitas anggota dalam mengurangi risiko bencana\n" +
                "2. Melakukan pengkajian yang terkait dengan pengurangan risiko bencana\n" +
                "3. Melaksanakan pengabdian kepada masyarakat terkait dengan pengurangan risiko bencana\n" +
                "4. Mengembangkan unit kegiatan mahasiswa (UKM) kebencanaan yang efektif dan efisien dalam pengurangan risiko bencana\n" +
                "5. Mengikuti dan mengadakan kegiatan yang berskala Nasional maupun Internasional dalam pengurangan risiko bencana",
        "1. Meningkatan kualitas kompetensi dan karakter kepalangmerahan UKM KSR PMI Unit Universitas Andalas\n" +
                "2. Mengoptimalkan kinerja pengurus terkait jalannya organisasi UKM KSR PMI Unit Universitas Andalas\n" +
                "3. Menjaga hubungan baik dengan relawan maupun pihak-pihak eksternal UKM KSR PMI Unit Universitas Andalas\n" +
                "4. Menggiatkan proker serta promosi di sosial media UKM KSR PMI Unit Universitas Andalas\n" +
                "5. Meningkatkan kapasitas dan kapabilitas UKM KSR PMI Unit Universitas Andalas",
        "1. Membekali Pengurus dan Personil Aktif dengan ilmu keorganisasian, moral serta sikap agar menjadi organisasi yang kokoh dan bertanggung jawab dalam menjalankan kewajiban\n" +
                                "2. Memfasilitasi Kepengurusan sebelumnya menyelesaikan PR Kepengurusan\n"  +
                                "3. Meningkatkan prestasi MAPALA UNAND" +
                "4. Meningkatkan publikasi kegiatan MAPALA UNAND dimedia sosial\n" +
                                "5. Mengangkatkan suatu event",
        "1. Mencari dan mempersiapkan Sumber Daya Manusia yang unggul, bertaqwa kepada Tuhan Yang Maha Esa, mempunyai integritas, dan sadar akan hari depan bangsa dan negara\n" +
                "2. Mempersiapkan personil yang berwawasan luas, sikap disiplin yang tinggi, serta fisik dan mental yang kuat agar mampu melaksanakan Tridarma Perguruan Tinggi serta dapat menamkan dasar-dasar kepemimpinan dengan tetap mengacu pada tujuan pendidikan nasional\n" +
                "3. Melaksanakan, mempersiapkan, dan menyusun seluruh potensi anggota Resimen Mahasiswa untuk memantapkan ketahanan nasional, dengan melaksanakan usaha dan atau kegiatan bela negara\n" +
                "4. Menjalin dan membina hubungan kerjasama yang baik dengan berbagai pihak demi eksistensi Batalyon 101 Mahawira dan demi tercapainya persatuan dan kesatuan\n" +
                "5. Memberikan reward dan Punishment secara konsekuen dan konsisten kepada personil yang memiliki prestasi baik dibidang akademik maupun non akademik.",
        "1. Mengembangkan kemampuan dan minat mahasiswa dalam ilmu, seni, dan falsafah beladiri\n" +
                "2. Memadukan kemampuan berorganisasi dengan ilmu beladiri serta menciptakan dan mengembangkan jiwa kepemimpinan dikalangan mahasiswa di Universitas Andalas\n" +
                "3. Mengembangkan kepekaan terhadap gejala-gejala sosial dalam lingkungan intra-universitas maupun dalam masyarakat\n" +
                "4. Meningkatkan kesadaran akan bela almamater",
        "1. Menumbuhkan rasa peduli terhadap dinamika kehidupan hukum dan politik mahasiswa di lingkungan Universitas Andalas\n" +
                "2. Memberikan kontribusi terhadap pembelajaran hukum dan pengetahuan politik mahasiwa dalam masyrakat\n" +
                "3. Mensosialisasi perkembangan hukum dan politik kepada mahasiswa dan masyarakat\n" +
                "4. Menentang kebijakan yang tidak berpihak kepada mahasiswa dan masyarakat",
        "1, Mewadahi mahasiswa dalam upaya peningkatan pemahaman dan penghayatan isi kandungan Alquran dikalangan mahasiswa dalam rangka meningkatkan keimanan dan ketaqwaan kepada Allah SWT.\n" +
                "2. Meningkatkan kreatifitas, minat dan bakat mahasiswa dalam membaca, menulis, dan memahami isi dan kandungan Alquran.\n" +
                "3. Mewadahi mahasiswa dalam pembinaan dan pelatihan seni baca tulis dan ilmu kandungan Alquran di tingkat Universitas.",
        "1. Menjadikan UKM PIKMAG Unand sebagai suatu komitmen melalui pemberdayaan layanan informasi dan konseling dari, oleh, dan untuk remaja\n" +
                "2. Peningkatan akses informasi dan pengembangan terhadap penyelesaian masalah seputar isu substansi Program GenRe melalui pelayanan informasi dan konseling\n" +
                "3. Peningkatan penanaman dan pelestarian nilai-nilai sosial dan moral serta menyadari pentingnya informasi dan kepedulian terhadap isu seputar substansi Program GenRe\n" +
                "4. Menjadi wadah remaja untuk mengaktualisasikan diri",
        "Meningkatkan Tribina Gerakan Pramuka dan Tridarma Perguruan Tinggi serta meningkatkan kuantitas dan kualitas anggota dibidang organisasi dan kepramukaan, sehingga menghasilkan pramuka yang mengamalkan tri satya dan dasa dharma dalam kehidupan sehari-hari",
        "1. Mewujudkan LDK UKM FKI Rabbani UNAND sebagai salah satu sarana pengkaderan, pembinaan potensi dan penjagaaan mahasiswa muslim\n" +
                "2. Menjadikan LDK sebagai sentral komunikasi dan koordinasi LDF\n" +
                "3. Membangun jaringan yang solid dengan LDK Daerah dan LDK Nasional\n" +
                "4. Mampu melakukan fungsi pendampingan kepada LDK\n" +
                "5. Melakukan Syiar Islam yang efektif menjangkau seluruh civitas akademika\n" +
                "6. Merespon masalah-masalah umat secara masif dan proaktif",
        "1. Mewadahi kreativitas dan bakat seni yang ada pada mahasiswa Universitas Andalas\n" +
                "2. Mewadahi perkembangan soft skill mahasiswa dalam bidang Sinematografi dan Fotografi ataupun kegiatan kreatif lainnya yang relevan dengan UKM ini\n" +
                "3. Menciptakan mahasiswa yang memiliki karakter akademis, organisatoris dan memiliki integritas yang tinggi terhadap skill yang dimiliki",
        "1. Membina pribadi mahasiswa yang intelektual sesuai dengan Tri Dharma perguruan tinggi.\n" +
                "2. Mengembangkan potensi kreatif, keilmuan, sosial dan budaya\n" +
                "3. Mewadahi pengembangan ilmu pengetahuan dan teknologi bagi bangsa dan negara\n" +
                "4. Usaha-usaha lain yang sesuai dengan identitas dan azas organisasi serta berguna untuk mencapai tujuan",
        "1. Meningkatkan prestasi olahraga Universitas Andalas melalui pembinaan sumberdaya olahraga yang efektif dan efisien\n" +
                "2. Membangun karakter Olahragawan, guna menciptakan Atlet yang berprestasi di lingkungan UNAND khususnya dan Nasional umumnya.\n" +
                "3. Menciptakan kerjasama yang optimal dengan organisasi- organisasi terkait untuk mendukung eksistensi organisasi\n" +
                "4. Menciptakan karakter pemimpin yang berakhlak mulia yang didasarkan pada pendidikan yang berkualitas",
        "1. Menjadi organisasi kesenian berbasis kampus yang stabil dan mapan\n" +
                "2. Berlaku sebagai penggali dan penjaga kelestarian budaya lokal\n" +
                "3. Menjadi wahana kajian seni dan budaya di Indonesia"
    )

    val favorite = mutableListOf(
        0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
    )
}