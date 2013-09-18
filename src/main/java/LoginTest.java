
import java.util.List;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LandingPage;

public class LoginTest {
	
	public static LandingPage landingPage = new LandingPage();

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get(landingPage.url);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
