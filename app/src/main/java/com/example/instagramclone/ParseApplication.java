package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bAxyixM4wmkCgcm046U75S9EMEHCG7jbcgC7qyvk")
                .clientKey("ZFrfx1DYHXEKnjvyjLivLNO9zuXbGJBIX4Ema8nF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
