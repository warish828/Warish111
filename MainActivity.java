package com.warish.cyber;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private static final String INSTAGRAM =
            "https://www.instagram.com/yamr.ajwarishhh/";

    private static final String WEBSITE =
            "https://warish828.github.io/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View instagramBtn = findViewById(R.id.instagramBtn);
        View websiteBtn = findViewById(R.id.websiteBtn);

        instagramBtn.setOnClickListener(v -> open(INSTAGRAM));
        websiteBtn.setOnClickListener(v -> open(WEBSITE));
    }

    private void open(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}













