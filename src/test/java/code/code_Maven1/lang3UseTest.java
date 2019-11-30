package code.code_Maven1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class lang3UseTest {

	@Test
	void testAdd() {
		lang3Use str1 = new lang3Use();
		String[] Array1 = new String[]{"first"};
		assertEquals(2,str1.Add(Array1, "second"));
	}

	@Test
	void testAddAll() {
		lang3Use str2 = new lang3Use();
		String[] Array2 = new String[]{"first"};
		assertEquals(3,str2.AddAll(Array2, "second","third"));
	}

	@Test
	void testClone() {
		lang3Use str3 = new lang3Use();
		String[] Array3 = new String[]{"first"};
		String[] Array4 = new String[]{"second","third"};
		assertEquals(2,str3.Clone(Array3, Array4));
	}

	@Test
	void testContains() {
		lang3Use str4 = new lang3Use();
		String[] Array5 = new String[]{"first","second"};
		assertEquals(true,str4.Contains(Array5, "second"));
		assertEquals(false,str4.Contains(Array5, "third"));
	}

	@Test
	void testGetLength() {
		lang3Use str6 = new lang3Use();
		String[] Array8 = new String[]{"first","second"};
		assertEquals(2,str6.GetLength(Array8));
	}

	@Test
	void testComplex() {
		lang3Use str7 = new lang3Use();
		String[] Array9 = new String[]{"aaa","bbb"};
		String[] Array10 = new String[]{"ccc","ddd"};
		String[] Array11 = new String[]{"ccc","ddd","ccc"};
		String[] Array12 = new String[]{"ccc","ddd","ccc","ddd"};
		assertEquals(2,str7.complex(Array9, Array10));
		assertEquals(2,str7.complex(Array9, Array11));
		assertEquals(1,str7.complex(Array11,Array12));
	}

}
