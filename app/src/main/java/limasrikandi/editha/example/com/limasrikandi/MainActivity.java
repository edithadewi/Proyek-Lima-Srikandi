package limasrikandi.editha.example.com.limasrikandi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ketika menu pada activity di buat
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //membuat menu dengan layout menu_main
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //Method yang dijalankan Ketika Item Dipilih
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Get id item yang dipilih
        int id = item.getItemId();
        //Kondisi yang dilakukan Jika Menu Settings Dipilih
        if (id== R.id.action_settings){
            //Membuat Intent Baru
            startActivity(new Intent(MainActivity.this, Setting.class));
            //Menutup Aktivitas Setelah Intent Dijalankan
            finish();
        }
        else if (id==R.id.action_pesanan){
            //Membuat Intent Baru
            startActivity(new Intent(MainActivity.this, Pesanan.class));
            //Menutup Aktivitas Setelah Intent Dijalankan
            finish();
        }
        else if (id==R.id.action_logout){

        }
        return true;
    }
}
