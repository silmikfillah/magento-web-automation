package packages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.org.apache.bcel.internal.generic.RETURN

import groovy.beans.ListenerList
import groovy.swing.impl.DefaultAction
import internal.GlobalVariable

public class randomName {
	@Keyword
	def getName(def name) {
		String random_name = name + new Random().nextInt(999 - 1 + 1)
		return random_name
	}

	@Keyword
	def getFirstName() {
		Random first_name = new Random()
		List<String> givenList = Arrays.asList("Emily", "Emma", "Mia", "Paul", "Pamela", "Jose", "William", "Thomas", "Samuel", "Adrianne", "Taylor", "Harry", "Rebecca", "Melinda", "Jack", "Anthony", "Bethany", "Ruby", "Joanne", "Bobby", "Marty", "Martin", "Rick", "Ronald", "Roger", "Marlene", "Jeff", "Marie", "Melvin", "Michael", "Charles", "Kenny", "Susan", "Donald", "Freda", "Steve", "Kevin", "Andrew", "Danny", "Michelle", "Jesse", "Barbara")

		int numberofElements = 42

		for (int i = 0; i < numberofElements; i++) {
			int randomIndex = first_name.nextInt(givenList.size())
			String randomElement = givenList.get(randomIndex)
			return randomElement
		}
	}

	@Keyword
	def getLastName() {
		Random last_name = new Random()
		List<String> givenList = Arrays.asList("Watson", "Walker", "Wood", "Turner", "Baker", "Clark", "Perkins", "Miller", "Adams", "Thrump", "Jackson", "Lincoln", "Grant", "Jefferson", "Green", "Wilson", "Lopez", "Brown", "Anderson", "Hill", "Brook", "Furlan", "Lee", "Young", "Hirano", "Pitt", "Jones", "Smith", "Fraser", "Doe", "Beck", "Monroe", "Sheridan", "Johnson", "Thompson", "Meena", "Lewis", "Stone", "White", "King", "Depp", "Lasiter")

		int numberofElements = 42

		for (int i = 0; i < numberofElements; i++) {
			int randomIndex = last_name.nextInt(givenList.size())
			String randomElement = givenList.get(randomIndex)
			return randomElement
		}
	}
}
