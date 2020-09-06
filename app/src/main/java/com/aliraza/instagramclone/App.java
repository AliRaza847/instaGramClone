package com.aliraza.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nADggHwf0stn5z3NasAybiQ3Mux2CXL35p74vAn2")
                // if defined
                .clientKey("H1T8Z3KGQjtLykSO1DFTc4cuAW1CpnoJLdgkppi1")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
