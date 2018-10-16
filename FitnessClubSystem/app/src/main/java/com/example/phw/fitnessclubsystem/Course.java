package com.example.phw.fitnessclubsystem;

public class Course {
    int ImgSrc;//课程预览图
    String Title;
    String Content;
    String Time;//上课时间
    String Instructor;//教练名字
    String Payment;//教练可以设置这个值，学员可以看到价格并支付，支付后才能上课
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
    public String getInstructor() { return Instructor; }
    public String getPayment() { return Payment; }


    public void setTitle(String title) { this.Title = title; }
    public void setContent(String content) { this.Content = content; }
    public void setTime(String time) { this.Time = time; }
    public void setImgSrc(int imgsrc) { this.ImgSrc = imgsrc; }
    public void setInstructor(String instructor) { this.Instructor = instructor; }
    public void setPayment(String payment) { this.Payment = payment; }
}
