package com.springapp.mvc.dao;

import com.springapp.mvc.model.Address;

import java.util.List;

public interface AddressDAO {
    public void addAddress(Address address);
    public void updateAddress(Address address);
    public void removeAddress(int id);
    public Address getAddressById(int id);
    public List<Address> addressList ();
}
