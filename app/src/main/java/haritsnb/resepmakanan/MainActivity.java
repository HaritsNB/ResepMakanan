package haritsnb.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView jdl;
    TextView desk;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jdl = (TextView)findViewById(R.id.judul_resep);
        desk = (TextView)findViewById(R.id.deskripsi_resep);
        rv = (RecyclerView)findViewById(R.id.rv_resep);

        LinearLayoutManager obj = new LinearLayoutManager(this);
        rv.setLayoutManager(obj);

        String[] jdl_resep = {
                "Resep Nasi Goreng Kambing",
                "Resep Soto Betawi",
                "Resep Kepiting Lada Hitam",
                "Resep Pecak Tempe",
                "Resep Udang Petai Balado"
        };

        String[] deks_resep = {
                "Apakah anda penggemar masakan nasi goreng kambing? Kali ini kami ingin berbagi resep nasi goreng kambing yang enak untuk anda. Sebaiknya daging kambing direbus dahulu dengan irisan jahe agar lebih empuk dan menghilangkan bau prengus khas kambing. Apabila anda menyukai citarasa yang lebih kuat, bisa ditambahkan bumbu gulai kambing yang dijual dalam bentuk bubuk siap pakai di toko-toko swalayan. Dengan warna kuning kecoklatan dan aroma yang tajam.",
                "Bosan dengan hidangan Lebaran yang itu-itu saja? Anda bisa mencoba hidangan soto khas nusantara yang begitu beragam jumlahnya. Salah satunya yang kami sajikan berikut ini resep Soto Betawi. Soto Betawi termasuk salah satu hidangan dengan beragam isi, dar mulai daging, jerohan, kentang, hingga tomat dan taburan emping.",
                "Kali ini kami menyajikan olahan kepiting yang sudah sangat terkenal, resep kepiting lada hitam. Perpaduan rasa gurih dari kepiting dan pedas menggigit dari lada hitam sangatlah nikmat disantap dengan sepiring nasi panas. Untuk hasil yang sangat memuaskan, pilih kepiting yang masih segar atau bila memungkinkan masih hidup.",
                "Resep kali ini adalah Resep Pecak Tempe. Pecak Tempe merupakan makanan tradisional khas dari Jawa Timur. Pecak Tempe merupakan tempe yang diolah dengan cara di masak bersama santan dan diberi tambahan terasi. Unik bukan? Rasanya lezat dan otentik, penasaran kan? Langsung saja ulik resep dibawah ini yuk…",
                "Udang merupakan salah satu makanan laut yang paling banyak diminati oleh hampir setiap orang. Selain kaya akan kandungan gizi, rasanya pun lezat. Udang bisa diolah menjadi berbagai macam masakan, salah satunya adalah Resep Udang Petai Balado."
        };

        int[] img_resep = {
                R.drawable.gbr1,
                R.drawable.gbr2,
                R.drawable.gbr3,
                R.drawable.gbr4,
                R.drawable.gbr5
        };

        String[] detail_resep = {
                "Detailny coyBahan:\n" +
                        "- 500 gram nasi\n" +
                        "- 200 gram daging kambing\n" +
                        "- 1 buah jahe, iris tebal\n" +
                        "- 2 buah cabai merah, iris\n" +
                        "- 1 buah cabai rawit, iris\n" +
                        "- 1 buah daun bawang, potong kasar\n" +
                        "\n" +
                        "Bumbu:\n" +
                        "- 2 siung bawang putih, cincang\n" +
                        "- 3 butih bawang merang, iris tipis\n" +
                        "- 2 sdm kecap manis\n" +
                        "- 1 sdm kecap asin\n" +
                        "- 1 sdt merica bubuk\n" +
                        "- ¼ sdt terasi\n" +
                        "\n" +
                        "Pelengkap:\n" +
                        "- Bawang goreng\n" +
                        "- Acar mentimun\n" +
                        "- Irisan tomat\n" +
                        "\n" +
                        "Cara membuat :\n" +
                        "- Rebus daging kambing bersama dengan irisan jahe sampai empuk. Angkat kemudian potong dadu. Sisihkan\n" +
                        "- Tumis bawang putih, bawang merah, cabai merah dan cabai rawit sampai harum. Masukkan daging kambing. Aduk\n" +
                        "- Masukkan nasi, kecap manis, kecap asin, merica dan terasi. Aduk sampai bumbu tercampur rata.\n" +
                        "- Angkat dan sajikan bersama dengan pelengkap.",
                "Bahan-bahan:\n" +
                        "- 250 gr daging sandung lamur\n" +
                        "- 100 gr paru sapi\n" +
                        "- 100 gr babat sapi\n" +
                        "- 100 gr usus sapi\n" +
                        "\n" +
                        "Bumbu halus:\n" +
                        "- 2 buah cabai merah keriting\n" +
                        "- 3 butir bawang merah\n" +
                        "- 1 siung bawang putih\n" +
                        "- 1 sdt merica\n" +
                        "- 1 sdt jahe iris\n" +
                        "- ½ sdt jintan\n" +
                        "- 1 sdm garam\n" +
                        "- 2 lembar daun aalam\n" +
                        "- 1 batang serai, memarkan\n" +
                        "- 5 buah cengkeh\n" +
                        "\n" +
                        "Pelengkap saji:\n" +
                        "- 3 buah tomat, masing-masing potong 6\n" +
                        "- 2 buah kentang, kupas, goreng, potong dadu 2cm\n" +
                        "- 2 sdm daun bawang iris\n" +
                        "- Bawang merah goreng\n" +
                        "- 100 gr emping\n" +
                        "- 2 sdm daun seledri\n" +
                        "- Acar\n" +
                        "\n" +
                        "Cara membuat:\n" +
                        "- Rebus daging dengan 500ml air hingga empuk, angkat, tiriskan. Potong dadu 1cm, masukkan kembali ke air rebusan.\n" +
                        "- Rebus babat, paru, usus hingga empuk. Angkat, iris ukuran 2x2 cm.\n" +
                        "- Tumis semua bumbu hingga harum, masukkan ke dalam rebusan daging. Tambahkan santan dan kelapa sangrai giling. Masukkan irisan jerohan, dan didihkan kembali.\n" +
                        "- Siapkan mangkok soto, beri irisan kentanf dan tomat, tuangi kuah soto dan isinya. Taburi dengan daun bawang, seledri, emping dan bawang goreng. Sajikan panas.",
                "Bahan-bahan:\n" +
                        "- 3 sdm minyak goreng\n" +
                        "- 2 butir bawang merah, iris tipis\n" +
                        "- 2 siung bawah putih, iris tipis\n" +
                        "- 10 buah cabai merah besar, cincang halus\n" +
                        "- 3 sdm gula pasir\n" +
                        "- 2 sdm ebi sangrai, haluskan\n" +
                        "- 2 sdm lada hitam, haluskan\n" +
                        "- 2 sdm kecap manis\n" +
                        "- 2 sdm saus tiram\n" +
                        "- 1 sdm taoco\n" +
                        "- 1 sdt garam\n" +
                        "- 1 kg kepiting, rebus, masing-masing belah menjadi 2 bagian\n" +
                        "- 1 batang daun bawang, iris tipis\n" +
                        " \n" +
                        "Cara membuat:\n" +
                        "- Panaskan 3 sdm minyak goreng dalam wajan di atas api sedang, tumis bawang merah dan bawah putih hingga harum.\n" +
                        "- Masukkan cabai, gula, ebi, lada hitam, kecap, saus tiram, taoco dan garam, aduk rata.\n" +
                        "- Masukkan kepiting dan air, aduk dan masak hingga mendidih.\n" +
                        "- Teruskan mememasak sambil diaduk hingga bumbu meresap dan kuah mengental, angkat.\n" +
                        "- Pindahkan masakan ke dalam wadah saji, taburi daun bawang iris, sajikan selagi panas.",
                "Bahan:\n" +
                        "- 300 gram tempe potong 4 x 7 cm\n" +
                        "- 150 cc santan dari ½ butir kelapa\n" +
                        "\n" +
                        "Bumbu yang dihaluskan:\n" +
                        "- 5 buah cabai merah\n" +
                        "- 3 siung bawang putih\n" +
                        "- 2 cm kencur\n" +
                        "- ½ sendok the terasi\n" +
                        "- 1 sendok the garam\n" +
                        "- 1 sendok the gula pasir\n" +
                        "- 2 lembar daun jeruk purut\n" +
                        "\n" +
                        "Cara membuat:\n" +
                        "- Masak santan hingga mendidih.\n" +
                        "- Masukkan bumbu yang telah dihaluskan.\n" +
                        "- Aduk hingg rata.\n" +
                        "- Setelah kental angkat.\n" +
                        "- Panggang tempe diatas bara api hingga matang, kemudian angkat.\n" +
                        "- Siram tempe dengan bumbu santan, tekan-tekan tempe hingga agak hancur.\n" +
                        "- Hidangkan segera.",
                "Bahan-bahan:\n" +
                        "- 750 gram udang (ukuran kecil/sedang), bersihkan, buang kepalanya\n" +
                        "- 4 papan petai, kupas bersih\n" +
                        "- 2 sdm cabai merah giling\n" +
                        "- 2 buah tomat cincang halus\n" +
                        "- 10 butir bawang merah, iris halus\n" +
                        "- garam secukupnya\n" +
                        "- minyak secukupnya, untuk menggoreng dan menumis\n" +
                        "\n" +
                        "Cara membuat:\n" +
                        "- Panaskan minyak goreng (jangan terlalu banyak) di atas api sedang. Masukan udang, goreng hingga udang matang, angkat dan tiriskan.\n" +
                        "- Tumis bawang merah iris, cabai merah giling, tomat dan garam dengan menggunakan sedikit minyak sisa menggoreng hingga harum dan matang.\n" +
                        "- Masukan udang goreng dan petai, aduk-aduk hingga tercampur rata dan bumbu meresap. Angkat."
        };

        String[] title_detail = {
                "Resep Nasi Goreng Kambing",
                "Resep Soto Betawi",
                "Resep Kepiting Lada Hitam",
                "Resep Pecak Tempe",
                "Resep Udang Petai Balado"
        };

        ArrayList<ConstructorResep> objku =new ArrayList<>();
        for (int i = 0; i<jdl_resep.length; i++){
            ConstructorResep constructorResep = new ConstructorResep(jdl_resep[i],deks_resep[i],img_resep[i],detail_resep[i],title_detail[i]);
            objku.add(constructorResep);

        }
        AdapterResep adapterResep = new AdapterResep(this, objku);
        rv.setAdapter(adapterResep);
    }


}
