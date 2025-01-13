# LockedIn E-Commerce Application

## Overview
LockedIn is a full-stack e-commerce web application built using **Spring Boot**, **Thymeleaf**, and **MySQL**, with a sleek and modern user interface styled with **CSS** and dynamic interactivity using **JavaScript**. The platform provides a comprehensive solution for online shopping, integrating advanced features like secure authentication, product management, shopping cart functionality, and a seamless checkout experience powered by **Stripe**.

This project demonstrates my ability to build scalable and user-friendly web applications, handle complex business logic, and integrate third-party APIs. It showcases my skills in backend development, database design, and front-end optimization.

---

## Features

### 1. **User Management**
- **Secure Authentication**: Implements Spring Security for user login and signup.
- **Password Management**: Includes password reset functionality via email.
- **User Profile**: View and update user details, including account creation timestamps.

### 2. **Product Management**
- **Search and Filter**: Dynamic product search by name and filter by price range.
- **Listing with Images**: Sellers can upload multiple product images and manage their listings.
- **Responsive Design**: Product pages are optimized for a seamless user experience on any device.

### 3. **Shopping Cart**
- **Add to Cart**: Users can add products to their cart with adjustable quantities.
- **Cart Summary**: Displays total price and product details.
- **Stripe Payment Integration**: Secure checkout process with dynamic session creation.

### 4. **Email Notifications**
- Sends real-time email notifications for password reset requests using **Spring Mail**.

### 5. **Admin-Level Scalability**
- CSRF protection (configurable for development and production environments).
- Fully modular design allows easy integration of additional features, such as role-based access control or analytics dashboards.

---

## Technologies Used

### Backend
- **Spring Boot** (3.4.1): REST APIs, MVC architecture, security configuration
- **JPA/Hibernate**: Database operations and ORM
- **JavaMailSender**: Email notifications
- **Stripe API**: Payment gateway integration

### Frontend
- **Thymeleaf**: Dynamic HTML rendering
- **CSS**: Modern, responsive UI design
- **JavaScript**: Interactive components and real-time validations

### Database
- **MySQL**: Relational database management
- **Schema Design**: Optimized for user, product, cart, and transaction management

### Tools & Platforms
- **IntelliJ IDEA**: Primary development environment
- **Maven**: Dependency management
- **GitHub**: Version control
- **Postman**: API testing

---

## Challenges Overcome
1. **Secure Payment Integration**:
   - Implemented Stripe's payment system to dynamically calculate cart totals and handle secure transactions.
2. **Dynamic Image Uploads**:
   - Configured file storage and implemented real-time image previews for a better user experience.
3. **Error Handling**:
   - Built custom exception handling to ensure seamless user feedback.

---

## What Sets This Project Apart
- **Real-World Relevance**: Built to address core e-commerce challenges, such as secure payments and dynamic product management.
- **End-to-End Ownership**: Handled every aspect of development, from front-end design to database configuration and third-party API integration.
- **Production-Ready**: Designed with scalability, security, and maintainability in mind.

---

## How to Run Locally

### Prerequisites
- **Java 17**
- **MySQL** (version 8.0 or higher)
- **Maven**

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/lockedin-ecommerce.git
   ```
2. Navigate to the project directory:
   ```bash
   cd lockedin-ecommerce
   ```
3. Configure MySQL database:
   - Update the `application.properties` file with your MySQL credentials.
4. Build and run the project:
   ```bash
   mvn spring-boot:run
   ```
5. Access the application at `http://localhost:8080`.

---

## Future Enhancements
- **Role-Based Access Control**: Differentiate user roles (e.g., admin, seller, buyer).
- **Order History**: Allow users to view past purchases.
- **Enhanced Analytics**: Dashboard for tracking sales and user activity.
- **Mobile App Integration**: Extend functionality to mobile platforms.

---

## Contact
If you find this project impressive and want to discuss potential opportunities, please feel free to reach out:

- **Email**: meritbhusal@gmail.com
- **LinkedIn**: [linkedin.com/in/merit-bhusal](https://www.linkedin.com/in/merit-bhusal-53304832b/)
- **GitHub**: [github.com/meritbh](https://github.com/meritbh)

Thank you for taking the time to review my project. I'm excited about the opportunity to contribute to innovative teams and grow as a software developer!

