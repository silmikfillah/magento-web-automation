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

Random rand = new Random()
upperLimit = 4
category = rand.nextInt(upperLimit)

switch (category) {
	case 0:
		category01 = CustomKeywords.'packages.randomProducts.getCategoryHomepage'()
		WebUI.click(findTestObject(category01))
		break;
	case 1:
		category02 = CustomKeywords.'packages.randomProducts.getCategoryMenuTops'()
		if (category02 == 'Object Repository/Navbar/Menu Product Category/a_Men Hoodies Sweatshirts' ||
			category02 == 'Object Repository/Navbar/Menu Product Category/a_Men Jackets' ||
			category02 == 'Object Repository/Navbar/Menu Product Category/a_Men Tees' ||
			category02 == 'Object Repository/Navbar/Menu Product Category/a_Men Tanks') {
			WebUI.mouseOver(findTestObject('Navbar/a_Men'))
			WebUI.mouseOver(findTestObject('Navbar/a_TopsMen'))
			WebUI.click(findTestObject(category02))
		} else if (category02 == 'Object Repository/Navbar/Menu Product Category/a_Women Bras Tanks' ||
				category02 == 'Object Repository/Navbar/Menu Product Category/a_Women Hoodies Sweatshirts' ||
				category02 == 'Object Repository/Navbar/Menu Product Category/a_Women Jackets' ||
				category02 == 'Object Repository/Navbar/Menu Product Category/a_Women Tees') {
				WebUI.mouseOver(findTestObject('Navbar/a_Women'))
				WebUI.mouseOver(findTestObject('Navbar/a_TopsWomen'))
				WebUI.click(findTestObject(category02))
		}
		break;
	case 2:
		category03 = CustomKeywords.'packages.randomProducts.getCategoryMenuBottoms'()
		if (category03 == 'Object Repository/Navbar/Menu Product Category/a_Men Shorts' ||
			category03 == 'Object Repository/Navbar/Menu Product Category/a_Men Pants') {
			WebUI.mouseOver(findTestObject('Navbar/a_Men'))
			WebUI.mouseOver(findTestObject('Navbar/a_BottomsMen'))
			WebUI.click(findTestObject(category03))
		} else if (category03 == 'Object Repository/Navbar/Menu Product Category/a_Women Shorts' ||
				category03 == 'Object Repository/Navbar/Menu Product Category/a_Women Pants') {
				WebUI.mouseOver(findTestObject('Navbar/a_Women'))
				WebUI.mouseOver(findTestObject('Navbar/a_BottomsWomen'))
				WebUI.click(findTestObject(category03))
		}
		break;
	case 3:
		category04 = CustomKeywords.'packages.randomProducts.getCategoryMenuGear'()
		WebUI.mouseOver(findTestObject('Navbar/a_Gear'))
		WebUI.click(findTestObject(category04))
		break;
	default:
		WebUI.comment("Whoops!")
		break;
}
