package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicconcept {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		String getTitle=driver.getTitle();
		System.out.println("page Title..."+getTitle);
		String Url=driver.getCurrentUrl();
		System.out.println("current browser..."+Url);
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.linkText("JALA Academy"));
		String showName=name.getText();
		System.out.println(showName);
		name.isDisplayed();
		Thread.sleep(3000);
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Email or Mobile No']"));
		userName.sendKeys("training@jalaacademy.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("jobprogram");
		WebElement btn=driver.findElement(By.xpath("//button[@type='button']"));
		driver.close();
		driver.quit();
		
		

	}

}
