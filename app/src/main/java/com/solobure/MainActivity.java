package com.solobure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
// web viewをインポート
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private String accessUrl = "http://35.162.151.33/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView solobura =  (WebView)findViewById(R.id.webView1);
        // javaScriptを有効にする
        solobura.getSettings().setJavaScriptEnabled(true);
        //標準ブラウザをキャンセル
        solobura.setWebViewClient(new WebViewClient());
        //アプリ起動時に読み込むURL
        solobura.loadUrl(accessUrl);

    }
}
