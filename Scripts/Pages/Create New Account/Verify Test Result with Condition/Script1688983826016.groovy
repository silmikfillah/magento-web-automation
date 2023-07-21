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
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Verify Success Create Account'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'invalid email') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Invalid Email'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'registered email') {
	WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Registered Email'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'password criteria') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Verify Password Minimum 3 Classes Criteria'), 
        [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'password less than 8') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Verify Password Minimum 8 Characters'), 
        [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'invalid confirm password') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Invalid Confirm Password'), 
        [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required email') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required Email'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required password') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required Password'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required confirm password') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required Confirm Password'), 
        [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required first name') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required First Name'), [
            ('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required last name') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required Last Name'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required all fields') {
    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required First Name'), [
            ('expected') : ''], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required Last Name'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required Email'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required Password'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Pages/Create New Account/Read Error Message/Read Error Msg Required Confirm Password'), 
        [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
}

