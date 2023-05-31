package ru.mirea.kokorevkv.yandexdriver;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String API_KEY = "8f1e2d96-ccda-49cd-b6f1-0b583f43da0f";

    @Override
    public void onCreate() {
        super.onCreate();
// Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(API_KEY);
    }
}