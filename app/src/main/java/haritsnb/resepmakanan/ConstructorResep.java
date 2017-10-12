package haritsnb.resepmakanan;

import android.content.Intent;

/**
 * Created by user on 05/10/2017.
 */

public class ConstructorResep {
    private String jdl;
    private String desk;
    private int img;
    private String detail;
    private String title;

    public ConstructorResep(String jdl, String desk, int img, String detail, String title) {
        this.jdl = jdl;
        this.desk = desk;
        this.img = img;
        this.detail = detail;
        this.title = title;
    }

    public String getJdl() {
        return jdl;
    }

    public String getDesk() {
        return desk;
    }

    public int getImg() {
        return img;
    }

    public String getDetail() {
        return detail;
    }


    public String getTitle() {
        return title;
    }
}
