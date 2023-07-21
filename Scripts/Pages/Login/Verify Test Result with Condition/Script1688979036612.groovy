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

if (status == 'success') {
    WebUI.callTestCase(findTestCase('Pages/Login/Verify Success Login'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'incorrect account') {
    WebUI.callTestCase(findTestCase('Pages/Login/Read Error Msg Incorrect Account'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required email') {
    WebUI.callTestCase(findTestCase('Pages/Login/Read Error Msg Required Email'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required password') {
    WebUI.callTestCase(findTestCase('Pages/Login/Read Error Msg Required Password'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'invalid email') {
    WebUI.callTestCase(findTestCase('Pages/Login/Read Error Msg Invalid Email'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required all fields') {
	WebUI.callTestCase(findTestCase('Pages/Login/Read Error Msg Required Email'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Pages/Login/Read Error Msg Required Password'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
}

