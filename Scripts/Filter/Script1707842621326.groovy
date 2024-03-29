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

Mobile.startApplication('C:\\Users\\masep\\git\\Report Final Mobile Asep Mahmudin\\Advantage+demo+3.2.apk', true)

Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - LAPTOPS'), 0)

Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/Filter/android.widget.ImageView (2)'), 0)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - BY OPERATING SYSTEM'), 0)

def a = filter
	if (a=='Chrome') {
		Mobile.delay(5)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - Chrome OS'), 0)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - APPLY'), 0)
	}
	else if (a == 'W10') {
		Mobile.delay(5)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - Windows 10'), 0)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - APPLY'), 0)
	}
	else if (a== 'W7') {
		Mobile.delay(5)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - Windows 7 Professional 64'), 0)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - APPLY'), 0)
	}
	else if (a == 'W8') {
		Mobile.delay(5)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - Windows 8.1'), 0)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - APPLY'), 0)
	}
	else {
		Mobile.delay(5)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - Chrome OS'), 0)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - Windows 10'), 0)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - Windows 7 Professional 64'), 0)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - Windows 8.1'), 0)
		Mobile.tap(findTestObject('Object Repository/Filter/android.widget.TextView - APPLY'), 0)
	}
	
	









//Mobile.closeApplication()

