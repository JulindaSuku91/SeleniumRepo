Documentation

The automated tests are implemented with the below technologies:

Java-- Programming language.
Selenium WebDriver-- Automation Tool.
Cucumber BDD -- As behavior driver tool.
Maven –- For automatic builds.
Junit—-Testing Framework  
Eclipse – editor
Jenkins – Continues Integration

I decided to complete task with these technologies since they are popular in testing automation, also the web page under test was compatible with the main characteristic of Selenium and they are opensource. 
Cucumber beside his power as behavior driven tool, can help in keeping the scenarios documented in a simple plain English.
In project I have implemented the POM pattern of Selenium WebDriver.

Installation

Perquisites

In the environment used to run the project should be installed at least Java- 8, Maven.
You can import the project in eclipse and make sure you have installed Cucumber plugin installed.
Tests can be run from class “RunTest” on project or from command line “mvn clean test” located in the project root or “mvn test -Dbrowser=browser_name” with specific browser name.
The implementation is done to run the tests in Chrome browser or Mozilla Firefox.
Project Structure

 

Cucumber scenarios are located under src/test/java/automatedtest/features
In this folder I have defined the 4 positive scenarios:
•	Add new element with success
•	Edit existing element with success
•	Delete only one item with success
•	Delete all using option “Clear”

In this folder I have defined the 4 negative scenarios:
•	Add Item with incorrect input
•	Edit Item deleting his content
•	Deleting without selecting item
•	Not having saved items in list

This were the test scenarios I planned to automated.

Under src/java/test
Are implemented according to cucumber step definition and selenium pattern POM pages.

BasePage is a base page which other pages extends for important methods.
HelperMethods is a utility class which stores the most used methods in order to not repeat my self(DRY concept)

Under com.entities I have created and class Items which will help me to store states like before operations or after operations.

Reporting 

Reporting will be done using Jenkins. Cucumber plugin offers visual reports for test results, there are two options to generate results json file or html. Cucumber plugin interprets this results in visual graphs.
Also, Jenkins has the possibility to be integrated with email or slack and this report will be delivered to stockholders for every run during the continues integration.  Automatic job runs are scheduled in Jenkins and after that the run of all tests is triggered. The result changing in runner class tags can be get for an individual case or for the whole cases.





