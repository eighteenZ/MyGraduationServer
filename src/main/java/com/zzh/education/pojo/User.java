package com.zzh.education.pojo;

public class User {

    //编号，主键
    private int id;
    //用户名
    private String userName;
    //密码
    private String password;
    //学号
    private String stuNumber;
    //学校名称
    private String schoolName;
    //性别：0：男/1：女
    private String sex;

    public User() {
    }

    public User(int id, String userName, String password, String stuNumber, String schoolName, String sex) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.stuNumber = stuNumber;
        this.schoolName = schoolName;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", stuNumber='" + stuNumber + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
