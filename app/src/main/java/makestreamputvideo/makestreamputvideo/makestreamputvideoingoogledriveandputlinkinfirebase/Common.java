package makestreamputvideo.makestreamputvideo.makestreamputvideoingoogledriveandputlinkinfirebase;


import android.location.Location;

public class Common {
    public static final String baseURL="https://maps.googleapis.com";
    public static final String fcmURL="https://fcm.googleapis.com";
    public static IGoogleApi getGoogeApi()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
    public static FCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(FCMService.class);
    }

    public static Location mLastLocation=null;

}
