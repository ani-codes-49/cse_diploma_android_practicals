package com.e.exp;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements LocationListener {

    protected LocationManager locationmanager;
    protected Location location;
    TextView txtlat;

    static protected String latitude, longitutde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);

        txtlat = findViewById(R.id.textview1);
        locationmanager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},0);
            return;
        }

        locationmanager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);

    }

    @Override
    public void onLocationChanged(Location location){

        latitude=String.valueOf(location.getLatitude());
        longitutde=String.valueOf(location.getLongitude());

        txtlat.setText("Lattitude: "+ location.getLatitude() +"\n"+ "Longitude: "+ location.getLongitude());

    }

    @Override
    public void onProviderDisabled(String provider){

        Log.d("Latitude","Disable");

    }

    @Override

    public void onProviderEnabled(String provider){

        Log.d("Latitude","Enabled");

    }

    @Override

    public void onStatusChanged(String provider, int status, Bundle extras){

        Log.d("Latitude","Status");

    }

    public static double getLat(){

        return Double.parseDouble(latitude);

    }

    public static double getLong(){

        return Double.parseDouble(longitutde);

    }

}
