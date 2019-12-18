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
public class RoomInfo {
    //简单的房间信息，后面再根据功能不同来添加其他属性
    private String roomName;
    private String roomType;
    private boolean roomCondition=false;//是否已经租出去了的状态

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean getRoomCondition() {
        return roomCondition;
    }

    public void setRoomCondition(boolean roomCondition) {
        this.roomCondition = roomCondition;
    }

   

    

}
