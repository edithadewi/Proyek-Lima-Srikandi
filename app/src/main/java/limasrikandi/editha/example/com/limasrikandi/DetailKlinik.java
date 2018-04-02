package limasrikandi.editha.example.com.limasrikandi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailKlinik extends AppCompatActivity {

    TextView alamat_klinik, no_tel;
    ImageView logo_klinik;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_klinik);
    Intent intent = getIntent(); // mengambil data dari activity sebeleumnya
        String jalan = intent.getStringExtra("jalan");
        Integer telp = intent.getIntExtra("telp",0);
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+telp+photo);

        alamat_klinik= (TextView)findViewById(R.id.alamat);
        no_tel = (TextView)findViewById(R.id.no_hp);
        logo_klinik = (ImageView)findViewById(R.id.logo);

        alamat_klinik.setText(jalan);
        no_tel.setText(telp);
        logo_klinik.setImageResource(photo);
    }
}

