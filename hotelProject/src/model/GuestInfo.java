/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author simon
 * ��Ҫ��һ���˿͵�entity�Ķ���
 */
public class GuestInfo {
        //ס���Ŀͻ�ID���Ա����������֤��
	private int guestId;
        private int guestSex;
        private String guestName;
	private String guestIdNumber;
         //ס����ס�ķ���ķ���ID�����͡�������סʱ��
	private int roomId;
	private String roomType;
	private String roomArea;
	private String roomStartTime;
        
        
    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public int getGuestSex() {
        return guestSex;
    }

    public void setGuestSex(int guestSex) {
        this.guestSex = guestSex;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestIdNumber() {
        return guestIdNumber;
    }

    public void setGuestIdNumber(String guestIdNumber) {
        this.guestIdNumber = guestIdNumber;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(String roomArea) {
        this.roomArea = roomArea;
    }

    public String getRoomStartTime() {
        return roomStartTime;
    }

    public void setRoomStartTime(String roomStartTime) {
        this.roomStartTime = roomStartTime;
    }
       
	
	
	
}
