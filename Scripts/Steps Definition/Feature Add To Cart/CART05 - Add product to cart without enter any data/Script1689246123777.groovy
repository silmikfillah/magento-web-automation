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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import javassist.bytecode.stackmap.BasicBlock.Catch as Catch
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Steps Definition/Feature Login/LGN01 - User login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add To Cart/Click Category Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add To Cart/Hover to Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add To Cart/Click A Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add To Cart/Select Size from Product Page'), [('size') : 'unselected'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add To Cart/Select Color from Product Page'), [('color') : 'unselected'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add To Cart/Input Quantity'), [('quantity') : 'empty'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add To Cart/Click Add To Cart'), [:], FailureHandling.STOP_ON_FAILURE)

breadcrumbs = WebUI.getText(findTestObject('Products/Breadcrumbs Nav/breadcrumbnav_third'))
if (breadcrumbs == 'Bags' || breadcrumbs == 'Watches') {
	WebUI.callTestCase(findTestCase('Pages/Add To Cart/Read Error Msg Required Quantity'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else {
	WebUI.callTestCase(findTestCase('Pages/Add To Cart/Read Error Msg Required Size'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Pages/Add To Cart/Read Error Msg Required Color'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Pages/Add To Cart/Read Error Msg Required Quantity'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
}