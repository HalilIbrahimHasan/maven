package testpackage;





import org.junit.Assert;
import org.junit.jupiter.api.Test;

import firstpackage.App;
public class AppTest {

	
	@Test
	public void loginTest1() {
		App app = new App();
		
		Assert.assertEquals(0, app.userLogin("settar", "123456"));
	}
	
	@Test
	public void loginTest2() {
		App app = new App();
		
		Assert.assertEquals(1, app.userLogin("ibrahim", "12345"));
	}
	
	
}
