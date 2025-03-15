package com.example.aicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LynxView lynxView = buildLynxView();
        setContentView(lynxView);

        String url = "main.lynx.bundle";
        lynxView.renderTemplateUrl(url, "");
    }
    private LynxView buildLynxView() {
        LynxViewBuilder viewBuilder = new LynxViewBuilder();
        viewBuilder.setTemplateProvider(new DemoTemplateProvider(this));
        return viewBuilder.build(this);
    }

}