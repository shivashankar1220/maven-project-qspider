package data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Loginpom;
public class PomBaseClass {
	
	GenericMethods f=new GenericMethods();
	Propertyfetch fr=new Propertyfetch();
	@Test
	public void m1() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		f.maximize(driver);
		driver.get(fr.fetchdata("url"));
		Loginpom v=new Loginpom(driver);
		v.perform_operation(fr.fetchdata("un"),fr.fetchdata("pwd"));
	}
}
