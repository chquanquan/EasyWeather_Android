package chq.example.com.easyweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by quan on 2017/5/11.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
