package com.vasudev.userDetails.UserInputs;

public class UserData {

    private String name;
    private String qualification;
    private String id;
    private String discipline;

    public UserData(String name, String qualification, String id, String discipline) {
        super();
        this.name = name;
        this.qualification = qualification;
        this.id = id;
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
