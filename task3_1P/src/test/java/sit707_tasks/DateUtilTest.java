package sit707_tasks;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ahsan Habib
 */
public class DateUtilTest {

	@Test
	public void testStudentIdentity() {
		String studentId = null;
		Assert.assertNotNull("s222303253");
	}

	@Test
	public void testStudentName() {
		String studentName = null;
		Assert.assertNotNull("Parul Loyal");
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("january31ShouldIncrementToFebruary1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("january31ShouldDecrementToJanuary30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
		System.out.println("testRandomDateJanuary > " + date);
		date.increment();
		System.out.println(date);
	}

	// Complete below test cases.

	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	/*
	 * Write tests for rest months of year 2024.
	 */

	@Test
	public void testMaxFebruary28ShouldIncrementToFebruary29() {
		DateUtil date = new DateUtil(28, 2, 2024);
		System.out.println("testMaxFebruary28ShouldIncrementToFebruary29 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
	}

	@Test
	public void testMaxFebruary29ShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("testMaxFebruary29ShouldDecrementToFebruary28 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
	}

	@Test
	public void testNominalFebruary() {
		int rand_day_1_to_28 = 1 + new Random().nextInt(28);
		DateUtil date = new DateUtil(rand_day_1_to_28, 2, 2024);
		System.out.println("testNominalFebruary > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testLeapYearFebruary29ShouldIncrementToMarch1() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("testLeapYearFebruary29ShouldIncrementToMarch1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testLeapYearFebruary29ShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("testLeapYearFebruary29ShouldDecrementToFebruary28 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testLeapYearFebruary28ShouldIncrementToFebruary29() {
		DateUtil date = new DateUtil(28, 2, 2024);
		System.out.println("testLeapYearFebruary28ShouldIncrementToFebruary29 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
	}

	@Test
	public void testLeapYearFebruary28ShouldDecrementToFebruary27() {
		DateUtil date = new DateUtil(28, 2, 2024);
		System.out.println("testLeapYearFebruary28ShouldDecrementToFebruary27 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(27, date.getDay());
	}

	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
		DateUtil date = new DateUtil(31, 3, 2024);
		System.out.println("testMaxMarch31ShouldIncrementToApril1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(4, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
		DateUtil date = new DateUtil(31, 3, 2024);
		System.out.println("testMaxMarch31ShouldDecrementToMarch30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testNominalMarch() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
		System.out.println("testNominalMarch > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMinMarch1ShouldIncrementToMarch2() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("testMinMarch1ShouldIncrementToMarch2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinMarch1ShouldDecrementToFeberuary28() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("testMinMarch1ShouldDecrementToFeberuary28 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
		DateUtil date = new DateUtil(30, 4, 2024);
		System.out.println("testMaxApril30ShouldIncrementToMay1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(5, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxApril30ShouldDecrementToApril29() {
		DateUtil date = new DateUtil(30, 4, 2024);
		System.out.println("testMaxApril30ShouldDecrementToApril29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testNominalApril() {
		int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
		System.out.println("testNominalApril > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMinApril1ShouldIncrementToApril2() {
		DateUtil date = new DateUtil(1, 4, 2024);
		System.out.println(" testMinApril1ShouldIncrementToApril2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinApril1ShouldDecrementToMarch31() {
		DateUtil date = new DateUtil(1, 4, 2024);
		System.out.println("testMinApril1ShouldDecrementToMarch31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
		DateUtil date = new DateUtil(31, 5, 2024);
		System.out.println("testMaxMay31ShouldIncrementToJune1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxMay31ShouldDecrementToMay30() {
		DateUtil date = new DateUtil(31, 5, 2024);
		System.out.println("testMaxMay31ShouldDecrementToMay30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testNominalMay() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
		System.out.println("testNominalMay > " + date);
		date.increment();
		System.out.println(date);
	}

	@Test
	public void testMinMay1ShouldIncrementToMay2() {
		DateUtil date = new DateUtil(1, 5, 2024);
		System.out.println(" testMinMay1ShouldIncrementToMay2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinMay1ShouldDecrementToApril30() {
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println(" testMinMay1ShouldDecrementToApril30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
		DateUtil date = new DateUtil(30, 6, 2024);
		System.out.println("testMaxJune30ShouldIncrementToJuly1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(7, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
		DateUtil date = new DateUtil(30, 6, 2024);
		System.out.println("testMaxJune30ShouldDecrementToJune29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testNominalJune() {
		int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
		System.out.println("testNominalJune > " + date);
		date.increment();
		System.out.println(date);
	}

	public void testMinJune1ShouldIncrementToJune2() {
		DateUtil date = new DateUtil(1, 6, 2024);
		System.out.println("testMinJune1ShouldIncrementToJune2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinJune1ShouldDecrementToMay31() {
		DateUtil date = new DateUtil(1, 6, 2024);
		System.out.println(" testMinJune1ShouldDecrementToMay31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
		DateUtil date = new DateUtil(31, 7, 2024);
		System.out.println("testMaxJuly31ShouldIncrementToAugust1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(8, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJuly31ShouldDecrementToJuly30() {
		DateUtil date = new DateUtil(31, 7, 2024);
		System.out.println("testMaxJuly31ShouldDecrementToJuly30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testNominalJuly() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
		System.out.println("testNominalJuly > " + date);
		date.increment();
		System.out.println(date);
	}

	public void testMinJuly1ShouldIncrementToJuly2() {
		DateUtil date = new DateUtil(1, 7, 2024);
		System.out.println("testMinJuly1ShouldIncrementToJuly2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinJuly1ShouldDecrementToJune30() {
		DateUtil date = new DateUtil(1, 7, 2024);
		System.out.println(" testMinJuly1ShouldDecrementToJune30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
		DateUtil date = new DateUtil(31, 8, 2024);
		System.out.println("testMaxAugust31ShouldIncrementToSeptember1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(9, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxAugust31ShouldDecrementToAugust30() {
		DateUtil date = new DateUtil(31, 8, 2024);
		System.out.println("testMaxAugust31ShouldDecrementToAugust30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testNominalAugust() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
		System.out.println("testNominalAugust > " + date);
		date.increment();
		System.out.println(date);
	}

	public void testMinAugust1ShouldIncrementToAugust2() {
		DateUtil date = new DateUtil(1, 8, 2024);
		System.out.println("testMinAugust1ShouldIncrementToAugust2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinAugust1ShouldDecrementToJuly31() {
		DateUtil date = new DateUtil(1, 8, 2024);
		System.out.println(" testMinAugust1ShouldDecrementToJuly31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
		DateUtil date = new DateUtil(30, 9, 2024);
		System.out.println("testMaxSeptember30ShouldIncrementToOctober1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(10, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxSeptember30ShouldDecrementToSeptember29() {
		DateUtil date = new DateUtil(30, 9, 2024);
		System.out.println("testMaxSeptember30ShouldDecrementToSeptember29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testNominalSeptember() {
		int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
		System.out.println("testNominalSeptember > " + date);
		date.increment();
		System.out.println(date);
	}

	public void testMinSeptember1ShouldIncrementToSeptember2() {
		DateUtil date = new DateUtil(1, 9, 2024);
		System.out.println("testMinSeptember1ShouldIncrementToSeptember2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinSeptember1ShouldDecrementToAugust31() {
		DateUtil date = new DateUtil(1, 9, 2024);
		System.out.println(" testMinSeptember1ShouldDecrementToAugust31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
		DateUtil date = new DateUtil(31, 10, 2024);
		System.out.println("testMaxOctober31ShouldIncrementToNovember1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(11, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxOctober31ShouldDecrementToOctober30() {
		DateUtil date = new DateUtil(31, 10, 2024);
		System.out.println("testMaxOctober31ShouldDecrementToOctober30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testNominalOctober() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
		System.out.println("testNominalOctober > " + date);
		date.increment();
		System.out.println(date);
	}

	public void testMinOctober1ShouldIncrementToOctober2() {
		DateUtil date = new DateUtil(1, 10, 2024);
		System.out.println("testMinOctober1ShouldIncrementToOctober2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinOctober1ShouldDecrementToSeptember30() {
		DateUtil date = new DateUtil(1, 10, 2024);
		System.out.println(" testMinOctober1ShouldDecrementToSeptember30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
		DateUtil date = new DateUtil(30, 11, 2024);
		System.out.println("testMaxNovember30ShouldIncrementToDecember1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxNovember30ShouldDecrementToNovember29() {
		DateUtil date = new DateUtil(30, 11, 2024);
		System.out.println("testMaxNovember30ShouldDecrementToNovember29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testNominalNovember() {
		int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
		System.out.println("testNominalNovember > " + date);
		date.increment();
		System.out.println(date);
	}

	public void testMinNovember1ShouldIncrementtToNovember2() {
		DateUtil date = new DateUtil(1, 11, 2024);
		System.out.println(" testMinNovember1ShouldIncrementToNovember2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinNovember1ShouldDecrementToOctober31() {
		DateUtil date = new DateUtil(1, 11, 2024);
		System.out.println(" testMinNovember1ShouldDecrementToOctober31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1NextYear() {
		DateUtil date = new DateUtil(31, 12, 2024);
		System.out.println("testMaxDecember31ShouldIncrementToJanuary1NextYear > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(2025, date.getYear());
	}

	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
		DateUtil date = new DateUtil(31, 12, 2024);
		System.out.println("testMaxDecember31ShouldDecrementToDecember30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNominalDecember() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
		System.out.println("testNominalDecember > " + date);
		date.increment();
		System.out.println(date);
	}
	
	
	public void testMinDecemeber1ShouldIncrementtToDecember2() {
		DateUtil date = new DateUtil(1, 12, 2024);
		System.out.println(" testMinDecemeber1ShouldIncrementtToDecember2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinDecember1ShouldDecrementToNovember30() {
		DateUtil date = new DateUtil(1, 12, 2024);
		System.out.println(" testMinDecember1ShouldDecrementToNovember30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(12, date.getMonth());
	}

//	Possible test cases can be listed in the table below. You will need to populate the 2nd table 
//	(orange color header, calculates next date) like the 1st table (green color header, calculates previous date) with missing test cases.

//	Here's the code for 2nd table which is having Expected Next Date Test Cases.

	@Test
	public void testNextDateFor1June1994() {
		DateUtil date = new DateUtil(1, 6, 1994);
		date.increment();
		assertEquals("2-6-1994", date.toString());
	}

	@Test
	public void testNextDateFor2June1994() {
		DateUtil date = new DateUtil(2, 6, 1994);
		date.increment();
		assertEquals("3-6-1994", date.toString());
	}

	@Test
	public void testNextDateFor15June1994() {
		DateUtil date = new DateUtil(15, 6, 1994);
		date.increment();
		assertEquals("16-6-1994", date.toString());
	}

	@Test
	public void testNextDateFor30June1994() {
		DateUtil date = new DateUtil(30, 6, 1994);
		date.increment();
		assertEquals("1-7-1994", date.toString());
	}

//	@Test
//	public void testNextDateFor31June1994() {
//		DateUtil date = new DateUtil(31, 6, 1994);
//		assertEquals("Invalid Date", date.increment());
//	}

	@Test
	public void testNextDateFor15January1994() {
		DateUtil date = new DateUtil(15, 1, 1994);
		date.increment();
		assertEquals("16-1-1994", date.toString());
	}

	@Test
	public void testNextDateFor15February1994() {
		DateUtil date = new DateUtil(15, 2, 1994);
		date.increment();
		assertEquals("16-2-1994", date.toString());
	}

	@Test
	public void testNextDateFor15November1994() {
		DateUtil date = new DateUtil(15, 11, 1994);
		date.increment();
		assertEquals("16-11-1994", date.toString());
	}

	@Test
	public void testNextDateFor15December1994() {
		DateUtil date = new DateUtil(15, 12, 1994);
		date.increment();
		assertEquals("16-12-1994", date.toString());
	}

	@Test
	public void testNextDateFor15June1700() {
		DateUtil date = new DateUtil(15, 6, 1700);
		date.increment();
		assertEquals("16-6-1700", date.toString());
	}

	@Test
	public void testNextDateFor15June1701() {
		DateUtil date = new DateUtil(15, 6, 1701);
		date.increment();
		assertEquals("16-6-1701", date.toString());
	}

	@Test
	public void testNextDateFor15June2023() {
		DateUtil date = new DateUtil(15, 6, 2023);
		date.increment();
		assertEquals("16-6-2023", date.toString());
	}

	@Test
	public void testNextDateFor15June2024() {
		DateUtil date = new DateUtil(15, 6, 2024);
		date.increment();
		assertEquals("16-6-2024", date.toString());
	}
}
