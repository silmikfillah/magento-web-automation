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
	breadcrumbs = WebUI.getText(findTestObject('Products/Breadcrumbs Nav/breadcrumbnav_fourth'))
	if (breadcrumbs == 'Pants' || breadcrumbs == 'Shorts') {
		if (WebUI.verifyElementVisible(findTestObject('Products/options_label_allsize')) == true) {
			if (size == 'selected') {
				product_sizeB = CustomKeywords.'packages.randomProducts.getProductSizeBottoms'()
				WebUI.click(findTestObject(product_sizeB))
			} else if (size == 'unselected'){
				WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_first_size'), 'aria-checked', 'false', 10)
				WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_second_size'), 'aria-checked', 'false', 10)
			}
		} else {
			WebUI.verifyElementNotPresent(findTestObject('Products/options_label_allsize'), 10)
		}
	} else if (breadcrumbs == 'Jackets' || breadcrumbs == 'Hoodies & Sweatshirts' ||
		breadcrumbs == 'Bras & Tanks' || breadcrumbs == 'Tanks' || breadcrumbs == 'Tees') {
		if (WebUI.verifyElementVisible(findTestObject('Products/options_label_allsize')) == true) {
			if (size == 'selected') {
				product_sizeT = CustomKeywords.'packages.randomProducts.getProductSizeTops'()
				WebUI.click(findTestObject(product_sizeT))
			} else if (size == 'unselected'){
				WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_first_size'), 'aria-checked', 'false', 10)
				WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_second_size'), 'aria-checked', 'false', 10)
				WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_third_size'), 'aria-checked', 'false', 10)
				WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_fourth_size'), 'aria-checked', 'false', 10)
				WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_fifth_size'), 'aria-checked', 'false', 10)
			}
		} else {
			WebUI.verifyElementNotPresent(findTestObject('Products/options_label_allsize'), 10)
		}
	}
} catch(Exception e1) {
	try {
		breadcrumbs01 = WebUI.getText(findTestObject('Products/Breadcrumbs Nav/breadcrumbnav_third'))
		
		if (breadcrumbs01 == 'Watches' || breadcrumbs01 == 'Bags') {
			WebUI.verifyElementNotPresent(findTestObject('Products/options_label_allsize'), 10)
		}
	}
	catch (Exception e2) {
		breadcrumbs02 = WebUI.getText(findTestObject('Products/Breadcrumbs Nav/breadcrumbnav_productname'))
		expected = breadcrumbs02
		
		if (breadcrumbs02 == expected) {
			if (WebUI.verifyElementVisible(findTestObject('Products/options_label_allsize')) == true) {
				if (size == 'selected') {
					product_sizeB = CustomKeywords.'packages.randomProducts.getProductSizeBottoms'()
					WebUI.click(findTestObject(product_sizeB))
				} else if (size == 'unselected'){
					WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_first_size'), 'aria-checked', 'false', 10)
					WebUI.verifyElementAttributeValue(findTestObject('Products/List Size and Colors/select_second_size'), 'aria-checked', 'false', 10)
				}
			} else {
				WebUI.verifyElementNotPresent(findTestObject('Products/options_label_allsize'), 10)
			}
		}
	}
}

