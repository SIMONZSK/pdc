/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hasee
 * model里面一个类的entity其实对应数据库里的一张表
 */
public class UserInfo {
        //使用这个系统的人：id、name、password、描述、是否有效
	
	private String userName="";
	private String password;
	private Boolean userType=true;
       
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

        public Boolean getUserType() {
        return userType;
          }

        public void setUserType(Boolean userType) {
        this.userType = userType;
        }

      
	

	
}