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

WebUI.callTestCase(findTestCase('Onboarding/User can access website successfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Onboarding Page/menu_Register Now'))

WebUI.waitForElementPresent(findTestObject('Register Page/h1_RegisterNow'), 2)

WebUI.verifyElementPresent(findTestObject('Register Page/h1_RegisterNow'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/txt_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/lbl_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/txt_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/lbl_PhoneNumber'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/txt_PhoneNumber'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/lbl_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/txt_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/lbl_ConfirmPassword'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/txt_ConfirmPassword'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/lbl_Address'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/txt_Address'), 0)

WebUI.verifyElementPresent(findTestObject('Register Page/btn_Register'), 0)

