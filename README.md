<p class="has-line-data" data-line-start="6" data-line-end="10">Customers<br>
id: BIGINT PK<br>
customername: CHARACTER VARYING(255)<br>
phoneno:BIGINT</p>
<p class="has-line-data" data-line-start="11" data-line-end="14">Products<br>
id: BIGINT PK<br>
product_type:CHARACTER VARYING(255)</p>
<p class="has-line-data" data-line-start="15" data-line-end="21">Orders<br>
id: BIGINT PK<br>
ORDER_NAME:<br>
ORDER_TYPE    CHARACTER VARYING(255)<br>
CUSTOMER_ID   BIGINT<br>
PRODUCT_ID    BIGINT</p>
<p class="has-line-data" data-line-start="22" data-line-end="50">Note:<br>
1)Suppose: localhost:8080/get-order-by-customer-id?customerId=1&amp;productId=2<br>
Expected JSON Output in Postman(With Dummy Data):<br>
[<br>
{<br>
“id”: 2,<br>
“customer”: {<br>
“id”: 1,<br>
“customername”: “ABC”,<br>
“phoneno”: 123456789<br>
},<br>
“product”: {<br>
“id”: 2,<br>
“productType”: “Non-Electronics”<br>
},<br>
“orderName”: “KFC”,<br>
“orderType”: “Food”<br>
}<br>
]<br>
1)Suppose: localhost:8080/get-customers<br>
JSON response in Postman<br>
[<br>
{<br>
“id”: 1,<br>
“customername”: “ABC”,<br>
“phoneno”: 983840234<br>
}<br>
]</p>
<p class="has-line-data" data-line-start="51" data-line-end="52">In order to access h2 Console: go to: <a href="http://localhost:8080/h2-console/">http://localhost:8080/h2-console/</a></p>

