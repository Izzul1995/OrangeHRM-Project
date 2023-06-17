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

WebUI.setText(findTestObject('Object Repository/Job title/Page_OrangeHRM/input_Username_username (2)'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Job title/Page_OrangeHRM/input_Password_password (2)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Job title/Page_OrangeHRM/button_Login (2)'))

WebUI.click(findTestObject('Object Repository/Job title/Page_OrangeHRM/a_Admin (2)'))

WebUI.click(findTestObject('Object Repository/Job title/Page_OrangeHRM/li_Job (2)'))

WebUI.click(findTestObject('Object Repository/Job title/Page_OrangeHRM/li_Job Titles (2)'))

WebUI.click(findTestObject('Object Repository/Job title/Page_OrangeHRM/button_Cleaner_oxd-icon-button oxd-table-ce_946014'))

WebUI.click(findTestObject('Object Repository/Job title/Page_OrangeHRM/button_Yes, Delete (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Job title/Page_OrangeHRM/p_Successfully Deleted (1)'), 0)

WebUI.click(findTestObject('Job title/Page_OrangeHRM/button_Polis_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('Object Repository/Job title/Page_OrangeHRM/button_Yes, Delete (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Job title/Page_OrangeHRM/p_Successfully Deleted (1)'), 0)

