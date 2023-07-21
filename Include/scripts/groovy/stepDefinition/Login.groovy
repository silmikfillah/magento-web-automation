package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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



class Login {
	@Given("I already access the website and go to Login page")
	public void i_already_access_the_website_and_go_to_Login_page() {
		WebUI.openBrowser('https://magento.softwaretestingboard.com/')
		WebUI.callTestCase(findTestCase('Pages/Header and Navbar/Click Sign In from Header'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I input Email (.*)")
	public void i_input_Email(String email) {
		if (email == 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : ''], FailureHandling.STOP_ON_FAILURE)
		} else {
			WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		}
	}
	
	@When("I input Password (.*)")
	public void i_input_Password(String password) {
		if (password == 'empty') { 
			WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : ''], FailureHandling.STOP_ON_FAILURE)
		} else {
			WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
		}
	}
			
	@When("I click Sign In button")
	public void i_click_Sign_In_button() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Sign In'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("I should see the next step for login: (.*)")
	public void i_should_see_the_next_step_for_login(String status) {
		WebUI.callTestCase(findTestCase('Pages/Login/Verify Test Result with Condition'), [('status') : status], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}