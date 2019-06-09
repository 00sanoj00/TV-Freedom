/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 */
package lk.love.hacking.sl.slfreedom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DevCapbilities {
    private static DevCapbilities request;
    public HashMap<String, List<String>> accessVideofragments = new HashMap();
    public List<String> accessfragments = new ArrayList();
    private HashMap<Object, Object> capAd = new HashMap();
    private HashMap<Object, Object> capAkamai = new HashMap();
    private HashMap<Object, Object> capPlayOrder = new HashMap();
    private HashMap<Object, Object> capSnapshot = new HashMap();
    public HashMap<String, String> playvideoFraments = new HashMap();

    public static DevCapbilities getInstance() {
        Class<DevCapbilities> class_ = DevCapbilities.class;
        synchronized (DevCapbilities.class) {
            DevCapbilities devCapbilities;
            if (request == null) {
                devCapbilities = new DevCapbilities();
                return devCapbilities;
            }
            devCapbilities = request;
        }
        return null;
    }


    public void addAd(String string, Ad ad) {
        this.capAd.put((Object)string, (Object)ad);
    }

    public void addAkamai(String string, Akamai akamai) {
        this.capAkamai.put((Object)string, (Object)akamai);
    }

    public void addPlayOrder(String string, PlayOrder playOrder) {
        this.capPlayOrder.put((Object)string, (Object)playOrder);
    }

    public void addSnapshot(String string, Snap snap) {
        this.capSnapshot.put((Object)string, (Object)snap);
    }

    public HashMap<Object, Object> getAd() {
        return this.capAd;
    }

    public HashMap<Object, Object> getAkamai() {
        return this.capAkamai;
    }

    public HashMap<Object, Object> getPlayOrder() {
        return this.capPlayOrder;
    }

    public HashMap<String, String> getPlayvideoFragments() {
        return this.playvideoFraments;
    }

    public HashMap<Object, Object> getSnapshot() {
        return this.capSnapshot;
    }

    public void updatePlayvideoFraments(BaseFragment baseFragment) {
    }

    public class Ad {
        public String isenabled = "";
        public int[] networkPadDuration = new int[3];
        public int padDuration = 0;
    }

    public class Akamai {
        public String acl;
        public String delim;
        public String key;
        public String param;
        public String window;
    }

    public class PlayOrder {
        public String live = null;
        public String vod = null;
    }

    public class Snap {
        public String high;
        public String isenabled = "";
        public String low;
        public String wifi;
    }

}

