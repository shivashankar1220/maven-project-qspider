
/**
 PERFORM THE FOLLOWING TASKS
 * create object for generic methods
 * launch the browser with url
 * login credentials
 * perform scenerio
 * logout the application
 * close the browser
 */
package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import data.GenericMethods;
import data.Javautility;
import data.Propertyfetch;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo_to_utilise_the_genericmethods {
	/**
	 * create object for generic methods
	 */
	GenericMethods de=new GenericMethods();
	Propertyfetch fet=new Propertyfetch();
	Javautility d=new Javautility();
	@Test
	public void m1() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		de.maximize(driver);
		de.implicitwait(30, driver);
		/**
		 * launch the browser with url
		 */
		driver.get(fet.fetchdata("url"));
		/**
		 * login credentials
		 */
		driver.findElement(By.name("username")).sendKeys(fet.fetchdata("un"),Keys.TAB,fet.fetchdata("pwd"),Keys.ENTER);
		/**
		 * logout the application
		 */
		driver.findElement(By.className("logout")).click();
		/**
		 * close the browser
		 */
		de.minimize(driver);
		/**
		 * fetching the date
		 */
		d.getDate();
		System.out.println(d.getDate());//output: Tue Jan 03 20:24:50 IST 2023
		/**
		 * customised date format
		 */
		System.out.println(d.getFormattedDate());
	}
}


	
	
	
	