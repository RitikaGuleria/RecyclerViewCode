package com.example.reccylerview_udemy;

//this class is used to represent that which type of data we are going to display inside our views
public class DataModel
{
    private String title;
    private int image;

    public DataModel(String title, int image)
    {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
