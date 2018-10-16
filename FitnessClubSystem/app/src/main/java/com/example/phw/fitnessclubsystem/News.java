package com.example.phw.fitnessclubsystem;

public class News {
    int ImgSrc;
    String Title;
    String Content;
    String Time;
    public int getImgSrc() {
        return ImgSrc;
    }
    public String getTitle() { return Title; }
    public String getContent() {
        return Content;
    }
    public String getTime() {
        return Time;
    }
    public void setTitle(String title) {
        this.Title = title;
    }
    public void setContent(String content) {
        this.Content = content;
    }
    public void setTime(String time) {
        this.Time = time;
    }
    public void setImgSrc(int imgsrc) {
        this.ImgSrc = imgsrc;
    }
}
