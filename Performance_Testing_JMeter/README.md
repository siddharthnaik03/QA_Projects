# BlazeDemo-Flight-Booking-Performance-Testing-using-Apache-JMeter

This project demonstrates end-to-end performance testing of the BlazeDemo flight booking web application using Apache JMeter.
The test simulates multiple virtual users performing a complete flight booking workflow and measures application performance under load.

### 🎯 Objectives
•	Simulate real user traffic on BlazeDemo application

•	Measure response time and throughput

•	Identify performance bottlenecks

•	Validate system stability under concurrent load

### 🧰 Tools & Technologies
•	Apache JMeter 5.6.3

•	HTTP/HTTPS Protocol

•	CSV Data Set Config (Data-driven testing)

•	Transaction Controllers

### 🧩 Test Scenario (Business Flow)

1.	Launch Application (Home Page)
2.	Search Flights
3.	Select Flight
4.	Enter Passenger Details
5.	Complete Ticket Booking
6.	Verify Confirmation Page




### ⏱️ Load Configuration
•	Virtual Users: 50

•	Ramp-Up Period: 10 seconds

•	Loop Count: 1

•	Think Time: 2–3 seconds (Uniform Random Timer)

### 	📈 Sample Results (Summary)
Transaction	Avg Response Time
Launch	~807 ms
Search	~695 ms
Book	~1363 ms

•	Booking transaction showed highest response time due to backend processing.

