package com.pursuit.zodiacapp.model;

import java.util.List;

public class Zodiac {
    private List<ZodiacModel> zodiac;

    public Zodiac(List<ZodiacModel> zodiacList){
        this.zodiac = zodiacList;
    }
    public List<ZodiacModel> getZodiac(){
        return zodiac;
    }
    public void setZodiac (List<ZodiacModel> zodiac){
        this.zodiac = zodiac;
    }
}
