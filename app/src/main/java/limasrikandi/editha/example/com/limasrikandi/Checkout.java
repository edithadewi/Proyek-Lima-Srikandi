package limasrikandi.editha.example.com.limasrikandi.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import limasrikandi.editha.example.com.limasrikandi.R;

public class CheckoutActivity extends AppCompatActivity {

    TextView tvLayanan, tvKategori, tvHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Intent i = getIntent();

        tvLayanan = findViewById(R.id.tvLayanan);
        tvKategori = findViewById(R.id.tvKategori);
        tvHarga = findViewById(R.id.tvHarga);

        tvKategori.setText("Kategori: " + i.getStringExtra("kategori"));
        tvLayanan.setText("Layanan: " +i.getStringExtra("layanan"));
        tvHarga.setText("Total Harga: " + i.getStringExtra("harga"));

        Button btnSelesai = findViewById(R.id.btnSelesai);
        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CheckoutActivity.this, "Checkout berhasil!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
