package com.redis.util;

/**
 * Created by jiangwenping on 16/11/26.
 * 时间提供服务
 */
public class TimeUtil {

    public static long SECOND = 1000;
    public static long MINUTE = 60 * SECOND;
    public static long FIVE_MINUTE = 5 * MINUTE;
    public static long ONE_HOUR = 60 * MINUTE;
    public static long SIX_HOUR = 6 * ONE_HOUR;
    public static long ONE_DAY = 24 * ONE_HOUR;

    public static int MINUTE_SECOND = (int) (MINUTE / SECOND);


    public static long getSeconds(){
        long now = System.currentTimeMillis();
        return now / SECOND;
    }
}
