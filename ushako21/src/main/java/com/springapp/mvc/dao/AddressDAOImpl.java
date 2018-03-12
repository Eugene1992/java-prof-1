package com.springapp.mvc.dao;

import com.springapp.mvc.model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressDAOImpl implements AddressDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addAddress(Address address) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(address);
    }

    @Override
    public void updateAddress(Address address) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(address);
    }

    @Override
    public void removeAddress(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Address address = (Address)session.load(Address.class, new Integer(id));

        if (address != null){
            session.delete(address);
        }
    }

    @Override
    public Address getAddressById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Address address = (Address)session.load(Address.class, new Integer(id));
        return address;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Address> addressList() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Address> listAddress = session.createQuery("from address").list();
        return listAddress;
    }
}
