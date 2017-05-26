package com.example.coolweather.db;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenjingxian on 2017/5/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    @SerializedName("update")
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
