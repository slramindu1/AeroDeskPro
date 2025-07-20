/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.aerodeskpro.validation;

import javax.swing.JOptionPane;
import dev.aerodeskpro.validation.Validation;

/**
 *
 * @author ridmi
 */
public class Validator {

  
    public static boolean isEmailValid(String value){
        if(value.isBlank()){
        JOptionPane.showMessageDialog(null,
                "Email need to be validated.",
                "Email Validation",
                JOptionPane.WARNING_MESSAGE);
        return false;
        }else if(!value.matches(Validation.EMAIL.validate())){
            JOptionPane.showMessageDialog(null,
              "Invalied","Email Validation",
            JOptionPane.WARNING_MESSAGE);
        return false;
        }
    return true;
    
    }
    
      public static boolean isMobileValid(String value){
          if(value.isBlank()){
          JOptionPane.showMessageDialog(null, 
                  "Mobile filed can't be empty",
                  "Mobile Validation",
                  JOptionPane.WARNING_MESSAGE);
                  return false;
          
          }else if(!value.matches(Validation.MOBILE.validate())){
          
                  JOptionPane.showMessageDialog(null,
                  "Enter a valid Mobile Number",
                  "Mobile Validation",
                  JOptionPane.WARNING_MESSAGE);
          return false;
          }
    return true;
    
    }

    
     public static boolean isPasswordValid(String value){
         if(value.isBlank()){
         JOptionPane.showMessageDialog(null,
                 "Password must include the following character. \n"
                 +"At least one lowercase, \n"
                 +"at least one uppercase, \n"
                 +"a special character, \n"
                 +"and at least one digit.\n"
                 +"The password must be greater than 4 and less than 8 character",
                 "Password Validation",
                 JOptionPane.WARNING_MESSAGE);
         return false;
         }else if(!value.matches(Validation.PASSWORD.validate())){
          
                  JOptionPane.showMessageDialog(null,
                   "Password must include the following character. \n"
                 +"At least one lowercase, \n"
                 +"at least one uppercase, \n"
                 +"a special character, \n"
                 +"and at least one digit.\n"
                 +"The password must be greater than 4 and less than 8 character",
                 "Password Validation",
                  JOptionPane.WARNING_MESSAGE);
          return false;
         }
            return true;
    
    }
     public static boolean isInputFieldValid(String value){
         if(value.isBlank()){
         JOptionPane.showMessageDialog(null,
                 "Input field can't be empty",
                 "Validation Message",
                 JOptionPane.WARNING_MESSAGE);
         return false;
         }
     return true;
     }
     
     public static boolean isSelectedItemValid(int value){
     if(value==0){
         JOptionPane.showMessageDialog(null,
                 "Select suitable item",
                 "Validation Message",
                 JOptionPane.WARNING_MESSAGE);
         return false;
     }
     return true;
     }
      public static boolean isDoubleValid(double value){
     if(value==0){
         JOptionPane.showMessageDialog(null,
                 "Select suitable item",
                 "Validation Message",
                 JOptionPane.WARNING_MESSAGE);
         return false;
     }
     return true;
     }

    public static boolean isChecked(boolean select) {
        if(!select){
        return false;
        }return true;
    }
     
    
}
