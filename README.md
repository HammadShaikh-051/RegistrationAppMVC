# 📝 Registration App (Java MVC + SQL Server)

## 🚀 Overview

This is a simple **User Registration Web Application** built using:

* Java Servlets (Controller)
* JSP (View)
* JDBC (Model)
* Microsoft SQL Server (Database)
* Apache Tomcat (Server)

The application follows the **MVC Architecture** and allows users to register by submitting their details through a web form.

---

## 🏗️ Project Structure (MVC)

* **Model**

  * `Model.java` → Handles database operations
  * `JdbcUtil.java` → Manages DB connection

* **View**

  * `index.html` → Registration form
  * `success.jsp` → Success page
  * `failure.jsp` → Failure page

* **Controller**

  * `Register.java` → Servlet that processes form data

---

## 💻 Technologies Used

* Java (JDK 17/21)
* Servlets & JSP
* JDBC
* Microsoft SQL Server
* Apache Tomcat 10/11
* Eclipse IDE

---

## 🗄️ Database Setup

1. Create database:

```sql
CREATE DATABASE ServletDB;
```

2. Use database:

```sql
USE ServletDB;
```

3. Create table:

```sql
CREATE TABLE UserInfo (
    Uname VARCHAR(50),
    Uemail VARCHAR(100),
    Upass VARCHAR(50),
    Ucity VARCHAR(50)
);
```

---

## ▶️ How to Run

1. Clone the repository
2. Open project in Eclipse
3. Configure Apache Tomcat server
4. Add SQL Server JDBC driver (`.jar`) to:

   * Build Path
   * `WEB-INF/lib`
5. Start SQL Server
6. Run project on server

---

## 🌐 Usage

1. Open in browser:

```
http://localhost:8080/RegistrationAppMVC/
```

2. Fill the form and click **SignUp**

3. Output:

   * ✅ Success → `success.jsp`
   * ❌ Failure → `failure.jsp`

---

## 📌 Features

* User Registration Form
* MVC Architecture
* Database Integration using JDBC
* Session Handling

---

## 👨‍💻 Author

**Hammad Shaikh**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
