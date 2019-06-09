package lk.love.hacking.sl.slfreedom;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.DataFormatException;

public class datacollection{
        private static datacollection request;
        private String NotificationIp = "121.241.248.24:8080";
        private String SgduIp = "ec2-175-41-185-155.ap-southeast-1.compute.amazonaws.com:8080";
        public String WeekEpgRequestUrl = "http://" + this.SgduIp + "/recording/epg/whatsOnIndia.action";
        public HashMap<String, HashMap<String, String>> accType_url_order = new HashMap();
        public HashMap<String, List<String>> access_type_details = new HashMap();
        public String accountEnquiryRequestUrl = "http://" + this.SgduIp + "/RequestResponse/AccountInquiryAction.do";
        public String accountId = null;
        public String adurl = "http://apalya.vserv.mobi/delivery/adapi.php?zoneid=";
        public String andriodc2dId = null;
        public int appConfig = 1;
        public int appConfigHomeScreen = 1;
        public String appName = null;
        public long applicationStartTime = System.currentTimeMillis();
        public String audiopath = "wav";
        public boolean banneradEnabled = false;
        public HashMap<String, DevCapbilities.Ad> capAd = new HashMap();
        public HashMap<String, DevCapbilities.Akamai> capAkamai = new HashMap();
        public HashMap<String, DevCapbilities.PlayOrder> capPlayOrder = new HashMap();
        public HashMap<String, DevCapbilities.Snap> capSnapshot = new HashMap();
        public String cid = null;
        public String contentRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/sgduContentRequest.action";
        public int debugFileMaxSize = 400;
        public String debugFileName = "debugFileName";
        public boolean enableDebugLogs = true;
        public boolean enableDebugLogsInFile = false;
        public String epgNewRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/sgduWhatsOnIndiaProgramRequest.action";
        public String epgRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/sgduWhatsOnIndiaRequest.action";
        public String feedbackResponseRequestUrl = "http://192.168.60.71:8080/PlatformCharging/FeedBack";
        public String genreOrderUrl = "http://" + this.SgduIp + "/APTV3_WAP_WEB/GenreOrderAction.action";
        public int headerAdDuration = 0;
        public int headerAdFlag = 0;
        public String headerAppVersion = null;
        public String headerHttpFlag = null;
        public String headerLang = null;
        public String headerMandatory = null;
        public int headerPrerollAdDuration = 0;
        public String headerPrkey = null;
        public int headerPromoCode = 0;
        public String headerRegion = null;
        public long headerTimeStamp = 0L;
        public String headerUrl = null;
        public int i3GUser = -1;
        public String imei = null;
        public String imsi = null;
        public String lac = null;
        public String listOfRecordedClipsRequestUrl = "http://" + this.SgduIp + "/recording/record/watchProgramsAction.action";
        private List<String> liveGenre = new ArrayList();
        public String mcc = null;
        public String mnc = null;
        public String mode = new String();
        public String movieDetailRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/movies.action";
        public String movieFreshArrivalRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/mvnarrivals.action";
        public String movieGenreRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/genres.action";
        public String movieMostPopularRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/mostpop.action";
        public String moviePItemRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/pitemdata.action";
        public String movieSearchRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/serviceicons.action";
        public String msisdn = null;
        public String msisdnTag = null;
        public String myMoviesRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/serviceUrls.action";
        private HashMap<Object, Object> newnowPlaying = new HashMap();
        public String notificationRegRequestUrl = "http://" + this.NotificationIp + "/APTV3_NOTIFPUSH_MANGMT/RegistrationRequest";
        public String notificationUnRegRequestUrl = "http://" + this.NotificationIp + "/APTV3_NOTIFPUSH_MANGMT/RegistrationRequest";
        private HashMap<Object, Object> nowPlaying = new HashMap();
        public String nowPlayingRequestUrl = "http://d2capp.apalya-auth.com/recording/epg/nowplaying.action";
        private String nowPlayingStatus = new String();
        public HashMap<String, Object> objectHolder = new HashMap();
        public String oneContentPerService = "http://" + this.SgduIp + "/recording/record/deleteProgramAction.action";
        public String operator = null;
        public String osName = null;
        public String osVersion = null;
        public String phoneModel = null;
        public int playquality = -1;
        public String programDeleteRequestUrl = "http://" + this.SgduIp + "/recording/record/deleteProgramAction.action";
        public String programRecordRequestUrl = "http://" + this.SgduIp + "/recording/record/recordProgramAction.action";
        public String promosubscritpionUrl = "http://192.168.200.236:8080/RequestResponse/PromoSubRequestAction.do";
        public String pushNotificationAccountId = null;
        public String pushNotificationActivityName = ".Aptv";
        public int pushNotificationPopupIconResourceId = 0;
        public String pushNotificationPopupTitle = null;
        public int selectBandwidth = 1;
        public String serviceType = null;
        public int sgid = 1;
        public String snapshot2g = "900";
        public String snapshot3g = "900";
        public boolean snapshotEnabled = false;
        public String snapshotwifi = "900";
        public boolean startupadEnabled = false;
        public String subscriptionRequestUrl = "http://" + this.SgduIp + "/RequestResponse/SubscriptionRequestAction.do";
        public String unSubscriptionRequestUrl = "http://" + this.SgduIp + "/RequestResponse/UnSubscriptionRequestAction.do";
        public String updateRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/sgduTimeStampRequest.action";
        private List<String> vodGenre = new ArrayList();

        private datacollection() {
        }

        public static datacollection getInstance() {
            Class<datacollection> class_ = datacollection.class;
            synchronized (datacollection.class) {
                if (request == null) {
                    Log.w((String)"datacollection", (String)"SingleTon Object Creation");
                    request = new datacollection();
                }
                datacollection datacollection2 = request;
                // ** MonitorExit[var3] (shouldn't be in output)
                return datacollection2;
            }
        }

        public String getAdEnabled(String string) {
            if (datacollection.getInstance().capAd.containsKey((Object)string) && datacollection.getInstance().capAd.get((Object)string) != null) {
                return ((DevCapbilities.Ad)datacollection.getInstance().capAd.get((Object)string)).isenabled;
            }
            if (datacollection.getInstance().capAd.containsKey((Object)"default") && datacollection.getInstance().capAd.get((Object)"default") != null) {
                return ((DevCapbilities.Ad)datacollection.getInstance().capAd.get((Object)"default")).isenabled;
            }
            return null;
        }

        public int getAdPadduration(String string) {
            if (datacollection.getInstance().capAd.containsKey((Object)string) && datacollection.getInstance().capAd.get((Object)string) != null) {
                return ((DevCapbilities.Ad)datacollection.getInstance().capAd.get((Object)string)).padDuration;
            }
            if (datacollection.getInstance().capAd.containsKey((Object)"default") && datacollection.getInstance().capAd.get((Object)"default") != null) {
                return ((DevCapbilities.Ad)datacollection.getInstance().capAd.get((Object)"default")).padDuration;
            }
            return 0;
        }

        public int getAdPadduration(String string, int n) {
            if (datacollection.getInstance().capAd.containsKey((Object)string) && datacollection.getInstance().capAd.get((Object)string) != null) {
                return ((DevCapbilities.Ad)datacollection.getInstance().capAd.get((Object)string)).networkPadDuration[n];
            }
            if (datacollection.getInstance().capAd.containsKey((Object)"default") && datacollection.getInstance().capAd.get((Object)"default") != null) {
                return ((DevCapbilities.Ad)datacollection.getInstance().capAd.get((Object)"default")).networkPadDuration[n];
            }
            return 0;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public List<String> getLiveGenre() {
            List<String> list;
            List<String> list2 = list = this.liveGenre;
            synchronized (list2) {
                return this.liveGenre;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public HashMap<Object, Object> getNewNowPlaying() {
            HashMap<Object, Object> hashMap;
            HashMap<Object, Object> hashMap2 = hashMap = this.newnowPlaying;
            synchronized (hashMap2) {
                return this.newnowPlaying;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public HashMap<Object, Object> getNowPlaying() {
            HashMap<Object, Object> hashMap;
            HashMap<Object, Object> hashMap2 = hashMap = this.nowPlaying;
            synchronized (hashMap2) {
                return this.nowPlaying;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public String getNowPlayingStatus() {
            String string;
            String string2 = string = this.nowPlayingStatus;
            synchronized (string2) {
                return this.nowPlayingStatus;
            }
        }

        public HashMap<String, String> getPlayOrder(String string, String string2) {
            if (this.capPlayOrder.get((Object)string) != null) {
                DevCapbilities.PlayOrder playOrder = (DevCapbilities.PlayOrder)this.capPlayOrder.get((Object)string);
                HashMap hashMap = new HashMap();
                if (string2.equalsIgnoreCase("live")) {
                    if (playOrder.live != null) {
                        hashMap.put((Object)string2, (Object)playOrder.live);
                        return hashMap;
                    }
                } else if (string2.equalsIgnoreCase("vod") && playOrder.vod != null) {
                    hashMap.put((Object)string2, (Object)playOrder.vod);
                    return hashMap;
                }
            }
            return null;
        }

        public String getSanpEnabled(String string) {
            if (datacollection.getInstance().capSnapshot.containsKey((Object)string) && datacollection.getInstance().capSnapshot.get((Object)string) != null) {
                return ((DevCapbilities.Snap)datacollection.getInstance().capSnapshot.get((Object)string)).isenabled;
            }
            if (datacollection.getInstance().capSnapshot.containsKey((Object)"default") && datacollection.getInstance().capSnapshot.get((Object)"default") != null) {
                return ((DevCapbilities.Snap)datacollection.getInstance().capSnapshot.get((Object)"default")).isenabled;
            }
            return null;
        }

        public String getSanpHigh(String string) {
            if (datacollection.getInstance().capSnapshot.containsKey((Object)string) && datacollection.getInstance().capSnapshot.get((Object)string) != null) {
                return ((DevCapbilities.Snap)datacollection.getInstance().capSnapshot.get((Object)string)).high;
            }
            if (datacollection.getInstance().capSnapshot.containsKey((Object)"default") && datacollection.getInstance().capSnapshot.get((Object)"default") != null) {
                return ((DevCapbilities.Snap)datacollection.getInstance().capSnapshot.get((Object)"default")).high;
            }
            return "1000";
        }

        public String getSanpLow(String string) {
            if (datacollection.getInstance().capSnapshot.containsKey((Object)string) && datacollection.getInstance().capSnapshot.get((Object)string) != null) {
                return ((DevCapbilities.Snap)datacollection.getInstance().capSnapshot.get((Object)string)).low;
            }
            if (datacollection.getInstance().capSnapshot.containsKey((Object)"default") && datacollection.getInstance().capSnapshot.get((Object)"default") != null) {
                return ((DevCapbilities.Snap)datacollection.getInstance().capSnapshot.get((Object)"default")).low;
            }
            return "1000";
        }

        public String getSanpWifi(String string) {
            if (datacollection.getInstance().capSnapshot.containsKey((Object)string) && datacollection.getInstance().capSnapshot.get((Object)string) != null) {
                return ((DevCapbilities.Snap)datacollection.getInstance().capSnapshot.get((Object)string)).wifi;
            }
            if (datacollection.getInstance().capSnapshot.containsKey((Object)"default") && datacollection.getInstance().capSnapshot.get((Object)"default") != null) {
                return ((DevCapbilities.Snap)datacollection.getInstance().capSnapshot.get((Object)"default")).wifi;
            }
            return "1000";
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public List<String> getVodGenre() {
            List<String> list;
            List<String> list2 = list = this.vodGenre;
            synchronized (list2) {
                return this.vodGenre;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void setNewNowPlaying(HashMap<String, List<ContentFragment>> hashMap) {
            HashMap<Object, Object> hashMap2;
            HashMap<Object, Object> hashMap3 = hashMap2 = this.newnowPlaying;
            synchronized (hashMap3) {
                if (hashMap != null) {
                    this.newnowPlaying.clear();
                    for (String string : hashMap.keySet()) {
                        this.newnowPlaying.put((Object)string, (Object)((List)hashMap.get((Object)string)));
                    }
                }
                return;
            }
        }

        public void setNotficationIp(String string) throws Exception {
            if (string == null) {
                throw new DataFormatException();
            }
            if (string.startsWith("http") || string.startsWith("://") || string.startsWith(":/") || string.startsWith(":")) {
                throw new DataFormatException();
            }
            this.NotificationIp = string;
            this.notificationRegRequestUrl = "http://" + this.NotificationIp + "/APTV3_NOTIFPUSH_MANGMT/RegistrationRequest";
            this.notificationUnRegRequestUrl = "http://" + this.NotificationIp + "/APTV3_NOTIFPUSH_MANGMT/RegistrationRequest";
            this.feedbackResponseRequestUrl = "http://" + this.NotificationIp + "/APTV3_NOTIFPUSH_MANGMT/FeedBack";
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void setNowPlaying(HashMap<String, ContentFragment> hashMap) {
            HashMap<Object, Object> hashMap2;
            HashMap<Object, Object> hashMap3 = hashMap2 = this.nowPlaying;
            synchronized (hashMap3) {
                if (hashMap != null) {
                    this.nowPlaying.clear();
                    for (String string : hashMap.keySet()) {
                        this.nowPlaying.put((Object)string, (Object)((ContentFragment)hashMap.get((Object)string)));
                    }
                }
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void setNowPlayingStatus(String string) {
            String string2;
            String string3 = string2 = this.nowPlayingStatus;
            synchronized (string3) {
                this.nowPlayingStatus = string;
                return;
            }
        }

        public void setSguIp(String string) throws Exception {
            if (string == null) {
                throw new DataFormatException();
            }
            if (string.startsWith("http") || string.startsWith("://") || string.startsWith(":/") || string.startsWith(":")) {
                throw new DataFormatException();
            }
            this.SgduIp = string;
            this.updateRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/sgduTimeStampRequest.action";
            this.epgRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/sgduWhatsOnIndiaRequest.action";
            this.epgNewRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/sgduWhatsOnIndiaProgramRequest.action";
            this.accountEnquiryRequestUrl = "http://" + this.SgduIp + "/RequestResponse/AccountInquiryAction.do";
            this.subscriptionRequestUrl = "http://" + this.SgduIp + "/RequestResponse/SubscriptionRequestAction.do";
            this.unSubscriptionRequestUrl = "http://" + this.SgduIp + "/RequestResponse/UnSubscriptionRequestAction.do";
            this.programRecordRequestUrl = "http://" + this.SgduIp + "/recording/record/recordProgramAction.action";
            this.programDeleteRequestUrl = "http://" + this.SgduIp + "/recording/record/deleteProgramAction.action";
            this.listOfRecordedClipsRequestUrl = "http://" + this.SgduIp + "/recording/record/watchProgramsAction.action";
            this.WeekEpgRequestUrl = "http://" + this.SgduIp + "/recording/epg/whatsOnIndia.action";
            this.contentRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/sgduContentRequest.action";
            this.movieSearchRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/serviceicons.action";
            this.movieMostPopularRequestUrl = "http://" + this.SgduIp + "/WEB-3/client/requests/mostpop.action";
            this.movieFreshArrivalRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/mvnarrivals.action";
            this.movieDetailRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/movies.action";
            this.movieGenreRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/genres.action";
            this.moviePItemRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/pitemdata.action";
            this.myMoviesRequestUrl = "http://" + this.SgduIp + "/WEB-3/movies/serviceUrls.action";
            this.genreOrderUrl = "http://" + this.SgduIp + "/APTV3_WAP_WEB/GenreOrderAction.action";
            this.promosubscritpionUrl = "http://" + this.SgduIp + "/RequestResponse/PromoSubRequestAction.do";
            this.oneContentPerService = "http://" + this.SgduIp + "/WEB-3/client/requests/SgduServiceContentsAction.action";
            this.nowPlayingRequestUrl = "http://" + this.SgduIp + "/recording/epg/nowplaying.action";
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void setliveGenre(List<String> list) {
            List<String> list2;
            List<String> list3 = list2 = this.liveGenre;
            synchronized (list3) {
                this.liveGenre = list;
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void setvodGenre(List<String> list) {
            List<String> list2;
            List<String> list3 = list2 = this.vodGenre;
            synchronized (list3) {
                this.vodGenre = list;
                return;
            }
        }
}

