import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

try {
	WebUI.verifyElementPresent(findTestObject('Home Page/successmsg_addtocart'), 20)
	success_msg = WebUI.getText(findTestObject('Home Page/successmsg_addtocart'))
	expected = success_msg
	WebUI.verifyMatch(success_msg, expected, false)
} catch(Exception e) {
	WebUI.verifyElementVisible(findTestObject('Products/errormsg_qty is not available'))
	WebUI.click(findTestObject('Products/List Size and Colors/select_first_color'))
	WebUI.callTestCase(findTestCase('Pages/Add To Cart/Click Add To Cart'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('Home Page/successmsg_addtocart'), 20)
	success_msg = WebUI.getText(findTestObject('Home Page/successmsg_addtocart'))
	expected = success_msg
	WebUI.verifyMatch(success_msg, expected, false)
}
