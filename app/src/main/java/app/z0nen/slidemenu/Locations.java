package app.z0nen.slidemenu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * Created by Devon on 3/19/2015.
 */
public class Locations extends Fragment implements View.OnClickListener {

    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.location_layout, container, false);
        View button = rootview.findViewById(R.id.gilroy);
        button.setOnClickListener(this);
        View button2 = rootview.findViewById(R.id.hollister);
        button2.setOnClickListener(this);
        View button3 = rootview.findViewById(R.id.mountainview);
        button3.setOnClickListener(this);
        View button4 = rootview.findViewById(R.id.fremont);
        button4.setOnClickListener(this);
        return rootview;
    }

    public void onClick(View v) {
        // Bags (grocery, shopping, trash)
        if (v.getId() == R.id.gilroy) {
            WebView browser = (WebView) rootview.findViewById(R.id.webview2);
            browser.loadUrl("https://www.google.com/maps/dir//8855+Murray+Ave,+Gilroy,+CA+95020/@37.0256442,-121.5720153,17z/data=!4m13!1m4!3m3!1s0x8091e3d7703bb2ad:0x3b2bfe70c19ee780!2s8855+Murray+Ave,+Gilroy,+CA+95020!3b1!4m7!1m0!1m5!1m1!1s0x8091e3d7703bb2ad:0x3b2bfe70c19ee780!2m2!1d-121.5720153!2d37.0256442?hl=en");
        }

        if (v.getId() == R.id.hollister) {
            WebView browser = (WebView) rootview.findViewById(R.id.webview2);
            browser.loadUrl("https://www.google.com/maps/dir//37482+Fremont+Blvd,+Fremont,+CA+94536/@37.557511,-122.0046442,17z/data=!4m13!1m4!3m3!1s0x808fbf9cce438b71:0x4cd32abb85b3458!2s37482+Fremont+Blvd,+Fremont,+CA+94536!3b1!4m7!1m0!1m5!1m1!1s0x808fbf9cce438b71:0x4cd32abb85b3458!2m2!1d-122.0046442!2d37.557511");
        }

        if (v.getId() == R.id.mountainview) {
            WebView browser = (WebView) rootview.findViewById(R.id.webview2);
            browser.loadUrl("https://www.google.com/maps/dir//460+E+Middlefield+Rd,+Mountain+View,+CA+94043/@37.3968502,-122.0561251,17z/data=!4m18!1m9!4m8!1m0!1m6!1m2!1s0x808fb7172fed8eef:0xfcf3307ba9486ff1!2s460+E+Middlefield+Rd,+Mountain+View,+CA+94043!2m2!1d-122.0561251!2d37.3968502!4m7!1m0!1m5!1m1!1s0x808fb7172fed8eef:0xfcf3307ba9486ff1!2m2!1d-122.0561251!2d37.3968502?hl=en");
        }

        if (v.getId() == R.id.fremont) {
            WebView browser = (WebView) rootview.findViewById(R.id.webview2);
            browser.loadUrl("https://www.google.com/maps/dir//460+E+Middlefield+Rd,+Mountain+View,+CA+94043/@37.3968502,-122.0561251,17z/data=!4m18!1m9!4m8!1m0!1m6!1m2!1s0x808fb7172fed8eef:0xfcf3307ba9486ff1!2s460+E+Middlefield+Rd,+Mountain+View,+CA+94043!2m2!1d-122.0561251!2d37.3968502!4m7!1m0!1m5!1m1!1s0x808fb7172fed8eef:0xfcf3307ba9486ff1!2m2!1d-122.0561251!2d37.3968502?hl=en");
        }

    }
}
