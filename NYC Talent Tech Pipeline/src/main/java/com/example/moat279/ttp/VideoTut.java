package com.example.moat279.ttp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import android.net.Uri;

public class VideoTut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tut);

        VideoView videoView = (VideoView)findViewById(R.id.VideoView1);
        MediaController mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(videoView);
        Uri url = Uri.parse("rtsp://r3---sn-vgqsenly.googlevideo.com/Cj0LENy73wIaNAmxLqOv8cEtkhMYDSANFC2QMKVYMOCoAUIASARgntXZn9Ww34lYigELSjZqVWRqV2xHbUUM/7FFB89726FAC2E21BAED63E7605C9559753FEDFE.401031F515DC57477265E7FC32E6F87CF0ACFABA/yt6/1/video.3gp");
        videoView.setMediaController(mediacontroller);
        videoView.setVideoURI(url);
        videoView.requestFocus();
        videoView.start();
    }

}
