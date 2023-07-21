package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.json.StringEscapeUtils
import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class CreateNewAccount {
	@Given("I already access the website and go to Create an Account page")
	public void i_already_access_the_website_and_go_to_Create_an_Account_page() {
		WebUI.openBrowser('https://magento.softwaretestingboard.com/')
		WebUI.callTestCase(findTestCase('Pages/Header and Navbar/Click Create an Account from Header'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I input First Name for create account (.*)")
	public void i_input_First_Name_for_create_account(String first_name) {
		WebUI.callTestCase(findTestCase('Pages/Create New Account/Input First Name'), [('first_name') : first_name], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I input Last Name for create account (.*)")
	public void i_input_Last_Name_for_create_account(String last_name) {
		WebUI.callTestCase(findTestCase('Pages/Create New Account/Input Last Name'), [('last_name') : last_name], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I want to input Email for create account (.*)")
	public void Email_for_createaccount(String email) {
		WebUI.callTestCase(findTestCase('Pages/Create New Account/Input Email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I want to input Password for create account (.*)")
	public void Password_for_create_account(String password) {
		WebUI.callTestCase(findTestCase('Pages/Create New Account/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I input Confirm Password for create account (.*)")
	public void i_input_Confirm_Password_for_create_account(String confirm_password) {
		WebUI.callTestCase(findTestCase('Pages/Create New Account/Input Confirm Password'), [('confirm_password') : confirm_password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I click Create an Account button")
	public void i_click_createaccount_button() {
		WebUI.callTestCase(findTestCase('Pages/Create New Account/Click Button Create Account'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I should see the next step for Create an Account: (.*)")
	public void i_should_see_the_next_step_for_Create_an_Account(String status) {
		WebUI.callTestCase(findTestCase('Pages/Create New Account/Verify Test Result with Condition'), [('status') : status], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}
