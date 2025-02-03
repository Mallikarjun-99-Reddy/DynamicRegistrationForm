# DynamicRegistrationForm
Tigor Fit Gym Registration System A simple web-based registration system built with Java, JSP, and MySQL. Users can register, and the system checks for duplicate usernames. It displays success/failure messages and stores data in a MySQL database. Features responsive design and basic validation.

**Features:** 

**User Registration** : Users can create accounts by submitting a form with their details. <br>
**Validation**: The system checks for duplicate usernames to prevent multiple registrations with the same username.<br>
**Database Integration**: Information is securely stored in a MySQL database. <br>
**Success/Failure Notifications**: The system displays success or failure messages after registration attempts. <br>
**Responsive UI**: The registration page features a responsive design that adjusts well to various screen sizes. <br>


**Technologies Used:**

**Java**: Backend logic for processing user registration. <br>
**JSP** (Java Server Pages): For rendering dynamic content on the web pages. <br>
**MySQL**: For database management and storing user information. <br>
**HTML/CSS**: For the front-end design and user interface. <br>
**Servlets**: For handling HTTP requests and responses. <br>


**How to Run:**

1. Clone this repository to your local machine. <br>
2. Set up a MySQL database named webapp_db and create a table userinfo with columns for the user information. <br>
3. Configure the JDBC connection in TigorFitApp.java with your local MySQL credentials. <br>
4. Deploy the project on any Java-supported server (e.g., Apache Tomcat). <br>
5. Open the registration page in your browser and try registering a new user. <br>
