package sk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetUtil {
    public static final int NETWORN_NONE = 0;
    public static final int NETWORN_WIFI = 1;
    public static final int NETWORN_MOBILE = 2;
    public static int getNetworkState(Context context){
        ConnectivityManager connManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        //需要在manifest中申请权限
        NetworkInfo networkInfo = connManager.getActiveNetworkInfo();
        if(networkInfo==null)
            return NETWORN_NONE;
        int nType = networkInfo.getType();
        if(nType == ConnectivityManager.TYPE_MOBILE)
            return NETWORN_MOBILE;
        else if(nType == ConnectivityManager.TYPE_WIFI)
            return NETWORN_WIFI;
       else return  NETWORN_NONE;
    }
}
