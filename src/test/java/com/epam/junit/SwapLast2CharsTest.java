package com.epam.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapLast2CharsTest {
	App s;
	
	@BeforeEach
	void setUp() {
     s=new App();
	}
	@Test
	void test1() {
    	assertEquals("BCD",s.swap("ABCD"));
		}
	@Test
	void test2() {
		assertEquals("CD",s.swap("AACD"));
		}
	@Test
	void test3() {
		assertEquals("BCD",s.swap("BACD"));
		}
	@Test
	void test4() {
		assertEquals("BBAA",s.swap("BBAA"));
		}
	@Test
	void test5() {
		assertEquals("BAA",s.swap("AABAA"));
		}
}
