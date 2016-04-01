package app.z0nen.slidemenu;

import android.app.Fragment;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Home extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.home_layout, container, false);



        VideoView vv = (VideoView)this.rootview.findViewById(R.id.videoView);
        String uri = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.hope1;
        MediaController mc= new MediaController(getActivity());
        mc.setAnchorView(vv);
        vv.setMediaController(mc);
        vv.setVideoURI(Uri.parse(uri));

        vv.seekTo(150);
        vv.pause();


        VideoView vv2 = (VideoView)this.rootview.findViewById(R.id.videoView2);
        String uri2 = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.hope2;
        MediaController mc2= new MediaController(getActivity());
        mc2.setAnchorView(vv2);
        vv2.setMediaController(mc2);
        vv2.setVideoURI(Uri.parse(uri2));

        vv2.seekTo(120);
        vv2.pause();


        VideoView vv3 = (VideoView)this.rootview.findViewById(R.id.videoView3);
        String uri3 = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.hope3;
        MediaController mc3= new MediaController(getActivity());
        mc3.setAnchorView(vv3);
        vv3.setMediaController(mc3);
        vv3.setVideoURI(Uri.parse(uri3));

        vv3.seekTo(120);
        vv3.pause();


        return rootview;
    }
}
