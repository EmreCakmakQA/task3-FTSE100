package stepdef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetRisersAndFallers {
	private static WebDriver driver;
	private static String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	}

	@After
	public void tearDown() {
		driver.close();
	}
	
	@Given("^I can open the site$")
	public void i_can_open_the_site() throws InterruptedException {
		driver.get(URL);
		assertEquals("FTSE 100 Market overview | Hargreaves Lansdown", driver.getTitle());
		Thread.sleep(2000);
	}

	@When("^I click risers$")
	public void i_click_risers() throws InterruptedException {
		driver.findElement(By.cssSelector("#acceptCookie")).click();
		// Riser xpath
		driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[4]/div[1]/ul/li[2]/a/strong")).click();
		Thread.sleep(2000);

	}
	
	

	@When("^fallers$")
	public void fallers() {
		System.out.println("test");
	}

	@Then("^I get their names$")
	public void i_get_their_names() {
		System.out.println("test");
	}
}
