package com.example.mho.androidpresentation.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.example.mho.androidpresentation.BuildConfig;
import com.example.mho.androidpresentation.R;
import com.squareup.picasso.LruCache;
import com.squareup.picasso.Picasso;

public class ImageUtils {

    private static Picasso sInstance = null;
    private static LruCache sMemoryCache = null;

    private static Picasso getInstance(Context context) {
        if (sInstance == null) {
            // Get max available VM memory, exceeding this amount will throw an
            // OutOfMemory exception. Stored in kilobytes as LruCache takes an
            // int in its constructor.
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
            int memoryCacheSize = maxMemory / 8;
            sMemoryCache = new LruCache(memoryCacheSize);

            sInstance = new Picasso.Builder(context)
                    .memoryCache(sMemoryCache)
                        .defaultBitmapConfig(Bitmap.Config.RGB_565)
                    .indicatorsEnabled(BuildConfig.DEBUG)
                    .loggingEnabled(BuildConfig.DEBUG)
                    .build();
        }

        return sInstance;
    }

    public static void loadUrl(Context context, ImageView imageView, String urlImage) {
        getInstance(context)
                .load(urlImage)
                .error(R.mipmap.ic_launcher_round)
                .noFade()
                .into(imageView);
    }
}
