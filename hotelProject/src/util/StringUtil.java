/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author hasee
 */
public class StringUtil {
    //用来判断用户输入是否为空
    public static boolean isEmpty(String str){
		if("".equals(str)|| str == null){
			return true;
		}
		return false;
	}
}
