package eclipse_workspace.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class rmva {

	@Test
	void testword1() {
		removeAatbeg c = new removeAatbeg();
		String actual = c.delete("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void testword2() {
		removeAatbeg c = new removeAatbeg();
		String actual = c.delete("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void testword3() {
		removeAatbeg c = new removeAatbeg();
		String actual = c.delete("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void testword4() {
		removeAatbeg c = new removeAatbeg();
		String actual = c.delete("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void testword5() {
		removeAatbeg c = new removeAatbeg();
		String actual = c.delete("AABAA");
		assertEquals("BAA",actual);
	}
}
