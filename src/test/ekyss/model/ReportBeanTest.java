package beanTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import beans.ReportBean;

public class ReportBeanTest {
	
	private ReportBean bean = new ReportBean();
	
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
	public void setReportValues() throws Exception {
		Map<String, Integer> testMap = new HashMap<String, Integer>();
		testMap.put("a", 10);
		testMap.put("b", 11);
		bean.setReportValues(testMap);
		assertEquals("Map har inte satts till r�tt map/v�rden", bean.getReportValues(), testMap);
		assertFalse("Map �r null", bean.getReportValues() == null);
	}
}
