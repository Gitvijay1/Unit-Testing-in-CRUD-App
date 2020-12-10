package com.nt.service;

import java.util.List;

import com.nt.model.Contact;

public interface ContactService {
	public String getNameById(Integer id);
	public List<String> getAllName();
	public Contact getContact(Integer id);

}
