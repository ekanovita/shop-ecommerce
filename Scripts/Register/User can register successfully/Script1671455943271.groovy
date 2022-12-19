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

WebUI.callTestCase(findTestCase('Register/User can access register page'), [:], FailureHandling.STOP_ON_FAILURE)

int RN;
RN = (int)(Math.random()*500)
GlobalVariable.username = 'qatest'+RN
WebUI.setText(findTestObject('Register Page/txt_Username'), GlobalVariable.username)

GlobalVariable.email = 'ekatesting122022+'+RN+'@gmail.com'
WebUI.setText(findTestObject('Register Page/txt_Email'), GlobalVariable.email)


WebUI.setText(findTestObject('Register Page/txt_PhoneNumber'), GlobalVariable.phoneNumber)

WebUI.setText(findTestObject('Register Page/txt_Password'), GlobalVariable.password)

WebUI.setText(findTestObject('Register Page/txt_ConfirmPassword'), GlobalVariable.confirmPassword)

WebUI.setText(findTestObject('Register Page/txt_Address'), GlobalVariable.address)

WebUI.click(findTestObject('Register Page/btn_Register'))

WebUI.waitForElementPresent(findTestObject('My Account Page/menu_Myaccount'), 2)

WebUI.verifyElementText(findTestObject('My Account Page/h1_userLogin'), GlobalVariable.username)

WebUI.callTestCase(findTestCase('Onboarding/User can close the browser'), [:], FailureHandling.STOP_ON_FAILURE)

