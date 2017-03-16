package beanTests;

import static org.junit.Assert.fail;

import static org.junit.Assert.*;

import org.junit.Test;

import beans.DashboardBean;

public class DashBoardBeanTest {
	
	private DashboardBean bean = new DashboardBean();
	
	@Test
	public void setUser() throws Exception {
		 bean.setUser("a");
		 assertEquals("Inkorrekt v�rde av user", "a", bean.getUser()); 
	}
	
	@Test
	public void setGroup() throws Exception {
		bean.setGroup("a");
		assertEquals("Inkorrekt v�rde av group", "a", bean.getGroup());
	}
	
	@Test
	public void setWeek() throws Exception {
		bean.setWeek(1);
		assertEquals("Inkorrekt v�rde av week", 1, bean.getWeek());
		bean.setWeek(53);
		assertFalse("V�rdet �r st�rre �n 52 eller mindre �n 1", bean.getWeek() > 0 && bean.getWeek() < 53);	
	}
	
	@Test
	public void setDocumentSummary() throws Exception {
		bean.setDocumentSummary(1);
		assertEquals("Inkorrekt v�rde av documentSummary", 1, bean.getDocumentSummary());
	}
	
	@Test
	public void setActivitySummary() throws Exception {
		bean.setActivitySummary(1);
		assertEquals("Inkorrekt v�rde av activitySummary", 1, bean.getActivitySummary());
	}
	
	public void setReportValues() throws Exception {
		bean.setReportValues("a", 10);
		bean.setReportValues("b", 11);
		assertFalse("Map �r null", bean.getReportValues() != null);
		assertEquals("Fel v�rden h�mtas", 10, bean.getReportValues("a"));
		assertEquals("Fel v�rden h�mtas", 11, bean.getReportValues("b"));
	}
}
