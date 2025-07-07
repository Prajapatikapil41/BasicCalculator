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

## 🎥 Video Demo

📺 [Click here to watch the demo video](https://github.com/Prajapatikapil41/BasicCalculator/blob/main/Images%20and%20Videos/Codveda_L1T1.mp4)

---

## 🖼️ Screenshots

1. **Calculator UI (Home Page):**  
📷 [View Screenshot](https://github.com/Prajapatikapil41/BasicCalculator/blob/main/Images%20and%20Videos/Screenshot%20(129).png?raw=true)

2. **Output with Result:**  
- [Screenshot 1](https://github.com/Prajapatikapil41/BasicCalculator/blob/main/Images%20and%20Videos/Screenshot%20(130).png?raw=true)  
- [Screenshot 2](https://github.com/Prajapatikapil41/BasicCalculator/blob/main/Images%20and%20Videos/Screenshot%20(131).png?raw=true)  
- [Screenshot 3](https://github.com/Prajapatikapil41/BasicCalculator/blob/main/Images%20and%20Videos/Screenshot%20(132).png?raw=true)  
- [Screenshot 4](https://github.com/Prajapatikapil41/BasicCalculator/blob/main/Images%20and%20Videos/Screenshot%20(133).png?raw=true)  

3. **Division by Zero Handling:**  
📷 [View Screenshot](https://github.com/Prajapatikapil41/BasicCalculator/blob/main/Images%20and%20Videos/Screenshot%20(134).png?raw=true)

4. **After Reset:**  
📷 [View Screenshot](https://github.com/Prajapatikapil41/BasicCalculator/blob/main/Images%20and%20Videos/Screenshot%20(135).png?raw=true)

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
