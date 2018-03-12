package com.springapp.mvc.service;

import com.springapp.mvc.dao.AddressDAO;
import com.springapp.mvc.model.Address;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressDAO addressDAO;

    public void setAddressDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }

    @Override
    @Transactional
    public void addAddress(Address address) {
        this.addressDAO.addAddress(address);
    }

    @Override
    @Transactional
    public void updateAddress(Address address) {
        this.addressDAO.updateAddress(address);
    }

    @Override
    @Transactional
    public void removeAddress(int id) {
        this.addressDAO.removeAddress(id);
    }

    @Override
    @Transactional
    public Address getAddressById(int id) {
        return this.addressDAO.getAddressById(id);
    }

    @Override
    @Transactional
    public List<Address> addressList() {
        return this.addressDAO.addressList();
    }
}
