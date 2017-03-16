package beanTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import beans.UserManagementBean;

public class UserManagementBeanTest {
	
	private UserManagementBean bean = new UserManagementBean();
	
	@Test
	public void setUser() throws Exception {
		 bean.setUserName("a");
		 assertEquals("Inkorrekt v�rde av user", "a", bean.getUserName()); 
	}
	
	@Test
	public void setPassword() throws Exception {
		bean.setPassword("a");
		assertEquals("Inkorrekt v�rde av password", "a", bean.getPassword()); 
	}
	
	@Test
	public void setGroup() throws Exception {
		bean.setGroup("a");
		assertEquals("Inkorrekt v�rde av group", "a", bean.getGroup());
	}
	
	@Test
	public void setRole() throws Exception {
		bean.setRole("a");
		assertEquals("Inkorrekt v�rde av role", "a", bean.getRole());
	}
	
	@Test
	public void setEmail() throws Exception {
		bean.setEmail("ab");
		assertEquals("Inkorrekt v�rde av email", "ab", bean.getEmail());
	}
	
	@Test
	public void setUserList() throws Exception {
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		bean.setUserList(testList);
		assertEquals("Inkorrekt v�rde av userList", testList, bean.getUserList());
		assertFalse("Inkorrekt v�rde av userList", bean.getUserList() == null);
	}
}
