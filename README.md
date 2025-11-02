# Online-Feedback-Management
A full-stack Java web application that enables users to submit feedback online. The system analyzes the sentiment of each comment—categorizing it as Positive, Negative, or General—and provides an intuitive admin dashboard for filtering and managing feedback. 

---

## ✨ Features

- **User Feedback Submission:** Web interface for submitting feedback with name, email, comments.
- **Sentiment Analysis:** Basic categorization of feedback into Positive, Negative, or General.
- **Admin Dashboard:** Filter, view, and update feedback entries by category and status.
- **Status Updates:** Track feedback as Pending, Addressed, or Rejected.
- **MVC Pattern:** Organized codebase using JavaBeans, Servlets (Controller), JSP (View), and DAO (Model/Data layer).

---

## 🛠️ Technologies Used

- **Java 8+**
- **JSP & Servlets**
- **JDBC**
- **MySQL**
- **HTML5 / CSS3**
- **Apache Tomcat 8+**
- **Directory structure compatible with Maven/Gradle (src/main/java and src/main/webapp)**

---

## 🚦 Requirements

- Java JDK 8 or newer
- Apache Tomcat 8.x or newer
- MySQL Database Server
- MySQL Connector/J (JDBC driver)
- IDE (Eclipse, IntelliJ IDEA, NetBeans, etc.)

---

## 🚀 Setup & Installation

1. **Clone this repository**
    ```bash
    git clone https://github.com/chhavviii/Online-Feedback-Management.git
    ```

2. **Database Setup**
    - Create a MySQL database (e.g., `feedbackdb`).
    - Create necessary tables using your SQL schema (make a `feedback_schema.sql` and add to your repo if not present).

3. **Configure Database Connection**
    - Update your MySQL credentials in `DBUtil.java`:
      ```java
      // DBUtil.java
      private static final String DB_URL = "jdbc:mysql://localhost:3306/feedback_db";
      private static final String DB_USER = "root";
      private static final String DB_PASS = "password";
      ```

4. **Import Project into IDE**
    - Open your IDE and import as a Maven or Dynamic Web Project.
    - Verify folder structure (`src/main/java` and `src/main/webapp`).

5. **Deploy to Tomcat**
    - Build project and deploy the `war` or use your IDE to run the app.

6. **Run the Application**
    - Feedback Form:  
      [[http://localhost:8585/Online-Feedback-Management/feedback.jsp](http://localhost:8585/Online-Feedback-Managment/feedback.jsp)]
    - Admin Dashboard:  
      [[http://localhost:8585/Online-Feedback-Management/admin?action=dashboard](http://localhost:8585/Online-Feedback-Managment/admin?action=dashboard)]

---

## 🗂️ Included Files & Folders

- **/src/main/java/com/feedback/controller/**
    - `AdminServlet.java` — Controls admin actions and dashboard
    - `FeedbackServlet.java` — Handles new feedback submissions
- **/src/main/java/com/feedback/dao/**
    - `FeedbackDAO.java` — Database access and feedback query methods
- **/src/main/java/com/feedback/model/**
    - `Feedback.java` — Feedback JavaBean model
- **/src/main/java/com/feedback/util/copy/**
    - `DBUtil.java` — Utility for establishing database connection
- **/src/main/webapp/**
    - `admin_dashboard.jsp`, `feedback.jsp`, `index.jsp`, `result.jsp` — User/admin UI pages
    - `META-INF/`, `WEB-INF/` — Java web app config directories
- **/db/**
    - `schema.sql`           — SQL schema file to create and initialize database tables

---

