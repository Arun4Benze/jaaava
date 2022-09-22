package org.banking.guru99;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\BankingProjectGuru99\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/");
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='uid']"));
		txtUserName.sendKeys("mngr430259");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("AbehYmy");
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		TakesScreenshot tss=(TakesScreenshot) driver;
		File file = tss.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("E:\\Selenium Banking Guru99\\Home.png");
		FileUtils.copyFile(file, dstFile);
		
	}

}
