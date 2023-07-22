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

WebUI.navigateToUrl('https://upscale.id/')

WebUI.click(findTestObject('Object Repository/Register/Page_Upscale.id, Scaling Up your business w_24ed63/a_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Register/Page_Upscale.id, Scaling Up your business w_24ed63/a_Click'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Register/Page_Upscale.id, Scaling Up your business w_24ed63/a_DAFTAR'))

WebUI.getText(findTestObject('Object Repository/Register/Page_Upscale.id, Scaling Up your business w_24ed63/div_Harap isi semua kolom registrasi Harap _17af52'))

