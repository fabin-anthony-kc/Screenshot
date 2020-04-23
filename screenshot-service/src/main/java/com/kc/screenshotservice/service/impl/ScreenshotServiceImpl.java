package com.kc.screenshotservice.service.impl;

import java.io.File;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.kc.screenshotservice.service.ScreenshotService;

@Service
public class ScreenshotServiceImpl implements ScreenshotService {

	@Override
	public String captureScreenshot(String url) {
		try {
			System.setProperty("webdriver.chrome.driver", "../chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get(url);
			Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, 500, true).withName("Screenshot").save("../screenshots/");
			Thread.sleep(3000);

			byte[] fileContent = FileUtils.readFileToByteArray(new File("../screenshots/Screenshot.png"));
			String encodedString = Base64.getEncoder().encodeToString(fileContent);

			driver.quit();
			return encodedString;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
