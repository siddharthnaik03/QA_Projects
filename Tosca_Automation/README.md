# -nopCommerce-Test-Automation-using-Tricentis-Tosca

## 📌 Project Overview
This project focuses on automated testing of the NopCommerce demo e-commerce application using Tricentis Tosca. The objective is to validate critical user workflows such as login, product search, cart operations, Wishlist management, and complete end-to-end order placement.
The automation suite ensures application stability, improves regression coverage, and demonstrates model-based test automation practices.

## 🎯 Objectives

•	Automate major functional flows of an e-commerce platform

•	Validate both positive and negative test scenarios

•	Execute end-to-end order processing

•	Generate execution reports with verification checkpoints

•	Demonstrate Tosca module creation, test case design, and execution

## 🧰 Tools & Technologies

•	Automation Tool: Tricentis Tosca

•	Application Under Test: NopCommerce Demo Website

•	Browser: Chrome

•	Testing Type: Functional & End-to-End Testing

## ✅ Test Scenarios Covered

🔐 Authentication

•	Valid Login

•	Invalid Login with error verification

The invalid login test confirms the error message

"Login was unsuccessful. Please correct the errors and try again. No customer account found" 
Test

## 🔎 Product Interaction

•	Search for products (e.g., HTC smartphone) 
Test

•	Add items to cart (Apple MacBook Pro) 
Test

•	Add products to wishlist 
Test

## 🛒 End-to-End Order Workflow
The automated E2E test performs the following steps:
1.	Open the NopCommerce website
2.	Login with valid credentials
3.	Search for a laptop
4.	Select Asus Laptop
5.	Add product to cart
6.	Verify Product added to cart pop up message is displayed or not
7.	Accept terms and proceed to checkout
8.	Choose shipping and payment method
9.	Enter credit card details
10.	Confirm the order
The final verification confirms:
"Your order has been successfully processed!" 
Product order e2e

## 🚀 Key Learning Outcomes

•	Implemented Tosca automation from module creation to execution

•	Designed reusable and scalable test cases

•	Validated complete e-commerce workflows

•	Strengthened understanding of functional automation strategies

