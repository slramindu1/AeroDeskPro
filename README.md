# AeroDesk Pro – Advanced Airport Management System (Java SE)

## 🛫 Overview

**AeroDesk Pro** is a comprehensive Java Swing desktop-based application designed to simulate and manage essential operations in a modern airport environment. It is developed as part of the **Java Institute Software Application Development Hackathon (Inhouse 24-Hour Group Hackathon)**. The system integrates with a MySQL relational database and supports modular management of:

- ✈️ Flight Scheduling  
- 🧳 Baggage Handling  
- 👤 Passenger Check-ins  
- 🚪 Gate Assignment & Monitoring  
- 📡 Real-Time Flight Status Simulation  
- 🌐 HTTP API Integration for real-time data (e.g., weather)

---

## 👨‍💻 Project Team

This project was collaboratively developed by the following team members:

- **Chathura Hareshan**
- **Ridmi Sansala**
- **Ramindu Ravihansa**
- **Subashi Nanduththara**
- **Hansa Disanayaka**
- **Lithula Levmitha Silva**

---

## ⚙️ Technologies Used

- **Java SE (Swing)** – for user interface development  
- **MySQL** – for relational database management  
- **JDBC** – for database connectivity  
- **Multithreading** – for real-time simulation modules  
- **HTTP API Integration** – for weather/status data  
- **File Handling** – for logging and configuration  
- **Exception Handling** – with custom and thread-safe practices  
- **Object-Oriented Programming** – with clean modular design

---

## 🧩 Key Features

### ✈ Flight Management
- Add/update flights with scheduling details
- Assign airline managers and pilots

### 🧳 Baggage Handling
- Track baggage status (Loaded, In Transit, Delivered, Lost)
- Link baggage to checked-in passengers

### 👤 Passenger Check-In
- Manage seat allocation and flight linking
- View check-in timestamps and seat maps

### 🚪 Gate Assignment & Monitoring
- Assign available gates to scheduled flights
- Simulate gate availability changes in real-time

### 📡 Real-Time Simulation
- Background threads for flight status updates (e.g., Delayed, Departed)
- Live dashboard with refresh mechanisms

### 🌐 API Integration (Research-Based)
- Fetch and log weather data or live flight status from external services using HTTP API calls

---

## 🔒 Admin Module

An `admin` table is included for system-level authentication with hashed passwords. Admin users can:

- Manage flights, gates, and check-ins
- Monitor API logs and flight statuses
- Add/remove other admin accounts

---

## 🛠️ How to Run

1. Import the database schema (`aerodeskpro.sql`) into MySQL.
2. Configure your database credentials in the Java JDBC connection class.
3. Launch the Java Swing application (`Main.java` or `LoginFrame.java`).
4. Login using the default admin:
   - Username: `admin`
   - Password: `admin123` (SHA2 hashed)

---

## 🏆 About the Hackathon

This project was built during a **24-hour Inhouse Group Hackathon** at the **Java Institute for Advanced Technology** under the **Software Application Development** stream. The event challenged teams to conceptualize, design, and implement a working software system using Java SE technologies within a tight deadline.

---

## 📂 Project Structure

src/
│
├── dev.aerodeskpro.model # Java Models (e.g., Flight, Passenger)
├── dev.aerodeskpro.gui # Swing UI Panels and Frames
├── dev.aerodeskpro.connection # MySQL Database Connection
├── dev.aerodeskpro.utils # Utility classes (e.g., validation, logging)
├── dev.aerodeskpro.api # HTTP API handlers
├── dev.aerodeskpro.main # Main launcher classes




---

## 📧 Contact

For any queries or contributions, please reach out to any of the project members listed above or contact the team lead at:

**Ramindu Ravihansa** – `ramindu.jiat@gmail.com`

---

© 2025 AeroDesk Pro – All rights reserved.

