package yourstore.Ecommerce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static Properties prop;
	public static  WebDriver driver;
	public static String browserName;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	public void loadConfig() throws Exception {
		try {
	FileInputStream fis=new FileInputStream( "C:\\Users\\kondapalli.krishna\\eclipse-workspace\\Ecommerce\\Configuratons\\config.properties");
	Properties prop=new Properties();
	prop.load(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
				
			}
	
	}
	
	public  static void LaunchApp() throws Exception {
		WebDriverManager.chromedriver().setup();
		 browserName= "chrome";
		
		if(browserName.contains("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browserName.contains("Firefox"))
		{
			 driver=new FirefoxDriver();
		}else if (browserName.contains("IE"))
		{
		  driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo");
		Thread.sleep(4000);
	}


}
