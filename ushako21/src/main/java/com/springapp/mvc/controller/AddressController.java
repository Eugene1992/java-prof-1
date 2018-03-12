package com.springapp.mvc.controller;

import com.springapp.mvc.model.Address;
import com.springapp.mvc.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddressController {
    private AddressService addressService;

    @Autowired (required = true)
    @Qualifier (value = "addressService")
    public void setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping (value = "addresses", method = RequestMethod.GET)
    public String listAddresses (Model model){
        model.addAttribute("address", new Address());
        model.addAttribute("listAddresses", this.addressService.addressList());
    return "addresses";
    }

    @RequestMapping (value = "/addresses/add", method = RequestMethod.POST)
    public String addAddress (@ModelAttribute ("address") Address address){
        if (address.getId() == 0) {
            this.addressService.addAddress(address);
        }else {this.addressService.updateAddress(address);
        }
        return "redirect:/addresses";
    }

    @RequestMapping ("/remove/{id}")
    public String removeAddress (@PathVariable ("id") int id){
        this.addressService.removeAddress(id);

        return "redirect:/addresses";
    }

    @RequestMapping ("edit/{id}")
    public String editAddress (@PathVariable ("id") int id, Model model){
        model.addAttribute("address", this.addressService.getAddressById(id));
        model.addAttribute("listAddresses", this.addressService.addressList());

        return "addresses";
    }

    @RequestMapping ("addressdat/{id}")
    public String addressData (@PathVariable ("id") int id, Model model){
        model.addAttribute("address", this.addressService.getAddressById(id));

        return "addressdata";
    }
}
