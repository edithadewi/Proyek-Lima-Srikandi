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

public class Kategori extends Activity implements AdapterView.OnItemSelectedListener {

    private String mSpinnerLabel = "";  //mendefinisikan callback pilihan untuk spinner
    private Spinner c;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);




}
