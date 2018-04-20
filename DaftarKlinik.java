package limasrikandi.editha.example.com.limasrikandi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.LinkedList;

public class DaftarKlinik extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> klinis = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;



    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_klinik);
    }
    public void clickKlinik1(View view) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("alamat_klinik","5 Srikandi (Skin Care) Telaga Bodas Bandung");
        intent.putExtra("no_tel","082218340189");
        intent.putExtra("photo",R.drawable.klinik1);
        startActivity(intent);
    }
    public void clickKlinik2(View view) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("alamat_klinik","5 Srikandi (Skin Care) Buah Batu Bandung");
        intent.putExtra("no_tel","081218340110");
        intent.putExtra("photo",R.drawable.klinik2);
        startActivity(intent);
    }
    public void clickKlinik3(View view) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("alamat_klinik","5 Srikandi (Skin Care) Cibiru Bandung");
        intent.putExtra("no_tel","081318340129");
        intent.putExtra("photo",R.drawable.klinik3);
        startActivity(intent);
    }
}
