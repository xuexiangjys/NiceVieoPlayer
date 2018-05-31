package com.xiao.nicevideoplayer;

import android.util.Log;

/**
 * log工具.
 *
 * @author xuexiang
 * @since 2018/5/31 下午7:23
 */
final class LogUtils {

    private static final String TAG = "NiceVideoPlayer";

    public static void d(String message) {
        Log.d(TAG, message);
    }

    public static void i(String message) {
        Log.i(TAG, message);
    }

    public static void e(String message, Throwable throwable) {
        Log.e(TAG, message, throwable);
    }
}
