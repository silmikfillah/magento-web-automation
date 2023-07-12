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

if (WebUI.verifyElementText(findTestObject('Products/Title Product Page/title_Pants'), 'Pants') == true || 
	WebUI.verifyElementText(findTestObject('Products/Title Product Page/title_Shorts'), 'Shorts') == true ||
	WebUI.verifyElementText(findTestObject('Products/Title Product Page/title_Eco Friendly'), 'Eco Friendly') == true ||
	WebUI.verifyElementText(findTestObject('Products/Title Product Page/title_New Luma Yoga Collection'), 'New Luma Yoga Collection') == true) {
	if (WebUI.verifyElementVisible(findTestObject('Products/options_label_allsize')) == true) {
		if (size == 'selected') {
			product_sizeB = CustomKeywords.'packages.randomProducts.getProductSizeBottoms'()
			WebUI.click(findTestObject(product_sizeB))
		} else if (size == 'unselected'){
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_first_size'), 'aria-checked' == 'false', 10)
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_second_size'), 'aria-checked' == 'false', 10)
		}
	} else {
		WebUI.verifyElementNotVisible(findTestObject('Products/options_label_allsize'))
	}
} else {
	if (WebUI.verifyElementVisible(findTestObject('Products/options_label_allsize')) == true) {
		if (size == 'selected') {
			product_sizeT = CustomKeywords.'packages.randomProducts.getProductSizeTops'()
			WebUI.click(findTestObject(product_sizeT))
		} else if (size == 'unselected'){
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_first_size'), 'aria-checked' == 'false', 10)
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_second_size'), 'aria-checked' == 'false', 10)
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_third_size'), 'aria-checked' == 'false', 10)
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_fourth_size'), 'aria-checked' == 'false', 10)
			WebUI.verifyElementHasAttribute(findTestObject('Products/List Size and Colors/select_fifth_size'), 'aria-checked' == 'false', 10)
		}
	} else {
		WebUI.verifyElementNotVisible(findTestObject('Products/options_label_allsize'))
	}
}
