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



class Logout {
	@Given("I already login the website")
	public void i_already_login_the_website() {
		WebUI.callTestCase(findTestCase('Steps Definition/Feature Login/LGN01 - User login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I expand Header Menu")
	public void i_expand_Header_Menu() {
		WebUI.callTestCase(findTestCase('Pages/Header and Navbar/Expand Header Menu'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I click Sign Out Menu")
	public void i_click_signout_Menu() {
		WebUI.callTestCase(findTestCase('Pages/Header and Navbar/Click Sign Out'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("I signed out from the website successfully")
	public void i_signedout_from_the_website_successfully() {
		WebUI.callTestCase(findTestCase('Pages/Header and Navbar/Verify Success Sign Out'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}