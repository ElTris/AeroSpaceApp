package com.example.aerospaceapp;

public class TaskyManagerClase {

    private String nameTasky;
    private String DateTasky;
    private String descriptionTasky;
    private boolean rememberTasky;
    private String importanceTasky;

    public TaskyManagerClase(String nameTasky,String DateTasky,String descriptionTasky,boolean rememberTasky,String importanceTasky){
        this.nameTasky = nameTasky;
        this.DateTasky = DateTasky;
        this.descriptionTasky = descriptionTasky;
        this.rememberTasky = rememberTasky;
        this.importanceTasky = importanceTasky;
    }


    public String getNameTasky() {
        return nameTasky;
    }

    public String getDateTasky() {
        return DateTasky;
    }

    public String getDescriptionTasky() {
        return descriptionTasky;
    }

    public boolean isRememberTasky() {
        return rememberTasky;
    }

    public String getImportanceTasky() {
        return importanceTasky;
    }

    public void setNameTasky(String nameTasky) {
        this.nameTasky = nameTasky;
    }

    public void setDateTasky(String dateTasky) {
        DateTasky = dateTasky;
    }

    public void setDescriptionTasky(String descriptionTasky) {
        this.descriptionTasky = descriptionTasky;
    }

    public void setRememberTasky(boolean rememberTasky) {
        this.rememberTasky = rememberTasky;
    }

    public void setImportanceTasky(String importanceTasky) {
        this.importanceTasky = importanceTasky;
    }
}
