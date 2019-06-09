package lk.love.hacking.sl.slfreedom;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.appunite.appunitevideoplayer.PlayerActivity;

import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Calendar;

public class CHanelView extends AppCompatActivity {


    public static boolean is4Gnetwork;
    public static int streamingNetwork;

    private Button Sample;
    private Context mContext;
    private long Oostamp;
    private TextView stamp;
    private String stamptostring;

    static {
        streamingNetwork = 0;
        is4Gnetwork = false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chanel_view);


        stamp = (TextView)findViewById(R.id.stamp);
        Oostamp = 0L + (6 - System.currentTimeMillis()) / 1000L;
        stamptostring = Long.toString(Oostamp);
        stamp.setText(getStreamingParams().);





        }


    public static String MD5Encryption(String string) {
        byte[] arrby;
        int n;
        StringBuffer stringBuffer;
        byte[] arrby2 = string.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
            messageDigest.reset();
            messageDigest.update(arrby2);
            arrby = messageDigest.digest();
            stringBuffer = new StringBuffer();
            n = 0;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        do {
            if (n >= arrby.length) {
                return stringBuffer.toString();
            }
            String string2 = Integer.toHexString((int)(255 & arrby[n]));
            if (string2.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(string2);
            ++n;
        } while (true);
    }

    public static String Trim(String string, int n) {
        new String();
        try {
            if (string.length() > n) {
                String string2 = string.substring(0, n);
                return string2;
            }
            return string;
        }
        catch (Exception exception) {
            return string;
        }
    }

    public static String getStreamingParams(Context context, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws SignatureException {
        if (string2 == null) return null;
        if (string3 == null) return null;
        if (string == null) {
            return null;
        }
        Log.d((String)"SN", (String)("URL accesstype:" + string8));
        String string9 = string3;
        Log.d((String)"SN", (String)("serviceType_id" + string9));
        if (string8.equalsIgnoreCase("150") && !datacollection.getInstance().capAkamai.containsKey((Object)string3) && datacollection.getInstance().capAkamai.containsKey((Object)"default")) {
            string9 = "default";
        }
        Log.d((String)"SN", (String)("serviceType_id :: " + string9));
        new String();

        String string11 = CHanelView.Trim(string2, 15);
        String string12 = CHanelView.Trim(string6, 15);
        new String();
        String string13 = string;
        String string14 = string.indexOf("?") > 0 ? String.valueOf((Object)string13) + "&msd=" + datacollection.getInstance().msisdn : String.valueOf((Object)string13) + "?msd=" + datacollection.getInstance().msisdn;
        String string15 = String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)string14)).append("&m=").append(CHanelView.Trim(datacollection.getInstance().phoneModel, 10)).toString())).append("&v=").append(CHanelView.Trim(datacollection.getInstance().headerAppVersion, 5)).toString())).append("&bw=").append(streamingNetwork).toString())).append("&os=").append(CHanelView.Trim(datacollection.getInstance().osName, 5)).toString())).append("&op=").append(CHanelView.Trim(datacollection.getInstance().operator, 12)).toString())).append("&mcc=").append(CHanelView.Trim(datacollection.getInstance().mcc, 4)).toString())).append("&mnc=").append(CHanelView.Trim(datacollection.getInstance().mnc, 4)).toString())).append("&sid=").append(datacollection.getInstance().headerTimeStamp).toString())).append("&osv=").append(datacollection.getInstance().osVersion).toString()) + "&q=" + datacollection.getInstance().playquality;
        String string16 = string11 != null && string11.length() > 0 ? String.valueOf((Object)string15) + "&sn=" + string11 : String.valueOf((Object)string15) + "&sn=";
        String string17 = string12 != null && string12.length() > 0 ? String.valueOf((Object)string16) + "&cn=" + string12 : String.valueOf((Object)string16) + "&cn=";
        if (string7 != null) {
            string17 = String.valueOf((Object)string17) + "&max_minutes=" + CHanelView.Trim(string7, 5);
        }
        String string18 = string4 != null ? String.valueOf((Object)string17) + "&pi=" + CHanelView.Trim(string4, 15) : String.valueOf((Object)string17) + "&pi=";
        String string19 = string5 != null ? String.valueOf((Object)string18) + "&pd=" + CHanelView.Trim(string5, 15) : String.valueOf((Object)string18) + "&pd=";
        if (datacollection.getInstance().enableDebugLogs) {
            Log.d((String)"CHanelView", (String)("NetworkStrengthLevel" + datacollection.getInstance().objectHolder.get((Object)"NetworkStrengthLevel")));
        }
        String string20 = String.valueOf((Object)new StringBuilder(String.valueOf((Object)new StringBuilder(String.valueOf((Object)string19)).append("&ns=").append(datacollection.getInstance().objectHolder.get((Object)"NetworkStrengthLevel")).toString())).append("&st=").append(CHanelView.Trim(string3, 3)).toString()) + "&stamp=" + CHanelView.getElapsedTime();
        if (string8.equalsIgnoreCase("150") && datacollection.getInstance().capAkamai.containsKey((Object)string9)) {
            return string20.replaceAll(" ", "");
        }
        String string21 = "&key=" + datacollection.getInstance().headerPrkey;
        String string22 = string20.replaceAll(" ", "");
        if (datacollection.getInstance().enableDebugLogs) {
            Log.d((String)"CHanelView", (String)("generating value for = " + string22 + string21));
        }
        String string23 = CHanelView.MD5Encryption(String.valueOf((Object)string22) + string21);
        if (datacollection.getInstance().enableDebugLogs) {
            Log.d((String)"CHanelView", (String)("generated sign= " + string23));
        }
        String string24 = string22;
        if (string23 == null) return string24;
        return String.valueOf((Object)string24) + "&sign=" + string23;

    }

    private static int getWeekOfDay(int n, int n2, int n3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(n, n2 - 1, n3);
        return calendar.get(7);
    }

    public static long getElapsedTime() {
        return datacollection.getInstance().headerTimeStamp + (System.currentTimeMillis() - datacollection.getInstance().applicationStartTime) / 1000L;
    }

    ////////////////////////////////////////////////////////





}
