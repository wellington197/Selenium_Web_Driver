import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	@Test
	public void teste(){
		
		//System.setProperty("webdriver.gecko.driver","/Users/welli/xampp/htdocs/CURSOS_WELLINGTON/CURSOS_UDEMY/Selenium/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
	}

}
