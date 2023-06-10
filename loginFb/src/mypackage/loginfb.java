package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver,chrome,driver","E:\\Softwares\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}

}
