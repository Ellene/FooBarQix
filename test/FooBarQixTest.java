import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class FooBarQixTest {
	
	FooBarQix fooBarQix = new FooBarQix();

	@Test
	public void should_return_1_when_1(){
		String result = fooBarQix.convert(1);
		assertEquals("1", result);
	}
	

	@Test
	public void should_return_FooFoo_when_3() {
		String result = fooBarQix.convert(3);
		assertEquals("FooFoo", result);
	}
	
	@Test
	public void should_return_BarBar_when_5() {
		String result = fooBarQix.convert(5);
		assertEquals("BarBar", result);
	}
	
	@Test
	public void should_return_QixQixQix_when_77() {
		String result = fooBarQix.convert(77);
		assertEquals("QixQixQix", result);
	}
	
	@Test
	public void should_return_FooQix_when_21() {
		String result = fooBarQix.convert(21);
		assertEquals("FooQix", result);
	}
	
	@Test
	public void should_return_FooBarBar_when_15() {
		String result = fooBarQix.convert(15);
		assertEquals("FooBarBar", result);
	}
	
	@Test
	public void should_return_FooFooFoo_when_33() {
		String result = fooBarQix.convert(33);
		assertEquals("FooFooFoo", result);
	}
	
	@Test
	public void should_return_BarQixFooBar_when_35() {
		String result = fooBarQix.convert(35);
		assertEquals("BarQixFooBar", result);
	}
	
	@Test
	public void should_return_BarFoo_when_53() {
		String result = fooBarQix.convert(53);
		assertEquals("BarFoo", result);
	}
	
	@Test
	public void should_return_Qix_when_49() {
		String result = fooBarQix.convert(49);
		assertEquals("Qix", result);
	}
	
	@Test
	public void should_return_Bar_when_100() {
		String result = fooBarQix.convert(100);
		assertEquals("Bar", result);
	}
	
	@Test
	public void should_return_Foo_when_38() {
		String result = fooBarQix.convert(38);
		assertEquals("Foo", result);
	}
}
