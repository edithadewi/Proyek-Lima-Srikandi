package limasrikandi.editha.example.com.limasrikandi;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class HomeTreatment extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Marker klinik1;
    Marker klinik2;
    Marker klinik3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        klinik1 = mMap.addMarker(new MarkerOptions().position(sydney).title("Klenik 1"));
        klinik2 = mMap.addMarker(new MarkerOptions().position(new LatLng(-10, 123)).title("Klenik 2"));
        klinik3 = mMap.addMarker(new MarkerOptions().position(new LatLng(-34, 189)).title("Klenik 3"));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.equals(klinik1)){
                    Toast.makeText(HomeTreatment.this, "Klinik 1", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomeTreatment.this, kategori.class);
                    startActivity(intent);
                }
                if (marker.equals(klinik2)){
                    Toast.makeText(HomeTreatment.this, "Klinik 2", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomeTreatment.this, kategori.class);
                    startActivity(intent);
                }
                if (marker.equals(klinik3)){
                    Toast.makeText(HomeTreatment.this, "Klinik 3", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomeTreatment.this, kategori.class);
                    startActivity(intent);
                }
                return false;
            }
        });
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}
