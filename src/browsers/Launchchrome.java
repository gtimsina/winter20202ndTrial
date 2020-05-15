package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:.\\Drivers\\chromedriver.exe");
    // the orginal path is C:\Users\timsi\Winter2020\LaunchBrowser\Drivers\chromedriver.exe 
    // we can delete up and create as above.
    
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	     Thread.sleep(3000);
		driver.close();
	}
}
