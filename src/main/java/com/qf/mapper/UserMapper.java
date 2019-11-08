package com.qf.mapper;

import com.qf.pojo.User;

import java.util.List;

public interface UserMapper {
    public int addUser(User user);
    public int deleteUser(int uid);
    public int updateUser(User user);
    public User getUserByUid(int uid);
    public String getUpwdByUname(String uname);
    public List<User> getUserList();
    public String getRoleNameByUname(String uname);
}
