package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToString() {
		DateTime _dateTime = new DateTime(2018,10,6,16,37,0);
		assertEquals("2018-10-06 16:37", _dateTime.toString());
	}

	@Test
	public void testDateTimeString() {
		DateTime _dateTime = new DateTime("2018-10-06 16:37:00");
		assertEquals("2018-10-06 16:37", _dateTime.toString());
	}

}
