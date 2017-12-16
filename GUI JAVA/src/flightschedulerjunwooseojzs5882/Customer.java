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
public class Customer {
    private static String name;
    
    public Customer (String name){
        this.name = name;
    }
    
    public static String getCustomerName(){
        return name;
    }
    
    public void setCustomerName(String name){
        this.name = name;
    }
}
