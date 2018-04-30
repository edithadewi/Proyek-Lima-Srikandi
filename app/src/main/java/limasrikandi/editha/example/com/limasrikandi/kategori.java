package limasrikandi.editha.example.com.limasrikandi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class kategori extends Activity implements AdapterView.OnItemSelectedListener {

    private String mSpinnerLabel = "";  //mendefinisikan callback pilihan untuk spinner
    private Spinner c;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);


        Spinner spin = (Spinner) findViewById(R.id.kategori_spinner);
        if (spin != null) {
            spin.setOnItemSelectedListener(this);  //tetapkan listener-nya
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.kategori_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        c = (Spinner) findViewById(R.id.kategori_spinner);

        // Mengaplikasikan adapter ke spinner
        if (spin != null) {
            spin.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void Pilih(View view) {

        String test = c.getSelectedItem().toString();

        if (test.equalsIgnoreCase("Wajah")) {
            Toast.makeText(this, "Anda Memilih Treatment Untuk Wajah", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Wajah.class);   //Membuat Intent untuk memulai aktivitas baru
            startActivity(intent);
        } else if (test.equalsIgnoreCase("Badan")) {
            Toast.makeText(this, "Anda Memilih Treatment Untuk Badan", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Badan.class);   //Membuat Intent untuk memulai aktivitas baru
            startActivity(intent);
        } else if (test.equalsIgnoreCase("Paket Wajah dan Badan")) {
            Toast.makeText(this, "Anda Memilih Treatment Untuk Wajah dan Badan", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, BadanWajah.class);   //Membuat Intent untuk memulai aktivitas baru
            startActivity(intent);
        }
    }











}
