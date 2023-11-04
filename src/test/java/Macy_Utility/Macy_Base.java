package Macy_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Macy_Base {

	public static WebDriver driver;
	public static Properties MacPro;
	
	public Macy_Base() {
	try {
		FileInputStream macFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Macy_Config//Macy_Config.Properties"));	
		MacPro = new Properties();	
		MacPro.load(macFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
	public void MacBrowser() {
		
	String macAllbrowser = MacPro.getProperty("MacBrowser1");
	if(macAllbrowser.equalsIgnoreCase("Chrome")) {
	System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//Macy_ChromeDriver//chromedriver.exe"));
	ChromeOptions ss = new ChromeOptions();
	ss.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Macy_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Macy_Utiliti.implicitlyWait));
	driver.manage().window().maximize();	
		
	}
	else if(macAllbrowser.equalsIgnoreCase("Edge")) {	
	System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//Macy_EdgeDriver//msedgedriver.exe"));	
	EdgeOptions ss1 = new EdgeOptions();
	ss1.addArguments("--remote-allow-origins=*");
	driver = new EdgeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Macy_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Macy_Utiliti.implicitlyWait));
	driver.manage().window().maximize();	
		
	}
	}
	
	public static void MacLaunchURL(String URL) {
		driver.get(MacPro.getProperty("MacURL"));
		
		
	}
	
	
}
