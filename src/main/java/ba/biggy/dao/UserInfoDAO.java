package ba.biggy.dao;

import java.util.List;

import ba.biggy.model.UserInfo;

public interface UserInfoDAO {
    
    public UserInfo findUserInfo(String userName);
     
    // [USER,AMIN,..]
    public List<String> getUserRoles(String userName);
     
}
