package com.freemarker.pojo;

public class User {
    private int userid;
    private String username;
    private int userage;

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public int getUserage() {
        return userage;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserage(int userage) {
        this.userage = userage;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }

    public User(){
    }

    public User(int userid, String username, int userage){
        super();
        this.userid=userid;
        this.username=username;
        this.userage=userage;
    }
}
