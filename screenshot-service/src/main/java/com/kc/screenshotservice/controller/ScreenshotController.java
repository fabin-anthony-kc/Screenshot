package com.kc.screenshotservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kc.screenshotservice.service.ScreenshotService;

@RequestMapping("/api/v1")
@RestController
public class ScreenshotController {

	@Autowired
	private ScreenshotService screenshotService;

	@GetMapping("/capture")
	public String getScreenshotImage(@RequestParam String url) {
		try {
			return this.screenshotService.captureScreenshot(url);
		} catch (Exception e) {
			return e.getMessage();
		}

	}

}
