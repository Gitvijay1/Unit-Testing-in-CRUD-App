package com.nt.dao;

import java.util.List;

import com.nt.model.Contact;

public interface ContactDao {
	public String fatchNameById(Integer id);
    public List<String> findAllName();
    public Contact findContact(Integer id);
}
