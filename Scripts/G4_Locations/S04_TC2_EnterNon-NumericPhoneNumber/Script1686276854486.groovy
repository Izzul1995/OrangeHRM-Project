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

WebUI.setText(findTestObject('Object Repository/locations/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/locations/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/li_Organization'))

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/li_Locations'))

WebUI.click(findTestObject('Object Repository/locations/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/locations/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus (1)'), 'kampung pisang')

WebUI.click(findTestObject('locations/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('locations/Page_OrangeHRM/span_Afghanistan', [('country') : country]))

WebUI.setText(findTestObject('Object Repository/locations/Page_OrangeHRM/input_Phone_oxd-input oxd-input--focus (1)'), 'abc')

WebUI.verifyElementPresent(findTestObject('Object Repository/locations/Page_OrangeHRM/span_Allows numbers and only  -  ( )'), 
    0)

