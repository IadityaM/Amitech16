package amitech.twok16.amitech16;

/**
 * Created by Aditya on 10-Jan-16.
 */
public class Data {
    //private String description;
    private String imagePath;
    private int cardback;
    //private String On1, On2, On3;

    public Data(String imagePath, int cardback) {
        this.imagePath = imagePath;
        this.cardback = cardback;
        //this.description = description;
    }

    /*public String getDescription() {
        return description;
    }*/

    public String getImagePath() {
        return imagePath;
    }

    public int getCardback() {
        return cardback;
    }

    public void setCardback(int cardback) {
        this.cardback = cardback;

    }
}
