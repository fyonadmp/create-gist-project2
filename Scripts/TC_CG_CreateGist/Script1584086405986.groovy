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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('https://github.com/')
WebUI.click(findTestObject('Login/button_signin'))
WebUI.waitForPageLoad(3)
WebUI.verifyElementVisible(findTestObject('Object Repository/Verify/verify_element_present', [('element_text'): 'Sign in to GitHub']))

// login to GitHub
WebUI.setText(findTestObject('Object Repository/Login/input_username'), username)
WebUI.setMaskedText(findTestObject('Object Repository/Login/input_password'), password)
WebUI.click(findTestObject('Object Repository/Login/button_click_to_sign_in'))


//add new gist
WebUI.click(findTestObject('Object Repository/Create Gist/button_dropdown_add'))
WebUI.click(findTestObject('Object Repository/Create Gist/click_to_add_new_gist'))


WebUI.waitForElementVisible(findTestObject('Object Repository/Create Gist/input_gist_description'), 2)
WebUI.setText(findTestObject('Object Repository/Create Gist/input_gist_description'), 'sample gist of hello world page')

WebUI.waitForElementVisible(findTestObject('Object Repository/Create Gist/input_file_name'), 2)
WebUI.setText(findTestObject('Object Repository/Create Gist/input_file_name'), 'hello-world.html')

WebUI.waitForElementVisible(findTestObject('Object Repository/Create Gist/input_gist_text'), 2)
WebUI.setText(findTestObject('Object Repository/Create Gist/input_gist_text'), '<span> Hello World! </span>')

WebUI.click(findTestObject('Object Repository/Create Gist/button_create_public_gist'))
WebUI.delay(3)




