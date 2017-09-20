package com.endava.test.SerenityBugTestProject.pages;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TestPageObject extends MobilePageObject {

	public TestPageObject(WebDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.example.android.testing.notes:id/fab_add_notes")
	private MobileElement addNoteButton;

	public void addNote() {
		addNoteButton.click();
	}

}
