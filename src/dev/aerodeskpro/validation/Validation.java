/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package dev.aerodeskpro.validation;

/**
 *
 * @author Ramindu
 */

public enum Validation {
    EMAIL(){
        @Override
        public String validate() {
          return "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";  
        }
    }, 
    MOBILE(){
        @Override
        public String validate() {
            return "^(0{1})(7{1})([0|1|2|4|5|6|7|8]{1})"+" "+"([0-9]{3})"+" "+"([0-9]{4})";
        }
    },
    PASSWORD(){
        @Override
        public String validate() {
           return "^.*(?=.{4,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"; 
        }
     };
    public String validate(){
        
        return "";
        
        }   
}

