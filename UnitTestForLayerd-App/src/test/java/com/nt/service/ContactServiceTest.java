package com.nt.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class ContactServiceTest {
	private ContactServiceImpl service=null;

	@BeforeClass
	public static void init() {
		//create proxy
		ContactDao daoProxy=EasyMock.createMock(ContactDao.class);

		//seting the bihavior for Object
		EasyMock.expect(daoProxy.fatchNameById(101)).andReturn("vijay");
		EasyMock.expect(daoProxy.fatchNameById(102)).andReturn("sharma");

		//seting the bihavior for Object
		List<String> name=new ArrayList<String>();
		name.add("Raja");
		name.add("mohan");
		name.add("gunjan");
		name.add("lokesh");
		EasyMock.expect(daoProxy.findAllName()).andReturn(name);

		//seting the bihavior for Object
		Contact c=new Contact();
		c.setCid(101);
		c.setCname("tata");
		c.setCaddr("banglore");
		EasyMock.expect(daoProxy.findContact(101)).andReturn(c);
		EasyMock.expect(daoProxy.findContact(102)).andReturn(null);

		EasyMock.replay(daoProxy);

		service=new ContactServiceImpl();
		service.setDao(daoProxy);
	}
	@Test
	public void testGetNameById_01() {		
		String byId = service.getNameById(101); 
		assertNotNull(byId);
	}


	@Test
	public void testAllFindName_02() {

		List<String> list = service.getAllName();
		assertNotNull(list);
	}

	@Test
	public void testFindContact_01() {
		Contact contact = service.getContact(101);
		assertNotNull(contact);
	}
	@Test(expected = NotFoundException.class)
	public void testFindContact_02() {
		service.getContact(102);
	}
	@AfterClass
	public static void destroy() {
		service=null;
	}
}
