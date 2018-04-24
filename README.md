# Tests separation with gradle
It shows you how to create simple gradle project which contains both unit and integrationTest.

Project's gradle file provide tasks to run unit and integration test separately 
### Run both test ###
gradle build

### Run with unit tests ###
gradle build -x integrationTest

### Run with integrationTest ###
gradle integrationTest
