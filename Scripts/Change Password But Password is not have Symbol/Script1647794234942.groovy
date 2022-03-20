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
import org.junit.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl('https://myid.buu.ac.th/')

WebUI.setText(findTestObject('Object Repository/Page_My ID/input_(Username)_user'), '62160246')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My ID/input_(Password)_pass'), 'OH3sE2oAthhFNjThIOL4xw==')

WebUI.click(findTestObject('Object Repository/Page_My ID/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_My ID/a_Change PasswordRenew password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My ID/input_(New Password)_newpass'), 'Ou+g6Pu2ISnPYX5Mi4HN6g==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My ID/input_(Re-New Password)_renewpass'), 'Ou+g6Pu2ISnPYX5Mi4HN6g==')

WebUI.click(findTestObject('Object Repository/Page_My ID/button_Change Password'))

text = WebUI.getText(findTestObject('Object Repository/Page_My ID/div_(         ( )   , - .            _     _538061'))

Assert.assertEquals((('ไม่พบตัวอักษรอักขระพิเศษ ในรหัสผ่านใหม่ของท่าน\n' + 'ตัวอย่าง (! " # $ % & \' ( ) * + , - . / : ; < = > ? @ [ ] ^ _ ` { | } ~)\n\n') + 
    'Not found symbol in your new password\n') + 'Example(! " # $ % & \' ( ) * + , - . / : ; < = > ? @ [ ] ^ _ ` { | } ~)', 
    text)

WebUI.closeBrowser()

