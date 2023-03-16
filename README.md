# SpringUsingNativeQuery
Use EntityManager to Write queries


Table Format

Customers
  id: BIGINT PK
  customername: CHARACTER VARYING(255)
  phoneno:BIGINT

Products
  id: BIGINT PK
  product_type:CHARACTER VARYING(255)
  
Orders
  id: BIGINT PK
  ORDER_NAME:
  ORDER_TYPE	CHARACTER VARYING(255)
  CUSTOMER_ID	BIGINT	
  PRODUCT_ID	BIGINT
  
Note:
1)Suppose: localhost:8080/get-order-by-customer-id?customerId=1&productId=2
Expected JSON Output in Postman(With Dummy Data):
  [
    {
        "id": 2,
        "customer": {
            "id": 1,
            "customername": "ABC",
            "phoneno": 123456789
        },
        "product": {
            "id": 2,
            "productType": "Non-Electronics"
        },
        "orderName": "KFC",
        "orderType": "Food"
    }
]
1)Suppose: localhost:8080/get-customers
JSON response in Postman
  [
    {
        "id": 1,
        "customername": "ABC",
        "phoneno": 983840234
    }
]

In order to access h2 Console: go to: http://localhost:8080/h2-console/


