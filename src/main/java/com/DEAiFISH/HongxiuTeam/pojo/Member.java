package com.DEAiFISH.HongxiuTeam.pojo;

public class Member extends People {

    private String password;
    private Integer grade;
    private Position position;

    public Member() {
    }

    public Member(Integer id){
        super(id);
    }


    public Member(String password, Integer grade, Position position) {
        this.password = password;
        this.grade = grade;
        this.position = position;
    }

    public Member(Integer id, String name, Integer age, String gender, String password, Integer grade, Position position) {
        super(id, name, age, gender);
        this.password = password;
        this.grade = grade;
        this.position = position;
    }

    public Member(Integer id, String password, Integer grade, Position position) {
        super(id);
        this.password = password;
        this.grade = grade;
        this.position = position;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + getId() +
                ", name='" + getName() +
                ", age=" + getAge() +
                ", gender='" + getGender() +
                "grade=" + getGrade() +
                "password=" + getPassword() +
                "position=" + getPosition() +
                '}';
    }
}
