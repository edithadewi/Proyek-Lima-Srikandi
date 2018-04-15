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
    public void onClickOrder(View view) {

        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("no_tel","082218340189");
        startActivity(intent);

    }
}