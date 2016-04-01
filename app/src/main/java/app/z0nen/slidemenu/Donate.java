package app.z0nen.slidemenu;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Devon on 10/22/2014.
 */
public class Donate extends Fragment implements View.OnClickListener {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.donate_layout, container, false);
        View button = rootview.findViewById(R.id.donate);
        button.setOnClickListener(this);
        return rootview;
    }

    public void onClick(View v) {
        // Bags (grocery, shopping, trash)
        if (v.getId() == R.id.donate) {
            Fragment objFragment = new Pickup();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, objFragment)
                    .commit();
        }
    }
}
