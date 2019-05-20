package com.bw.test;

import org.junit.Test;

import com.bw.utils.DateUtil;

public class DateTest {
	@Test
	public void test1() {
		int dat = DateUtil.getDateByInitMonth("2017-05-06");
		System.out.println(dat);
	}
}
