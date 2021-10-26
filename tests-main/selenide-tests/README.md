# selenide-test

e2e-tests for [freeletics](https://github.com/JohnSQA/tests) \
**stack:** Java / Gradle / JUnit5 / Selenide / Selenide-appium / Rest-assured / Allure / Allure EE / Selenoid

`gradle web`\
`gradle web -Dweb_mobile_device="iPhone X"`\
`gradle ios`\
`gradle android`

Answers to the questions:

`1.Locators(page objects if they exist)`

`2.Using ADB`

`3. Hybrid app would be tested using web view
Both hybrid/native app could have a different logic, elements and page
So changes could vary based on changes done.`

`4. Native app would require activity/capability in order to run tests.`

`Java 8 is used here. All the dependencies should be automatically installed if Import dependency feature is ON in your IDE( I used intellij idea for it).
Once you open the project in your IDE, you can right click and run "FreeleticsTests", at least it is done like this in intellij idea.`
