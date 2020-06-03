package ex11;

import org.junit.Test;

public class TestEx11 {

	@Test
	public void testEx11() throws Exception {
		
		Comp1 c1 = new Comp1();
		Comp2 c2 = new Comp2();
		Comp3 c3 = new Comp3();
		
		c1.initial = 1.1;
		
		while(c1.done) {

			c1.execute();
			
			c3.fb = c1.fb;
			
			c3.execute();

			c2.fb = c3.fb;

			c2.execute();

			c1.fb = c2.fb;
			
		}
	}

}
