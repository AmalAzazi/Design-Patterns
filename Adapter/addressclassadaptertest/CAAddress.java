/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressclassadaptertest;

/**
 *
 * @author amal
 */
public class CAAddress {
    public boolean isValidCanadianAddr(String inp_address,
     String inp_pcode, String inp_prvnc) {
   if (inp_address.trim().length() < 15)
     return false;
   if (inp_pcode.trim().length() != 6)
     return false;
   if (inp_prvnc.trim().length() < 6)
     return false;
   return true;
   }
}
