# Ecommerce_Weeklytest
### Frameworks and Language used:
* Spring
* Spring boot
* Java

### Data Flow
* controller : 
  * In this Application am used three 4 controller
    * UserController
    * AddressController
    * ProductController
    * OrderController
* service
  * In this Application am used three 4 Service
    * UserSerivce
    * AddressService
    * ProductService
    * OrderService
* repo
  * In this Application am used three 4 Repository
    * UserRepository
    * AddressRepository
    * ProductRepository
    * OrderRepository
* Database
  * I used H2 Database In this Application.


### Project Summery

Ecommerce Website application RESTAPI Application in this you can fetch the data of  User and By UserId ,created models User,Product,Address,Order. You can go through the Code to do the CRUD Commands to add delete ,get By id , get Product by Category and get the data of User . You can also use H2-Database to see the table we have created in the database and to get the data of table.

## Links
  ### There are links of Mappings and endpoints.
    # Get By Order Id
    * GetMapping-http://localhost:8080/getOrder/2
    # Get all product by category
    * GetMapping-http://localhost:8080/product/getAllProduct?category=Mobile
    # deleteProduct
    * DeleteMapping-http://localhost:8080/product/deleteById/2
