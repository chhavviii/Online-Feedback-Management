# Online-Feedback-Management
A full-stack Java web application that enables users to submit feedback online. The system analyzes the sentiment of each comment—categorizing it as Positive, Negative, or General—and provides an intuitive admin dashboard for filtering and managing feedback. 

---

## 📸 Screenshots

### Feedback Database Table Example
![Feedback Database Table](images/db-screenshot.png)
*Example: MySQL Workbench view of the feedback table. Replace this screenshot with your own.*

### Admin Dashboard (Sample View)
![Admin Dashboard](images/admin-dashboard.png)
*Admin dashboard for filtering and updating feedback entries.*

---

## ✨ Features

- User-friendly web form for feedback submission
- Automated sentiment analysis for categorization
- Admin dashboard to view, filter (by category and status), and update feedback records
- Update feedback status: Pending, Addressed, Rejected
- Color-coded and icon-enhanced sentiment visualization
- MVC architecture (Servlets, JSP, DAO, Model)
- SQL injection prevention and data validation
- Easily extensible structure for future features

---

## 🛠️ Technologies Used

- Java 8+
- JSP & Servlets
- JDBC
- MySQL
- HTML5 / CSS3
- JSTL
- Apache Tomcat 8+
- (Optionally) Maven

---

## 🚦 Requirements

- Java JDK 8 or newer
- Apache Tomcat 8.x or newer
- MySQL Server
- MySQL Connector/J (JDBC driver)
- IDE like Eclipse, IntelliJ IDEA, or NetBeans

---

## 🚀 Installation & Setup

1. **Clone the Repository**
    ```bash
    git clone https://github.com/yourusername/online-feedback-management-system.git
    ```

2. **Database Setup**
    - Open MySQL and create a database, for example:  
      `CREATE DATABASE feedbackdb;`
    - Run the `db/feedback_schema.sql` script (provided) to generate the required tables.

3. **Configure Database Connection**
    - In `src/com/feedback/dao/DBUtil.java` or directly in `FeedbackDAO.java`, update your DB credentials:
      ```java
      private static final String JDBC_URL = "jdbc:mysql://localhost:3306/feedbackdb";
      private static final String JDBC_USERNAME = "root";
      private static final String JDBC_PASSWORD = "yourpassword";
      ```

4. **Import Project into IDE**
    - Open your Java IDE. Import the project as a Dynamic Web Project or Maven project.

5. **Build and Deploy**
    - Deploy the project to Tomcat’s `webapps/` directory or run from your IDE.

6. **Run the Application**
    - Start Tomcat.
    - Access the feedback page:  
      [http://localhost:8080/Online-Feedback-Management/feedback.jsp](http://localhost:8080/Online-Feedback-Management/feedback.jsp)
    - Admin dashboard:  
      [http://localhost:8080/Online-Feedback-Management/admin?action=dashboard](http://localhost:8080/Online-Feedback-Management/admin?action=dashboard)

---
