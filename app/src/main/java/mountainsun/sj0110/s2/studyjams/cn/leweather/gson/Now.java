package mountainsun.sj0110.s2.studyjams.cn.leweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Fenice on 2017/6/11.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }

}