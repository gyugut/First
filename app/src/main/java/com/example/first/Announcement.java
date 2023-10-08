package com.example.first;

import java.io.Serializable;
import java.util.ArrayList;

public class Announcement implements Serializable {
    private String ano_Id;
    private String ano_wirted;
    private String ano_contentTitle;
    private String ano_text;
    private ArrayList<String> imgList;

    public String getAno_Id() {
        return ano_Id;
    }

    public void setAno_Id(String ano_Id) {
        this.ano_Id = ano_Id;
    }

    public String getAno_wirted() {
        return ano_wirted;
    }

    public void setAno_wirted(String ano_wirted) {
        this.ano_wirted = ano_wirted;
    }

    public String getAno_contentTitle() {
        return ano_contentTitle;
    }

    public void setAno_contentTitle(String ano_contentTitle) {
        this.ano_contentTitle = ano_contentTitle;
    }

    public String getAno_text() {
        return ano_text;
    }

    public void setAno_text(String ano_text) {
        this.ano_text = ano_text;
    }

    public ArrayList<String> getImgList() {
        return imgList;
    }

    public void setImgList(ArrayList<String> imgList) {
        this.imgList = imgList;
    }
}
