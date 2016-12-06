package tv.sx.asiainfo.com.androidtv.utils;

import android.util.Log;

import tv.sx.asiainfo.com.androidtv.BuildConfig;

public class LogUtils {
    public static boolean debug = BuildConfig.DEBUG;

    public static void e(String tag, String message) {
        if (debug) {
            Log.e(tag, message);
        }
    }
    public static void e(String message) {
        e("error", message);

    }

    public static void w(String tag, String message) {
        if (debug) {
            Log.w(tag, message);
        }
    }

    public static void w(String message) {
        w("warn", message);
    }

    public static void i(String tag, String message) {
        if (debug) {
            Log.i(tag, message);
        }
    }

    public static void i(String message) {
        i("info", message);
    }

    public static void d(String tag, String message) {
        if (debug) {
            Log.d(tag, message);
        }
    }

    public static void d(String message) {
        d("debug", message);
    }

    public static void v(String tag, String message) {
        if (debug) {
            Log.v(tag, message);
        }
    }

    public static void v(String message) {
        v("verbose", message);
    }
}