package madhuri.com.webviewdemo;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private  WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());

        //load URL
        webview.loadUrl("https://www.google.com");

        WebView webView = new WebView(getApplicationContext());
        setContentView(webView);

        webView.loadUrl("https://www.google.com");
    }

}