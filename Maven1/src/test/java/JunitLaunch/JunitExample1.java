package JunitLaunch;

import org.junit.*;

public class JunitExample1 {
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeclass");
		

	}
	
	@Before
	public void before() {
		System.out.println("before");

	}

		@Test
		
		public void sample() {
			
			System.out.println("test");

		}
	
		@After
		
		public void after() {
			System.out.println("after");
			
		}
		
		@AfterClass
		public static void afterClass() {
			System.out.println("afterclass");
		}
	}


