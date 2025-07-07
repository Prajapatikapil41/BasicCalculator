```markdown
# Basic Calculator using Spring Boot  
A web-based calculator that allows users to perform basic arithmetic operations (Addition, Subtraction, Multiplication, Division) with a responsive frontend and Java Spring Boot backend.

```

Codveda Internship Project - Level 1 Task 1


## 🔧 Features / User Stories

- I can enter two numbers and select an arithmetic operation.
- I can get the result instantly.
- I can reset the form and input new values.
- I can see errors when dividing by zero.

---

## Video -
![video](https://drive.google.com/file/d/1a-YbjXb8pi9mymiJHsYIaK0Wbya6qp4y/view?usp=drive_link)

---


## SHREENSHOTS - 
1. **Calculator UI (Home Page):**  
![image](https://drive.google.com/file/d/1KfqDtPMVMSQ9h5TeCi647V6HDqFfslf4/view?usp=drive_link)


2. **Output with Result:**  
   ![image](https://drive.google.com/file/d/1a-YbjXb8pi9mymiJHsYIaK0Wbya6qp4y/view?usp=drive_link)
   ![image](https://drive.google.com/file/d/1pXzkaQimzvrz0ywiGFJZOIsoxZ1oUFZo/view?usp=drive_link)
   ![image](https://drive.google.com/file/d/1c3tCIsktMyTBIqvXcRHihsdOAimkuOcb/view?usp=drive_link)
   ![image](https://drive.google.com/file/d/1iE72Qa31Jc8RPttbGLPm8bZV9y6iw-t9/view?usp=drive_link)
   ![image](https://drive.google.com/file/d/1X9B8m4I4Azt_Hv1oTGnvKYERNAUWCzpk/view?usp=drive_link)

4. **Division by Zero Handling:**  
   ![image](https://drive.google.com/file/d/1u-UZFn4eJwhW7j4jxLO5WqVEMPm0plXn/view?usp=drive_link)

5. **After Reset:**
   ![image](https://drive.google.com/file/d/1SWZnP3I6fMzs0DVSlaDtVFQm3YmASmMx/view?usp=drive_link)
---

## 🖥️ System Design

> The application follows a simple Client-Server architecture

- **Client Side:** HTML5, CSS3, JavaScript  
- **Server Side:** Java, Spring Boot

  ```text
  Handles API endpoints for arithmetic operations and returns JSON responses.
  ```

---

## 🗂️ Project Structure

```
D:\
└── Codveda\
    └── level_1\
        └── Task_1\
            ├── BasicCalculator_frontend\
            │   └── index.html
            └── BasicCalculator_backend\
                ├── src\
                ├── pom.xml
                └── application.properties
```

---

## 🧰 Technology Stack

| Area      | Technology                                       |
| --------- | ------------------------------------------------ |
| Front-End | HTML5, CSS3, JavaScript, Live Server (npm)       |
| Back-End  | Java 21, Spring Boot 3.5.3, Maven, Tomcat Server |
| Tool      | VS Code, npm, Git, GitHub                        |

---

## ▶️ Steps to Run Application

### ✅ Start Backend (Spring Boot):

```bash
cd D:\Codveda\level_1\Task_1\BasicCalculator_backend
mvn spring-boot:run
```

> Or use VS Code's Java Run/Debug
> Default port: `8080`
> To change port:

```properties
# application.properties
server.port=8081
```

---

### ✅ Start Frontend (Live Server):

```bash
cd D:\Codveda\level_1\Task_1\BasicCalculator_frontend
npm init -y                   # Only once
npm install live-server --save-dev
npm start
```

> Open in browser at: `http://localhost:8080/` or `http://localhost:5500/`

---

## 🔍 How It Works

1. User enters two numbers and selects an operation.
2. JavaScript sends data to Spring Boot backend via `fetch()`.
3. Backend processes the request and returns the result.
4. Frontend displays the result on the screen.

---

## 💡 Future Enhancements

* Add calculation history
* Add more operations: Modulus, Square Root, Power
* Convert frontend to React/Angular
* Use JSON body and RESTful APIs
* Add authentication/login system

---

## 👨‍💻 Author

| Name                | GitHub                                                  | LinkedIn                                                                 | E-Mail                                                              |
| ------------------- | ------------------------------------------------------- | ------------------------------------------------------------------------ | ------------------------------------------------------------------- |
| **Kapil Prajapati** | [Prajapatikapil41](https://github.com/Prajapatikapil41) | [Kapil LinkedIn](https://www.linkedin.com/in/kapil-prajapati-7ba4b51b7/) | [kapilprajapati0403@gmail.com](mailto:kapilprajapati0403@gmail.com) |

```
