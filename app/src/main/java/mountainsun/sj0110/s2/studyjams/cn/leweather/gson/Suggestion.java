package mountainsun.sj0110.s2.studyjams.cn.leweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Fenice on 2017/6/11.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;

    }

    public class CarWash{

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}
