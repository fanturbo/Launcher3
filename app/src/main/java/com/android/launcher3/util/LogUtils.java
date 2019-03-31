package com.android.launcher3.util;

import android.util.Log;

/**
 * Created by luo_mac on 2017/6/26.
 */

public class LogUtils {

    private static final String TAG = "LogUtils";
    private static final boolean LOGGER=true;

    public static void v(String tag, String msg) {
        if (LOGGER) {
            Log.v(TAG, tag + "-->" + msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LOGGER) {
            Log.d(TAG, tag + "-->" + msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LOGGER) {
            Log.i(TAG, tag + "-->" + msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LOGGER) {
            Log.v(TAG, tag + "-->" + msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LOGGER) {
            Log.e(TAG, tag + "-->" + msg);
        }
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (LOGGER) {
            Log.e(TAG, tag + "-->" + msg);
        }
    }

    public static void e(String tag) {
        if (LOGGER) {
            Log.e(TAG,tag);
        }
    }

    public static void v(String tag) {
        if (LOGGER) {
            Log.v(TAG,tag);
        }
    }
}
