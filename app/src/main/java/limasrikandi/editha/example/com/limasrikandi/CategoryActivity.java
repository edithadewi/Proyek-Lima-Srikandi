package limasrikandi.editha.example.com.limasrikandi.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import limasrikandi.editha.example.com.limasrikandi.Adapter.LayananAdapter;
import limasrikandi.editha.example.com.limasrikandi.Model.LayananClass;
import limasrikandi.editha.example.com.limasrikandi.R;

public class CategoryActivity extends AppCompatActivity {
    CardView cvWajah, cvBadan, cvWajahdanBadan;
    RecyclerView rvLayanan;
    LayananAdapter adapter;
    List<LayananClass> listLayanan = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        cvWajah = findViewById(R.id.cvWajah);
        cvBadan = findViewById(R.id.cvBadan);
        cvWajahdanBadan = findViewById(R.id.cvWajahdanBadan);

        rvLayanan = findViewById(R.id.rvLayanan);
        rvLayanan.setLayoutManager(new LinearLayoutManager(this));
        adapter = new LayananAdapter(this, listLayanan);
        rvLayanan.setAdapter(adapter);

        cvWajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWajah();
            }
        });

        cvBadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBadan();
            }
        });

        cvWajahdanBadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWajahdanBadan();
            }
        });
    }

    private void setWajah(){
        listLayanan.clear();

        listLayanan.add(new LayananClass("Wajah", "Chemical peeling", "Rp 120.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah", "Dermabrasi", "Rp 300.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah", "HIFU", "Rp 1.000.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah", "Facial Gold", "Rp 200.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah", "IPL Acne", "Rp 125.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah", "IPL Whitening", "Rp 125.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah", "IPL Rejuvenation", "Rp 125.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        adapter.notifyDataSetChanged();
    }

    private void setBadan(){
        listLayanan.clear();

        listLayanan.add(new LayananClass("Badan","Lulur Bali", "Rp 130.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Badan","Lulur Gold", "Rp 130.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Badan","Refleksi Badan", "Rp 100.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Badan","Wajah", "Rp 30.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA


        adapter.notifyDataSetChanged();
    }

    private void setWajahdanBadan(){
        listLayanan.clear();
        listLayanan.add(new LayananClass("Wajah dan Badan","Facial + Lulur", "Rp 330.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah dan Badan","IPL Acne + Lulur", "Rp 310.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah dan Badan","Dermabrasi + Lulur", "Rp 230.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA
        listLayanan.add(new LayananClass("Wajah dan Badan","HIFU + Lulur", "Rp 1.130.000")); // TODO: <<  UNTUK MENAMBAH LIST LAYANAN CUKUP COPY CODE DISEBELAH INI- KEMUDIAN UBAH NAMA DAN HARGA

        adapter.notifyDataSetChanged();
    }
}
