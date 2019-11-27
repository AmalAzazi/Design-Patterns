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
public class Customer {
public static final String US = "US";
public static final String CANADA = "Canada";
private String address;
private String name;
private String zip;
private String state;
private String type;

public boolean isValidAddress() {

AddressValidator validator = getValidator(type);
return validator.isValidAddress(address, zip, state);
}
private AddressValidator getValidator(String custType){
    AddressValidator validator = null;
    if (custType.equals(Customer.US)) {
    validator = new USAddress();
}
    if (custType.equals(Customer.CANADA)) {
    validator  = new CAAddressAdapter();
}
return validator;
}

public Customer(String inp_name, String inp_address, String inp_zip, String inp_state,
String inp_type) {
name = inp_name;
address = inp_address;
zip = inp_zip;
state = inp_state;
type = inp_type;
}

}