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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/General Information/Page_OrangeHRM/input_Username_username (7)'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/General Information/Page_OrangeHRM/input_Password_password (7)'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/General Information/Page_OrangeHRM/button_Login (7)'))

WebUI.click(findTestObject('Object Repository/General Information/Page_OrangeHRM/a_Admin (7)'))

WebUI.click(findTestObject('Object Repository/General Information/Page_OrangeHRM/li_Organization (7)'))

WebUI.click(findTestObject('Object Repository/General Information/Page_OrangeHRM/li_General Information (7)'))

WebUI.click(findTestObject('Object Repository/General Information/Page_OrangeHRM/span_Edit_oxd-switch-input oxd-switch-input_e15d3c (7)'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_Organization Name_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_Organization Name_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_Email_oxd-input oxd-input--focus'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_Email_oxd-input oxd-input--focus'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_Address Street 1_oxd-input oxd-input--focus'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_Address Street 1_oxd-input oxd-input--focus'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_City_oxd-input oxd-input--focus'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_City_oxd-input oxd-input--focus'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_StateProvince_oxd-input oxd-input--focus'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_StateProvince_oxd-input oxd-input--focus'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/General Information/Page_OrangeHRM/button_Save (2)'))

WebUI.verifyElementPresent(findTestObject('General Information/Page_OrangeHRM/span_Required'), 0)

