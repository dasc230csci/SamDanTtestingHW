package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	 private NewTelephoneCompany ntc;
	 
	@Before
	 public void setUp() throws Exception {
	   ntc = new NewTelephoneCompany();
	}
	
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case1(){
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case2(){
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case3(){
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case4(){
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case5(){
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case6(){
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case7(){
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case8(){
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetStartTimeFail_Case9(){
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetDurationFail_Case1(){
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSetDurationFail_Case2(){
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}

	@Test
	public void DicountTesting_Case1(){
		ntc.setStartTime(500);
		ntc.setDuration(100);
		assertTrue("Start time set 500 and duration set 100 is expected to cost $1768.0", ntc.computeCharge()==1768.0);
	}

	@Test
	public void DicountTesting_Case2(){
		ntc.setStartTime(759);
		ntc.setDuration(61);
		assertTrue("Start time set 759 and duration set 61 is expected to cost $1078.48", ntc.computeCharge()==1078.48);
	}
	
	@Test
	public void DicountTesting_Case3(){
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		assertTrue("Start time set 1959 and duration set 61 is expected to cost $1078.48", ntc.computeCharge()==1078.48);
	}
	
	@Test
	public void DicountTestingST_Case1(){
		ntc.setStartTime(0);
		ntc.setDuration(60);
		assertTrue("Start time set 0 and duration set 60 is expected to cost $1248.00", ntc.computeCharge()==1248.00);
	}
	@Test
	public void DicountTestingST_Case2(){
		ntc.setStartTime(400);
		ntc.setDuration(59);
		assertTrue("Start time set 400 and duration set 59 is expected to cost $1227.20", ntc.computeCharge()==1227.20);
	}
	@Test
	public void DicountTestingST_Case3(){
		ntc.setStartTime(759);
		ntc.setDuration(1);
		assertTrue("Start time set 759 and duration set 1 is expected to cost $20.80", ntc.computeCharge()==20.80);
	}
	@Test
	public void DicountTestingST_Case4(){
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		assertTrue("Start time set 1800 and duration set 10 is expected to cost $208.00", ntc.computeCharge()==208.00);
	}
	@Test
	public void DicountTestingST_Case5(){
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		assertTrue("Start time set 1801 and duration set 10 is expected to cost $208.00", ntc.computeCharge()==208.00);
	}
	@Test
	public void DicountTestingST_Case6(){
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		assertTrue("Start time set 2359 and duration set 10 is expected to cost $208.00", ntc.computeCharge()==208.00);
	}
	@Test
	public void DicountTestingDU_Case1(){
		ntc.setStartTime(800);
		ntc.setDuration(65);
		assertTrue("Start time set 800 and duration set 65 is expected to cost $2298.40", ntc.computeCharge()==2298.40);
	}
	@Test
	public void DicountTestingDU_Case2(){
		ntc.setStartTime(900);
		ntc.setDuration(61);
		assertTrue("Start time set 900 and duration set 61 is expected to cost $2156.96", ntc.computeCharge()==2156.96);
	}
	@Test
	public void NoDicountTesting_Case1(){
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		assertTrue("Start time set 1000 and duration set 40 is expected to cost $1664.00", ntc.computeCharge()==1664.00);
	}
	@Test
	public void NoDicountTesting_Case2(){
		ntc.setStartTime(800);
		ntc.setDuration(1);
		assertTrue("Start time set 800 and duration set 1 is expected to cost $41.60", ntc.computeCharge()==41.60);
	}
	@Test
	public void NoDicountTesting_Case3(){
		ntc.setStartTime(801);
		ntc.setDuration(59);
		assertTrue("Start time set 801 and duration set 59 is expected to cost $2454.40", ntc.computeCharge()==2454.40);
	}
	@Test
	public void NoDicountTesting_Case4(){
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		assertTrue("Start time set 1759 and duration set 60 is expected to cost $2496.00", ntc.computeCharge()==2496.00);
	}

}
