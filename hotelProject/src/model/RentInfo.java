/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hasee
 */
public class RentInfo {
        //身份证号，姓名，租房类型(钟点房或者正常)、房间类型（单人，双人）、住几天、押金、评论
	private String guestIDnumber;
        private String guestName;
	private String rentType;
	private String roomType;
	private int RentDays;
	private int antecedentMoney=0;
	private String remark;
//        private long rentTime;
//
//    public long getRentTime() {
//        return rentTime;
//    }
//
//    public void setRentTime(long rentTime) {
//        this.rentTime = rentTime;
//    }
        
    public String getGuestIDnumber() {
        return guestIDnumber;
    }

    public void setGuestIDnumber(String guestIDnumber) {
        this.guestIDnumber = guestIDnumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRentDays() {
        return RentDays;
    }

    public void setRentDays(int RentDays) {
        this.RentDays = RentDays;
    }

    public int getAntecedentMoney() {
        return antecedentMoney;
    }

    public void setAntecedentMoney(int antecedentMoney) {
        this.antecedentMoney = antecedentMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}