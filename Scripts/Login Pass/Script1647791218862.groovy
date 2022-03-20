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
import org.junit.Assert as Assert
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://myid.buu.ac.th/')

WebUI.setText(findTestObject('Object Repository/Page_My ID/input_(Username)_user'), '62160246')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My ID/input_(Password)_pass'), 'OH3sE2oAthhFNjThIOL4xw==')

WebUI.click(findTestObject('Object Repository/Page_My ID/button_Sign in'))

header = WebUI.getText(findTestObject('Object Repository/Page_My ID/h3_(Profile)'))

Assert.assertEquals('ข้อมูลส่วนบุคคล (Profile)', header)

url = WebUI.getUrl()

url_pass = 'https://myid.buu.ac.th/profile'

Assert.assertEquals(url_pass, url)

WebUI.closeBrowser()

