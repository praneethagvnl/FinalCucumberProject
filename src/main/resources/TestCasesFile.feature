@Yourlogo
Feature: Yourlogo Website
@TC01_Yourlogo
Scenario:
contacting customercare service
Given the user launch the chrome application
When the user open the Yourlogo Home page 
Then the user login using username and password
Then click on the login button user nagivate to the next page
Then click on the contact us button and navigate to next page
@TC02_Yourlogo
Scenario:
sorting by price and view
Given the user launches the chrome application
When the user opens the Yourlogo Home Page
Then the user login using uname and paswrd
Then click on the login btn user nagivate to the next page
Then click on the women button user navigate to next page
Then select highest price sort by option
Then select the list view option
@TC03_Yourlogo
Scenario:
signin and signout
Given the users launches the chrome application
When the users opens the Yourlogo Home Page
Then the users login using uname and paswrd
Then click on the login butn user nagivate to the next page
Then click on the signout button user navigate to next page
@TC04_Yourlogo
Scenario:
selecting different colors and styles
Given the user launches the chromeapplication
When the users opens the Your logo Home Page
Then the user login to webapplication using uname and paswrd
Then click on the login buttn user nagivate to the next page
Then click on the dresses button user navigate to next page
Then select s size from the given options
Then select girly style from the given options 
@TC05_Yourlogo
Scenario:
checking of my credit slip 
Given the users launches the chromeapplication
When the users opens the Your logo main Page
Then the user login to webapplication using usrname and passwrd
Then click on the login btton user nagivate to the next page
Then go to credit slips options from footer
Then get the info displayed
@TC06_Yourlogo
Scenario:
clearing email from mypersonal driven
Given launch chrome application
When open home page of given webapplication
Then login to webapplication using username and password
Then click on login button and the page navigates to next page
Then go to my personal information option in the footer
Then clear the  email data displayed to the given 
@TC07_Yourlogo
Scenario:
checking nearby stores	`
Given launch the chrome application
When open the home page of given webapplication
Then login to the webapplication using username and password
Then click on the login button and the page navigates to next page
Then go to my stores option in the footer
Then give pincode of the area to be searched 
Then change radius to 25
Then click on search button
@TC08_Yourlogo
Scenario:
New products checking
Given to launch chrome application
When open home page of the given webapplication in opened browser
Then login to web application using username and password
Then click on login button and the page navigate to next page
Then select new products options from footer
@TC09_Yourlogo
Scenario:
click on trends handbags and navigate to next page
Given to launching application in chrome
When open home page of the given webapplication
Then login to the web application using username and password
Then click on home button to navigate to home page
Then click on trendy handbags image and navigate to next page
 @TC10_Yourlogo
    Scenario Outline: Login to the website with multiple users
    Given launching the webapplication
    When opens the yourlogo Home page
    Then enters the <username> 
    And enter the password <password>
    Then click on the login button it will navigate to the next page
    Then logout from the webapplication
    Examples:
|username||password|
|likhithagudur98@gmail.com||likki464|
|bhanu21142@gmail.com||likki464|
