import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class TesteGoogle {
	@SuppressWarnings("deprecation")
	@Test
	public void teste(){
		
		//System.setProperty("webdriver.gecko.driver","/Users/welli/xampp/htdocs/CURSOS_WELLINGTON/CURSOS_UDEMY/Selenium/Drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();		//Driver do Firefox
		WebDriver driver = new ChromeDriver();	//Driver do internetExplorer
		//WebDriver driver = new InternetExplorerDriver();	//Driver do internetExplorer

		
		driver.get("http://www.google.com"); // Qual site vai acessar
		
	
		
		Assert.assertEquals("Google",driver.getTitle()); // Teste de verificação de título do site
	}

}
