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

WebUI.setText(findTestObject('Object Repository/Structure/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Structure/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Structure/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Structure/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Structure/Page_OrangeHRM/li_Organization'))

WebUI.click(findTestObject('Object Repository/Structure/Page_OrangeHRM/li_Structure'))

WebUI.click(findTestObject('Object Repository/Structure/Page_OrangeHRM/span_Edit_oxd-switch-input oxd-switch-input_e15d3c'))

WebUI.click(findTestObject('Object Repository/Structure/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Structure/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 'Ronaldo')

WebUI.click(findTestObject('Object Repository/Structure/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Structure/Page_OrangeHRM/p_Successfully Saved'), 0)

