package packages

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

import internal.GlobalVariable
import net.sf.jasperreports.engine.export.GenericElementReportTransformer

public class randomAddress_Checkout {
	@Keyword
	def getAddress() {
		List<String> givenList = Arrays.asList('Checkout Page/Select Shipping Address/button_Ship Here_first',
			'Checkout Page/Select Shipping Address/button_Ship Here_second',
			'Checkout Page/Select Shipping Address/button_Ship Here_third')
		
		Random address = new Random()
		int numberofObjects = 3
		
		for (int i = 0; i < numberofObjects; i++) {
			String randomAddress = givenList.get(address.nextInt(givenList.size()))
			return randomAddress
			WebUI.waitForElementVisible(findTestObject(randomAddress), 10)
			WebUI.click(findTestObject(randomAddress))
		}
	}
	
	@Keyword
	def getShippingMethod() {
		List<String> givenList = Arrays.asList('Checkout Page/input_shippingmethod_BestWay',
			'Checkout Page/input_shippingmethod_FlatRate')
		
		Random methods = new Random()
		int numberofObjects = 2
		
		for (int i = 0; i < numberofObjects; i++) {
			String randomMethods = givenList.get(methods.nextInt(givenList.size()))
			return randomMethods
			WebUI.waitForElementVisible(findTestObject(randomMethods), 10)
			WebUI.click(findTestObject(randomMethods))
		}
	}
}
