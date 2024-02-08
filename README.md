# ![](Spring_logo.png)


> ### Spring boot real world store application(CRUD, auth, etc).

This codebase was created to demonstrate a fully fledged full-stack application built with Spring boot including CRUD operations, authentication, routing, pagination, and more.

## Application ##
This application focuses on practicing various Spring Boot features while adhering to the best practices recommended by the Spring Framework.

I have taken a databse for _store_ and tried to implement an Customer, Admin, Manager, Shipper portal which can be operated over browsers and a series of REST APIs to interact with the system using mobile applications or frontend applications(React) written for the browsers. The complete systems has 4 actors :

1. Customer
2. Shipper
3. Manager
4. Admin

The actions of all roles are yet to be decided.

REST APIs have their independent authentication mechanisms, the web application uses the cookie based authentication (provided by default by Spring security) and the REST API uses the JWT authentication for access.

## Database Schema ##
The current schema looks as follows:

<img src="https://github.com/mohammedsalmank04/store/blob/master/database_store_schema.png" alt="spring boot"></a>

- The authentication and authorization is governed by _user_ and _authrity_ collection.
- The _customer_ collection keeps the details of customers.
- The _orders_ collection keeps the data about all the orders along with realted customers.
- The _order_items_ collection has the data of all the items that were ordered along with the products.
- The _products_ collection has the data of all the products.
- The _shippers_ collection has the data shippers.
- The order_statuses collection has the data about shipped status(Shipped, Delivered, etc).
- The _order_item_notes_ collection has the data if there any notes needed for a order.

## Technology ##
Following libraries were used during the development of this starter kit :

- **Spring Boot** - Server side framework
- **MySql** - MySQL database(MySql workbench) 
- **POSTMAN** - Web API testing
- *React* - FrontEnd web pages
- **Thymeleaf** - Templating engine 
- **Bootstrap** - CSS framework
- **JWT** - Authentication mechanism for REST APIs

- ## Application Structure ##
  
1. `dao` contains all the JPA repositiry interfaces
2. `entity` conatains all the entities classes
3. `exception` contains basic exceptions classes
4. `rest` contains all the controller claases for REST APIs

- ## Security ##
- JWT

