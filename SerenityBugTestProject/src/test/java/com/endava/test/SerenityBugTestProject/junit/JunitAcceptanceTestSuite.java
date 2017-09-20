package com.endava.test.SerenityBugTestProject.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.endava.test.SerenityBugTestProject.steps.serenity.EndUserSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class JunitAcceptanceTestSuite {
	@Managed(uniqueSession = false)
	public WebDriver webdriver;

	@Steps
	public EndUserSteps james;

	@Test
	public void one_appium_scenario() {
		james.wants_to_add_a_note();
		james.fills_form("A test Note", "Description Note");
		james.saves_note();

	}

	@Test
	public void other_appium_scenario() {
		james.wants_to_add_a_note();
		james.fills_form("Other Thes Note", "Other Description Note");
		james.saves_note();
	}
}
