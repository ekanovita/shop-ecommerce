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

WebUI.click(findTestObject('Onboarding Page/menu_Shop'))

WebUI.waitForElementPresent(findTestObject('Shop/h1_Shop'), 1)

switch (category) {
    case 'Uncategorized':
        WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_Uncategorized'))
		
        WebUI.verifyElementPresent(findTestObject('Shop/Uncategorized/h1_Uncategorized'), 0)
		WebUI.scrollToElement(findTestObject('Object Repository/Shop/Uncategorized/h2_Album'), 3)
		
        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Album'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Beanie'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Beanie with Logo'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Shop/Uncategorized/h2_Belt'), 3)
        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Belt'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Cap'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_External Product'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Shop/Uncategorized/h2_Hoodie'), 4)
        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Hoodie'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Hoodie with Logo'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Hoodie with Zipper'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Shop/Uncategorized/h2_Long Sleeve Tee'), 7)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Long Sleeve Tee'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Polo'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Single'))
	
		
		WebUI.scrollToElement(findTestObject('Object Repository/Shop/Uncategorized/h2_Sunglasses'), 7)
        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_Sunglasses'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_T-Shirt'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Uncategorized/h2_T-Shirt with Logo'))

      
        break
    case 'Cocoqua ココナッツ':
        WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_Cocoqua'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Cocoqua/h1_Cocoqua'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Cocoqua/p_No products were found matching your selection'))

        println('------MASUK IF COCOQUA--------')

        break
    case 'Du-reamyドリアン':
        WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_Du-reamy'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Du-reamy/h1_Du-reamy'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Du-reamy/p_No products were found matching your selection'))

        println('------MASUK IF DU REAMY--------')

        break
		
	case 'HOME PAGE':
		WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_HOME PAGE'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/HOME PAGE/h1_HOME PAGE'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/HOME PAGE/p_No products were found matching your selection'))
	break
	
	case 'KOTAKOKI SET':
		WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_KOTAKOKI SET'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/KOTAKOKI SET/h1_KOTAKOKI SET'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/KOTAKOKI SET/p_No products were found matching your selection'))
	break
	
	case 'PIPILTIN COCOA':
		WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_PIPILTIN COCOA'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/PIPILTIN COCOA/h1_PIPILTIN COCOA'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/PIPILTIN COCOA/p_No products were found matching your selection'))
	break
	
	case 'READY TO EAT':
		WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_READY TO EAT'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/READY TO EAT/h1_READY TO EAT'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/READY TO EAT/p_No products were found matching your selection'))
	break
	
	
	case 'SEAFOOD':
		WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_SEAFOOD'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/SEAFOOD/h1_SEAFOOD'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/SEAFOOD/p_No products were found matching your selection'))
	break
	
	case 'SPICES':
		WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_SPICES'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/SPICES/h1_SPICES'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/SPICES/p_No products were found matching your selection'))
	break
	
	case 'STARTER SET':
		WebUI.click(findTestObject('Object Repository/Shop/List Categories/a_STARTER SET'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/STARTER SET/h1_STARTER SET'))
	
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/STARTER SET/p_No products were found matching your selection'))
	break
	
	
    default:
        break
}

WebUI.delay(2)

WebUI.closeBrowser()

