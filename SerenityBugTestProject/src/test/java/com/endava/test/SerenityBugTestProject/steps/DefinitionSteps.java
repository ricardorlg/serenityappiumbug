package com.endava.test.SerenityBugTestProject.steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.endava.test.SerenityBugTestProject.steps.serenity.EndUserSteps;

import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

	@Steps
	EndUserSteps james;

	@Alias("James wants to add another note")
	@Given("James wants to add a note")
	public void givenJamesWantsToAddAnotherNote() {
		james.wants_to_add_a_note();

	}

	@When("James fill the note screen")
	public void whenJamesFillTheNoteScreen() {
		james.fills_form("A test Note", "Description Note");
	}

	@When("Save the note")
	public void whenSaveTheNote() {
		james.saves_note();
	}

	@Then("He should see his new Note")
	public void thenHeShouldSeeHisNewNote() {
		// PENDING
	}

}
