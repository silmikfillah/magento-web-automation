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

if (qty == 'minicart') {
	WebUI.clearText(findTestObject('Mini Cart/input_quantity'))
	randomQty01 = CustomKeywords.'packages.randomProducts.getQuantity'()
	WebUI.sendKeys(findTestObject('Mini Cart/input_quantity'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Mini Cart/input_quantity'), randomQty01)
} else if (qty == 'shopping_cart') {
	WebUI.clearText(findTestObject('Shopping Cart/input_Qty first product'))
	randomQty02 = CustomKeywords.'packages.randomProducts.getQuantity'()
	//WebUI.sendKeys(findTestObject('Mini Cart/input_quantity'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Shopping Cart/input_Qty first product'), randomQty02)
} else if (qty == 'products') {
	WebUI.clearText(findTestObject('Products/input_quantity'))
	randomQty03 = CustomKeywords.'packages.randomProducts.getQuantity'()
	WebUI.sendKeys(findTestObject('Products/input_quantity'), randomQty03)
} else if (qty == 'empty') {
	WebUI.clearText(findTestObject('Mini Cart/input_quantity'))
	WebUI.setText(findTestObject('Products/input_quantity'), '0')
}