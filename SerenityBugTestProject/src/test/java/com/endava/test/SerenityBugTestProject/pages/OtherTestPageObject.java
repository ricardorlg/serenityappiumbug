package com.endava.test.SerenityBugTestProject.pages;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OtherTestPageObject extends MobilePageObject {
	public OtherTestPageObject(WebDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.example.android.testing.notes:id/add_note_title")
	private MobileElement noteTittle;
	@AndroidFindBy(id = "com.example.android.testing.notes:id/add_note_description")
	private MobileElement noteDescription;

	public void fill_fields(String tittle, String description) {
		noteTittle.sendKeys(tittle);
		noteDescription.sendKeys(description);
	}
}
