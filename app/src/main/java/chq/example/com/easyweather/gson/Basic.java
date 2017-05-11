package chq.example.com.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by quan on 2017/5/11.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }


}
