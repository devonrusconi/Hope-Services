package app.z0nen.slidemenu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Devon on 10/22/2014.
 */
public class Volunteer extends Fragment implements View.OnClickListener {
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.volunteer, container, false);
        View button = rootview.findViewById(R.id.button);
        button.setOnClickListener(this);
        return rootview;
    }

    public void onClick(View v) {
        // Bags (grocery, shopping, trash)
        if (v.getId() == R.id.button) {
            WebView browser = (WebView) rootview.findViewById(R.id.webview);
            browser.loadUrl("https://www.sagepayments.net/sagenonprofit/shopping_cart/forms/donate.asp?M_id=434219234047");
        }
    }
}
