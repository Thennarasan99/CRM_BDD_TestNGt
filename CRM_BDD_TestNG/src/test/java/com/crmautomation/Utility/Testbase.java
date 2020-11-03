package com.crmautomation.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;
	public static WebElement select;

	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream inputStream = new FileInputStream(
					"D:\\CRM_BDD_TestNG\\src\\test\\resources\\resources\\browser-config.properties");
			FileInputStream inputStream1 = new FileInputStream(
					"D:\\CRM_BDD_TestNG\\src\\test\\resources\\resources\\contacts-datas");
			prop.load(inputStream);
			prop.load(inputStream1);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void Initianlizaion() {
		if (prop.getProperty("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\CRM_BDD_TestNG\\src\\test\\resources\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));

		} else if (prop.getProperty("browser").equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					"D:\\\\CRM_BDD_TestNG\\\\src\\\\test\\\\resources\\\\drivers\\\\chromedriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "accept");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability("ignoreZoomSetting", true);
			capabilities.setCapability("requireWindowFocus", true);// to move mouse manually
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));

		} else if (prop.getProperty("browser").equals("Firefox")) {
			System.setProperty("webdriver.ie.driver",
					"D:\\\\CRM_BDD_TestNG\\\\src\\\\test\\\\resources\\\\drivers\\\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));

		}

	}

	public static void select_Dropdown(WebElement select, String expectedvalue) {
		Select sel = new Select(select);
		List<WebElement> options = ((WebDriver) sel).findElements(By.tagName("option"));
		for (WebElement option : options) {
			if (expectedvalue.equals(option.getText()))
				option.click();
		}
	}

	public static boolean retryingFindClick(WebElement view) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 3) {
			try {
				driver.findElement((By) view).click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public static void get_table_value(String tobeclick) throws Exception {

		WebElement table = driver
				.findElement(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']"));

		List<WebElement> allRows = table.findElements(By.tagName("tr"));

		try {
			for (WebElement row : allRows) {
				if (row.getText().contains(tobeclick)) {
					row.click();
					driver.findElement(By.xpath("//i[@class='unhide icon']")).click();
					Thread.sleep(3000);
					break;

				}
//			List<WebElement> cells = row.findElements(By.tagName("td"));
//
//			for (WebElement cell : cells) {

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
