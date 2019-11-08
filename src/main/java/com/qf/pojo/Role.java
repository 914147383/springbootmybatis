package com.qf.pojo;

public class Role {
    private int roleid;
    private String uname;
    private String role_name;


    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }



    public Role(int roleid, String uname, String role_name, int uid) {
        this.roleid = roleid;
        this.uname = uname;
        this.role_name = role_name;

    }

    public Role(String uname, String role_name, int uid) {
        this.uname = uname;
        this.role_name = role_name;

    }

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleid=" + roleid +
                ", uname='" + uname + '\'' +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
