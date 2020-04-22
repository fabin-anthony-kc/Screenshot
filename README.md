# Screenshot
Screenshot using REST API
Author: Fabin Anthony
Dated: 23rd April, 2020
License: Free

=========================================
STEPS TO DONWLOAD, SETUP AND RUN PROJECT
=========================================

Prerequisite:
1. Maven
2. Google Chrome Browser

Steps:
1. Download the project by clicking on the Clone or Download Button and clicking the Download ZIP.
2. Once the download is complete, extract the files on to your local directory.
3. Open the screenshot-service folder. Once inside the folder then open command prompt from within this folder.
4. Run the following command "mvn clean install". (Please Note: Maven should be installed on your computer for this command to work).
5. If maven is installed on your computer, the command would run successfully and you would see a message "BUILD SUCCESS".
6. Once you see this message, change the directory by typing the following command "cd target".
7. To run the application, type the following command "java -jar screenshot-service-0.0.1-SNAPSHOT.jar".
8. The project is configured to run on tomcat port 8081.
9. Open a browser window and goto the following link "http://localhost:8081/screenshot/swagger-ui.html". This is the link for swagger.
10. Expand the screenshot-controller and click on the GET method link. Click on try out button.
11. Enter the website URL of which you need the screenshot. Then click execute button.
12. This process takes approximately 20 seconds and will return the base64 encoded string of the screenshot image. Incase if you see another chrome window opening, please don't panic. It's a part of the screenshot procedure.
13. In order to view the screenshot, I've attached a basic ViewScreenshot.html file.
14. Open the ViewScreenshot.html file in any text editor. In the img tag, replace "<%INSERT_CODE_HERE%>" with the string you received as response from the api.
15. Save the file and open the file in a browser.
16. The image on the webpage is a screenshot of the webpage you requested for.

=========================================
STEPS STOP THE PROJECT
=========================================

Steps:
1. Press Ctrl + C on the command prompt. This will stop tomcat and shutdown the application.

Thank You.
