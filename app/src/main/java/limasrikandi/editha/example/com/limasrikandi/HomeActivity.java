package limasrikandi.editha.example.com.limasrikandi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void DaftarKlinik(View view) {
        Intent intent = new Intent(HomeActivity.this,DaftarKlinik.class);
        startActivity(intent);
    }

    public void HomeTreatment(View view) {
        Intent intent = new Intent(HomeActivity.this, HomeTreatment.class);
        startActivity(intent);
    }
}
