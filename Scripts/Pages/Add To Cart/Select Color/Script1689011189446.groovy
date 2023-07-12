import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.Color

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

if (WebUI.verifyElementText(findTestObject('Products/Title Product Page/title_Men Tanks'), 'Tanks') == true ||
	WebUI.verifyElementText(findTestObject('Products/Title Product Page/title_Performance Fabrics'), 'Performance Fabrics') == true) {
	if (WebUI.verifyElementVisible(findTestObject('Products/options_label_allcolors')) == true) {
		if (color == 'selected') {
			WebUI.click(findTestObject('Products/select_first_color'))
		} else (color == 'unselected'){
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_first_color'), 'aria-checked' == 'false', 10)
		}
	} else {
		WebUI.verifyElementNotVisible(findTestObject('Products/options_label_allcolors'))
	}
} else {
	if (WebUI.verifyElementVisible(findTestObject('Products/options_label_allcolors')) == true) {
		if (color == 'selected') {
			product_colors = CustomKeywords.'packages.randomProducts.getProductColors'()
			WebUI.click(findTestObject(product_colors))
		} else (color == 'unselected'){
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_first_color'), 'aria-checked' == 'false', 10)
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_second_color'), 'aria-checked' == 'false', 10)
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_third_color'), 'aria-checked' == 'false', 10)
		}
	} else {
		WebUI.verifyElementNotVisible(findTestObject('Products/options_label_allcolors'))
	}
}

