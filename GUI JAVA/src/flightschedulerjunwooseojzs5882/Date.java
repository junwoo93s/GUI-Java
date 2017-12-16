/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulerjunwooseojzs5882;

/**
 *
 * @author junwooseo
 */
public class Date {
    private static Date date;
    
    public Date (Date date){
        this.date = date;
    }
    
    public static Date getDate(){
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
}
