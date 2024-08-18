package org.booking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("srinipmps@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8@ndHEw5TfaLm5e");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@data-testid='username']")).getText());

	}

}
