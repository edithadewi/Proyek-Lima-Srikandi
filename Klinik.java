package limasrikandi.editha.example.com.limasrikandi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Klinik extends AppCompatActivity {

    private final LinkedList<String> kliniks = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();


    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klinik);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, kliniks, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            kliniks.add("Klinik 1");
            kliniks.add("Klinik 2");
            kliniks.add("Klinik 3");





            // memanggil foto yang ada di drawable
            photos.add(R.drawable.klinik1);
            photos.add(R.drawable.klinik2);
            photos.add(R.drawable.klinik3);

        }
    }
}
