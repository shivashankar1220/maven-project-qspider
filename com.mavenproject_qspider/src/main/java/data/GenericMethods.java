package data;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;
import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.doclet.Reporter;

public class GenericMethods {
	/**
	 * this method is used to open the Chromebrowser
	 */
//	public void getchrome(String str,WebDriver driver)
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//	}
	/**
	 * this method is used to maximize the window page
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to minimize the window page
	 */
	public void minimize(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/**
	 * this method is used to resize the browser window page
	 */
	public void resize(int width,int height,WebDriver driver)
	{
		org.openqa.selenium.Dimension dim=new org.openqa.selenium.Dimension(width,height);
		driver.manage().window().setSize(dim);
	}
	/**
	 * this method is used to forward our web page
	 */
	public void forward(WebDriver driver)
	{
		driver.navigate().forward();
	}
	/**
	 * this method is used to refresh our web page
	 */
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	/**
	 * this method is used to backward the window page
	 */
	public void backward(WebDriver driver)
	{
		driver.navigate().back();
	}
	/**
	 * this method is used to identify the html element by using xpath expression.
	 */
	public void xpath(String element,WebDriver driver)
	{
		driver.findElement(By.xpath("element"));
	}
	/**
	 * this method is used to remove the dublicates
	 */
	public int random()
	{
		Random r=new Random();
		int num=r.nextInt(1000);
		return num;
	}
	/**
	 * this method is used to scroll the Web page
	 * @param x
	 * @param y
	 */
	public void scrollHandling(int x,int y,WebDriver driver)
	{
		JavascriptExecutor s=(JavascriptExecutor)driver;
		s.executeScript("window.scrollBy("+x+","+y+");");
	}
	/**
	 * this method is used for implicit wait
	 */
	public void implicitwait(int value,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
	}
	/**
	 this method is used for explicit wait
	 */
	public void explicitwait(int value,WebElement ele,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(value));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("ele")));
	}
	/**
	 * this method is used for explicit wait for visiblityof elements
	 */
	public void explicitwait2(int value,WebElement ele2,WebDriver driver)
	{
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(value));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ele2")));
		
	}
	/**
	 * this method is used to move the mouse to the element
	 */
	public void movetoelement(WebElement ele,WebDriver driver)
	{
		Actions act1=new Actions(driver);
		act1.moveToElement(ele).perform();
	}
	/**
	 * this methos is used to drag and drop the element
	 */
	public void draganddrop(WebElement ele1,WebElement ele2,WebDriver driver)
	{
		Actions act2=new Actions(driver);
		act2.dragAndDrop(ele1, ele2).perform();
	}
	/**
	 * this method is used to right click the webelement
	 */
	public void rightclick(WebElement ele3,WebDriver driver)
	{
		Actions act3=new Actions(driver);
		act3.moveToElement(ele3).contextClick().build().perform();
	}
	/**
	 * this method is used to double click
	 */
	public void doubleclick(WebElement ele4,WebDriver driver)
	{
		Actions act4=new Actions(driver);
		act4.doubleClick(ele4).perform();
	}
	/**
	 * this method is used to handle the drop down list
	 * @throws Throwable 
	 */
	public void robot() throws Throwable
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	/**
	 * this method is used to drop down the list by using select index number
	 */
	public void selectbyindex(int value,WebElement ele)
	{
		Select s=new Select(ele);
		s.selectByIndex(value);
		s.deselectByIndex(value);
	}
	/**
	 * this method is used to drop down the list by using select value method
	 */
	public void selectbyvalue(String str1,WebElement ele1)
	{
		Select s=new Select(ele1);
		s.selectByValue(str1);
		s.deselectByValue(str1);
	}
	/**
	 * this method is used to drop down the list by using select visible method
	 */
	public void selectbyvisible(String str2,WebElement ele2)
		{
			Select s=new Select(ele2);
			s.selectByVisibleText(str2);
			s.deselectByVisibleText(str2);
		}
	/**
	 * this method is used to alert the popup,it will click ok
	 */
	public void alertOk(WebDriver driver)
	{
		driver.switchTo().alert().accept();//need to specify the full content
	}
	/**
	 * handle the alert popup,it will click on cancel
	 */
	public void alertcancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();//need to specify the full content
	}
	/**
	 * handle the alert popup,it will return the text 
	 */
	public String alertgettext(WebDriver driver)
	{
		String ar=driver.switchTo().alert().getText();
		return ar;
	}
	/**
	 * this method is used to write data into the alert popup
	 */
	public void alertwritedata(String write,WebDriver driver)
	{
		driver.switchTo().alert().sendKeys(write);
	}
	/**
	 * this method is used to validate the data
	 */
	public void hardassertion(String data1,String data2)
	{
		Assert.assertEquals(data1, data2);
		org.testng.Reporter.log("assertion validate ok",true);
	}
	/**
	 * handle the frame by frame indexing
	 */
	public void frameindexing(int index,WebDriver driver)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * handle the frame by webelement
	 */
	public void frameElement(String ele,WebDriver driver)
	{
		driver.switchTo().frame(ele);
	}
	/**
	 * handle the frame by string
	 */
	public void frameString(String str,WebDriver driver)
	{
		driver.switchTo().frame(str);
	}
	/**
	* handling multiple windows popup
	 */
	public void windowHandles(String tit,WebDriver driver)
	{
		Set<String> str=driver.getWindowHandles();
		for(String i:str)
		{
			String title=driver.switchTo().window(i).getTitle();
			if(title.contains(tit))
			{
				break;
			}
		}
	}
	/**
	 * this method is used to take the screen shot
	 */
	public void screenshot(WebDriver driver)
	{
		TakesScreenshot sh=(TakesScreenshot)driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dist=new File("");
		try {
			Files.copy(src,dist);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * this method is used for cutomised wait as per user choise
	 */
	public void customised_wait(WebElement ele) throws Throwable
	{
	int x=1;
	while(x<=10)
		try {
			ele.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			x++;
		}
	{
		
	}
		
	}
	
	
}




