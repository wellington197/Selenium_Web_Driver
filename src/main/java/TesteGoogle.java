import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
	}

}
