This Repo Contains Code for the Programming Hero SQA Test. 


○ Automation Strategy: This test is performed on an end-to-end testing method where the internal code quality and complexity is not determined. 

○ Screenshots: Log4j logging is implemented and stored after every run inside the ./reports folder to identify any issues we face during test execution.

○ Expected Output: The TestSuite tests have several assertions and validation available, ensuring that the tests have proper assertions. The end of the test suite should 


○ Setup Instructions:

How to Run:
1. Clone the repo
2. Open the clone repo on a Java-enabled IDE.
3. Open your IDE Terminal.
4. Run the below steps for successful test Execution:

   
        4.1: Pre-requirement: The below fields need to be available on user's work device.
            4.1.1: Java
            4.1.2: Maven
            4.1.3: Allure Reporting
            4.1.4: Android Studio (For Emulator)
            4.1.5: Emulator Device (Pixel 4 with API 34)
            4.1.6: We have to make sure that both work directory ./app and device have an APK file. I've included the app inside the app directory as default for easy setup.
            

        4.2: How to Run The TestSuite: (Test Execution through TestNG)
            4.2.1: The TestSuite is available inside TestSuite/AndroidTestSuite.xml
                4.2.1.1: Got the TestSuite file and right click to get options of executing the test as TestNG suite.
                4.2.1.2: You can also run the TestSuite from terminal. Use "mvn clean test" to run the testsuite on default mode.

        4.3: Allure reporting is integrated on this project with step defination:
            4.3.1: You can find the allure reporting inside ./target folder and latest test log inside ./reports folder.
                4.3.1.1: To get the html reporter provide command `"allure serve target/allure-results"` on your terminal.


                For any kind of assistance feel free to reach out to me.
