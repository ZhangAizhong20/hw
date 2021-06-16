package com.swufe.javaee.beerV1.model;

public class Beer {
    private String dateofbirth;
    private String name;
    private String detail;
    public  Beer(String dateofbirth,String name,String detail){
        this.dateofbirth=dateofbirth;
        this.detail=detail;
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getDetail() {
        return detail;
    }

    public String getName() {
        return name;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}
