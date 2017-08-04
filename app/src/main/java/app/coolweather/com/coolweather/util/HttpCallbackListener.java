package app.coolweather.com.coolweather.util;

/**
 * Created by Administrator on 2017/8/4.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
