package com.jb.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ReverseSrtringTest {
	@Test
	void test() {
		ReverseSrtring reverse = new ReverseSrtring();
		assertEquals("ayaJ", reverse.reverseString("Jaya"));
		assertEquals("alaB", reverse.reverseString("Bala"));
	}
}
