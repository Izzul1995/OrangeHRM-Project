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

WebUI.setText(findTestObject('Object Repository/locations/Page_OrangeHRM/input_Username_username (5)'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/locations/Page_OrangeHRM/input_Password_password (5)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/button_Login (5)'))

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/a_Admin (5)'))

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/li_Organization (5)'))

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/li_Locations (5)'))

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/button_kampung ronaldo_oxd-icon-button oxd-_7f4acd'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_Organization Name_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('General Information/Page_OrangeHRM/input_Organization Name_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/locations/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus (1)'), 'kampung zidane')

WebUI.click(findTestObject('locations/Page_OrangeHRM/button_Save'))

WebUI.rightClick(findTestObject('locations/Page_OrangeHRM/p_Successfully Saved'))
