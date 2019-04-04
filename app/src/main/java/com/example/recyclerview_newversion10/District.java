package com.example.recyclerview_newversion10;

public class District {

    private String Title;
    private String Description;
    private int Thumbnail;
    private String Aboutdistrict;
    private int Imageabout;

    public District() {
    }

    public District(String title , String description, int thumbnail, String aboutdistrict, int imageabout) {
        Title = title;
        Description = description;
        Thumbnail = thumbnail;
        Aboutdistrict = aboutdistrict;
        Imageabout = imageabout;
    }


    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public String getAboutdistrict() {
        return Aboutdistrict;
    }

    public int getImageabout() {
        return Imageabout;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }


    public void setAboutdistrict(String aboutdistrict) {
        Aboutdistrict = aboutdistrict;
    }

    public void setImageabout(int imageabout) {
        Imageabout = imageabout;
    }

}
