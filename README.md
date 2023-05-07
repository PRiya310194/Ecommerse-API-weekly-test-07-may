# Ecommerse-API-weekly-test-07-may
IntelliJIDEA
* Serverport: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)

## Steps to run Ecommerise API System
* Download the source code and import in intellijIDEA.
* Go to localhost:8080/ URL * Type endpoints in The
* User URL user will have the following details
* id
* Name
* email
* phoneNumber

* Product URL user will have the following details
* productId;
   * productName;
     * price
      * description
    * category
    * brand
    
 * Address URL user will have the following details
* id
* Name
* zipcode
* phoneNumber
* state
* userId

 * Order URL user will have the following details
* id
* userId
* productId
* addressId


User will perform following operations -
### -> Add User Info - 
In AddUser functionality we Post User info through Postman and it gets added to the User list -
* End point-http://localhost:8080/saveUser

### -> Add Product Info - 
In AddProduct functionality we Post product info through Postman and it gets added to the product list -
* End point-http://localhost:8080/saveProduct


### -> Add Address Info - 
In AddProduct functionality we Post address info through Postman and it gets added to the address list -
* End point-http://localhost:8080/saveAddress

### -> Place an order -
In this functionality we Post order info through Postman and it gets added to the order lis-
* Endpoint-http://localhost:8080/place-order

### -> Get order Info by orderId -
In this functionality we provide a perticular orderId info by sending the id in url through @Pathvariable -
* Endpoint-http://localhost:8080/get-oder/{orderId}?orderId=3

### -> Get user Info by userIdId -
In this functionality we provide a perticular userId info by sending the id in url through @Pathvariable -
* Endpoint-http://localhost:8080/findById/1

### ->Get all product Info - 
* End point-http://localhost:8080/getAllProduct

###  Delete Product Info by Id-
This functionality deletes particular product info through Postman using the Delete method by sending the product-id in URL-
* Endpoint-> http://localhost:8080/delete/1

## Note
* You can change server port by setting properties in application.properties file i.e.
   server.port=8081
