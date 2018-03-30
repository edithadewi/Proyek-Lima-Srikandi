package limasrikandi.editha.example.com.limasrikandi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    TextView tvSplash;
    private static int splashInterval = 3000;   //Set waktu lamanya splashscreen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,    //Agar splashscreen ditampilkan full
                WindowManager.LayoutParams.FLAG_FULLSCREEN);                //Menghilangkan ActionBar di atas aplikasi

        setContentView(R.layout.activity_splash_screen);

        //Membuat Toast Nama dan NIM

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // menghubungkan activity splashscren ke main activity dengan intent
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);
                //jeda selesai Splashscreen agar tidak dapat kembali ke splashscreen dengan tombol back
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    }
}
