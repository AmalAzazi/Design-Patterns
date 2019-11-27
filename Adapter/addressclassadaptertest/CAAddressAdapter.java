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
public class CAAddressAdapter extends AddressValidators {
    private CAAddress objCAAddress;
    public CAAddressAdapter(CAAddress address) {
     objCAAddress = address;
   }

    CAAddressAdapter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public boolean isValidAddress(String inp_address, String inp_zip, String inp_state)
  {
    return objCAAddress.isValidCanadianAddr(inp_address, inp_zip, inp_state);
  }
  
}
