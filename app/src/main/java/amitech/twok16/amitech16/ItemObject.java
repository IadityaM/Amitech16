package amitech.twok16.amitech16;

/**
 * Created by anjali on 21-03-2016.
 */
public class ItemObject {
    private String ename;
    private double org_icon;
    private String eday;
    private String etime;
    private String edesc;
    private String evenue;
    private String eeday;
    private String event_org;
    private int cardback;


    public ItemObject(String ename, String eday, String etime, String edesc, String evenue, String eeday, String event_org, int cardback) {
        this.ename = ename;
        this.cardback = cardback;
        this.eday = eday;
        this.etime = etime;
        this.edesc = edesc;
        this.evenue = evenue;
        this.eeday = eeday;
        this.event_org = event_org;

    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getCardback() {
        return cardback;
    }

    public void setCardback(int cardback) {
        this.cardback = cardback;

    }

    public String getEday() {
        return eday;
    }

    public void setEday(String eday) {
        this.eday = eday;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public String getEdesc() {

        return edesc;
    }

    public void setEdesc(String edesc) {
        this.edesc = edesc;
    }

    public String getEvenue() {

        return evenue;
    }

    public void setEvenue(String evenue) {
        this.evenue = evenue;
    }

    public String getEeday() {
        return eeday;
    }

    public void setEeday(String eeday) {
        this.eeday = eeday;
    }

    public String getEvent_org() {
        return event_org;
    }

    public void setEvent_org(String event_org) {
        this.event_org = event_org;
    }
}
