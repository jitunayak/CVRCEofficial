package com.example.monster_kid.cvrceofficial.WebFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.monster_kid.cvrceofficial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoticeFragment extends Fragment {

WebView mWebView;
    public NoticeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.content_main, container, false);
        mWebView = (WebView) v.findViewById(R.id.webview_id);
        mWebView.loadUrl("http://googleweblight.com/?lite_url=http://cvrce.edu.in/notice-details.php");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);

        return v;
    }

}
