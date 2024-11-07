This Repo Contains Code for Programmin Hero SQA Test.

How to Run:
1. Clone the repo
2. Open the repo on a Java Enabled IDE.
3. Open your IDE Terminal.
4. Run the below steps for successful test Execution:
        4.1: Pre-requirement:
            4.1.1: Java
            4.1.2: Maven
            4.1.3: Allure Reporting
            

        4.2: How to Run The Testsuite: (Test Execution through TestNG)
            4.2.1: The testsuite is available inside TestSuite/AndroidTestSuite.xml
                4.2.1.1: Got the testsuite file and right click to get options of executing the test as TestNG suite.
                4.2.1.2: You can also run the testsuite from terminal. Use "mvn clean test" to run the testsuite on default mode.

        4.3: Allure reporting is integrated on this project with step defination:
            4.3.1: You can find the allure reporting inside ./target folder and latest test log inside ./reports folder.
                4.3.1.1: To get the html reporter provide command `"allure serve target/allure-results"` on your terminal.


                For any kind of assistance feel free to reach out to me.
