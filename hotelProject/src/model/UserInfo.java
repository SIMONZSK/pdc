/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hasee
 * model����һ�����entity��ʵ��Ӧ���ݿ����һ�ű�
 */
public class UserInfo {
        //ʹ�����ϵͳ���ˣ�id��name��password���������Ƿ���Ч
	
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