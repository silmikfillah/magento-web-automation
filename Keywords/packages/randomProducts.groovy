package packages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.print.attribute.standard.NumberOfDocuments

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

public class randomProducts {
	@Keyword
	def getCategoryHomepage() {
		List<String> givenList = Arrays.asList('Home Page/hyperlinkimg_ecofriendly',
				'Home Page/hyperlinkimg_erin_recommends',
				'Home Page/hyperlinkimg_performance',
				'Home Page/hyperlinkimg_tees',
				'Home Page/hyperlinkimg_yoga_collection')

		Random category = new Random()
		int numberofObjects = 5

		for (int i = 0; i < numberofObjects; i++) {
			String randomCategory = givenList.get(category.nextInt(givenList.size()))
			return randomCategory
			WebUI.waitForElementVisible(findTestObject(randomCategory), 10)
			WebUI.click(findTestObject(randomCategory))
		}
	}
	
	@Keyword
	def getCategoryMenuTops() {
		List<String> givenList = Arrays.asList('Object Repository/Navbar/Menu Product Category/a_Men Hoodies Sweatshirts',
				'Object Repository/Navbar/Menu Product Category/a_Men Jackets',
				'Object Repository/Navbar/Menu Product Category/a_Men Tees',
				'Object Repository/Navbar/Menu Product Category/a_Men Tanks',
				'Object Repository/Navbar/Menu Product Category/a_Women Bras Tanks',
				'Object Repository/Navbar/Menu Product Category/a_Women Hoodies Sweatshirts',
				'Object Repository/Navbar/Menu Product Category/a_Women Jackets',
				'Object Repository/Navbar/Menu Product Category/a_Women Tees')

		Random category = new Random()
		int numberofObjects = 8

		for (int i = 0; i < numberofObjects; i++) {
			String randomCategoryMenu = givenList.get(category.nextInt(givenList.size()))
			return randomCategoryMenu
			WebUI.waitForElementVisible(findTestObject(randomCategoryMenu), 10)
			WebUI.mouseOver(findTestObject(randomCategoryMenu))
			WebUI.click(findTestObject(randomCategoryMenu))
		}
	}
	
	@Keyword
	def getCategoryMenuBottoms() {
		List<String> givenList = Arrays.asList('Object Repository/Navbar/Menu Product Category/a_Men Shorts',
				'Object Repository/Navbar/Menu Product Category/a_Men Pants',
				'Object Repository/Navbar/Menu Product Category/a_Women Shorts',
				'Object Repository/Navbar/Menu Product Category/a_Women Pants')

		Random category = new Random()
		int numberofObjects = 4

		for (int i = 0; i < numberofObjects; i++) {
			String randomCategoryMenu = givenList.get(category.nextInt(givenList.size()))
			return randomCategoryMenu
			WebUI.waitForElementVisible(findTestObject(randomCategoryMenu), 10)
			WebUI.mouseOver(findTestObject(randomCategoryMenu))
			WebUI.click(findTestObject(randomCategoryMenu))
		}
	}
	
	@Keyword
	def getCategoryMenuGear() {
		List<String> givenList = Arrays.asList('Object Repository/Navbar/Menu Product Category/a_Bags',
				'Object Repository/Navbar/Menu Product Category/a_Watches')

		Random category = new Random()
		int numberofObjects = 2

		for (int i = 0; i < numberofObjects; i++) {
			String randomCategoryMenu = givenList.get(category.nextInt(givenList.size()))
			return randomCategoryMenu
			WebUI.waitForElementVisible(findTestObject(randomCategoryMenu), 10)
			WebUI.mouseOver(findTestObject(randomCategoryMenu))
			WebUI.click(findTestObject(randomCategoryMenu))
		}
	}

	@Keyword
	def getProductSizeTops() {
		List<String> givenList = Arrays.asList('Products/List Size and Colors/select_first_size',
				'Products/List Size and Colors/select_second_size',
				'Products/List Size and Colors/select_third_size',
				'Products/List Size and Colors/select_fourth_size',
				'Products/List Size and Colors/select_fifth_size')

		Random size = new Random()
		int numberofObjects = 5

		for (int i = 0; i < numberofObjects; i++) {
			String randomSizeT = givenList.get(size.nextInt(givenList.size()))
			return randomSizeT
			WebUI.waitForElementVisible(findTestObject(randomSizeT), 10)
			WebUI.click(findTestObject(randomSizeT))
		}
	}

	@Keyword
	def getProductColors() {
		List<String> givenList = Arrays.asList('Products/List Size and Colors/select_first_color',
				'Products/List Size and Colors/select_second_color',
				'Products/List Size and Colors/select_third_color')

		Random colors = new Random()
		int numberofObjects = 3

		for (int i = 0; i < numberofObjects; i++) {
			String randomColorsT = givenList.get(colors.nextInt(givenList.size()))
			return randomColorsT
			WebUI.waitForElementVisible(findTestObject(randomColorsT), 10)
			WebUI.click(findTestObject(randomColorsT))
		}
	}
	
	@Keyword
	def getProductSizeBottoms() {
		List<String> givenList = Arrays.asList('Products/List Size and Colors/select_first_size',
				'Products/List Size and Colors/select_second_size')

		Random size = new Random()
		int numberofObjects = 5

		for (int i = 0; i < numberofObjects; i++) {
			String randomSizeB = givenList.get(size.nextInt(givenList.size()))
			return randomSizeB
			WebUI.waitForElementVisible(findTestObject(randomSizeB), 10)
			WebUI.click(findTestObject(randomSizeB))
		}
	}

	@Keyword
	def getQuantity() {
		String quantity = new Random().nextInt(10 - 1 + 1) + 1
		return (quantity)
	}
}
