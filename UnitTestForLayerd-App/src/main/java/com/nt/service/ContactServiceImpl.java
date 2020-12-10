package com.nt.service;

import java.util.List;

import com.nt.dao.ContactDao;
import com.nt.error.NotFoundException;
import com.nt.model.Contact;

public class ContactServiceImpl implements ContactService
{
	private ContactDao dao;
	public void setDao(ContactDao dao) {
		this.dao = dao;
	}


	public String getNameById(Integer id) {
             String name = dao.fatchNameById(id);
             String formatName= name.toUpperCase();
		return formatName;
	}


	public List<String> getAllName() {
               List<String> allName = dao.findAllName();
               if(!allName.isEmpty())
            	   return allName;
		return null;
	}

	public Contact getContact(Integer id) {
            Contact contact = dao.findContact(id);
            if(contact==null) {
            	throw new NotFoundException("not data availble");
            }
		return contact;
	}

}
