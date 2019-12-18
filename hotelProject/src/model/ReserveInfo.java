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
public class ReserveInfo {

    private String guestIDnumber;
    private String guestName;
    private String rentType;
    private String roomType;
    private int RentDays;
    private String remark;
    private boolean result=false;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
    
    
}
