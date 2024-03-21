package sit707_week2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.

		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();

		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement firstname = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + firstname);
		// Send first name
		firstname.sendKeys("Ritam");
		
		WebElement lastname = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lastname);
		// Send first name
		lastname.sendKeys("Rao");
		
		WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + phoneNumber);
		// Send first name
		phoneNumber.sendKeys("041234567");
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		// Send first name
		email.sendKeys("xyz@abc.com");
		
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + password);
		// Send first name
		password.sendKeys("xyz@abc.com");
		
		WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + confirmPassword);
		// Send first name
		confirmPassword.sendKeys("xyz@abc.com");
		

		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
		System.out.println("Found element: " + button);
	
		button.click();
		/*
		 * Take screenshot using selenium API.
		 */
		try {
			takeSnapShot(driver, "C:\\Users\\ritam\\Documents\\Deakin T2\\SIT 707\\Week 2\\officeworks.jpg") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		// Write code
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void myer_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.

		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();

		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		// Send first name
		email.sendKeys("xyz@abc.com");
		
		WebElement buttonjoin = driver.findElement(By.id("join"));
		System.out.println("Found element: " + buttonjoin);
		
		buttonjoin.click();
		
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + password);
		// Send first name
		password.sendKeys("xyz@abc.com");
		
		// Find first input field which is firstname
		WebElement firstname = driver.findElement(By.id("first-name"));
		System.out.println("Found element: " + firstname);
		// Send first name
		firstname.sendKeys("Ritam");
		
		WebElement lastname = driver.findElement(By.id("last-name"));
		System.out.println("Found element: " + lastname);
		// Send first name
		lastname.sendKeys("Rao");
		
		WebElement phoneNumber = driver.findElement(By.id("mobile-phone"));
		System.out.println("Found element: " + phoneNumber);
		// Send first name
		phoneNumber.sendKeys("041234567");
		
		
		WebElement dob = driver.findElement(By.id("date-of-birth"));
		System.out.println("Found element: " + dob);
		// Send first name
		dob.sendKeys("02/06/2001");
		
		WebElement address = driver.findElement(By.id("address"));
		System.out.println("Found element: " + address);
		// Send first name
		address.sendKeys("11 Mall Court, BLACKBURN NORTH  VIC 3130");
		
		WebElement addbutton = driver.findElement(By.xpath("/html/body/div/div[4]/div[1]/form/ul/li"));
		System.out.println("Found element: " + addbutton);
		addbutton.click();
		
		
		WebElement button = driver.findElement(By.id("create-account"));
		System.out.println("Found element: " + button);
		button.click();
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code

	
		
		/*
		 * Take screenshot using selenium API.
		 */
		try {
			takeSnapShot(driver, "C:\\Users\\ritam\\Documents\\Deakin T2\\SIT 707\\Week 2\\myer.jpg") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		// Write code
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	

}
