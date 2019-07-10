package com.deepmodi.adsappforyoutube;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init ads
        adView = (AdView)findViewById(R.id.ad_view);
        MobileAds.initialize(this,"ca-app-pub-3940256099942544/6300978111");
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);
    }
}
