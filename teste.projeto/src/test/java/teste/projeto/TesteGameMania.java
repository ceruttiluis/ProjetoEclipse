package teste.projeto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania {

	private WebDriver driver;
	
	
	//Inicio
	@Before
	public void TesteConfig() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	//teste
	@Test
	public void TesteNavegabilidade () {
		
		try {
		driver.get("http://localhost:4200/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//nav[1]/div[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("luis@email.co");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("luis@email.com");
		driver.findElement(By.id("password")).sendKeys("senhaluis");
		Thread.sleep(3000);
		driver.findElement(By.id("enviar")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		
		//driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		//driver.findElement(By.id("Busca1_btnBusca")).click();
		//driver.findElement(By.id("Busca1_btnBusca")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"nav\"]/li[7]/a")).click();
	}
		
	//finalização
	@After
		public void EndConfig() {
		
		driver.quit();
	}
	
	
	
	
}

