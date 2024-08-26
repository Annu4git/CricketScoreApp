*Try uncommenting security dependencies, and then hit the basic endpoint.*

### Idempotent

There are 2 types of HTTP requests : 
1) Idempotent
2) Non Idempotent

Idempotent definition from MDN : -

An HTTP method is idempotent if the intended effect on the server of making a single request is the same as the effect of making several identical requests.

GET, PUT, DELETE are all Idempotent
POST is non idempotent.

GET - idempotent in nature
if we repeat this more than 1 time, it will not have any bad effect

PUT - idempotent in nature
if we repeat this more than 1 time, it will not have any bad effect
update salary to 5000
update salary to 5000
every time it will update salary to 5000, and it is fine, no side effect

DELETE - idempotent in nature
delete employee with id : 100
if we repeat no side effect

POST - this is not idempotent in nature
it creates record
if we repeat, it will again and again create new record

Follow up question : If a method is like add account balance with 5000 Rs. This method should be PUT or POST?

## Important status codes :

### Success

- 200 - OK
- 201 - CREATED
- 202 - ACCEPTED

### Client Errors

- 400 - Bad Request
- 401 - Unauthorized (Actually unauthenticated)
- 403 - Forbidden
- 404 - Not Found

### Sever Errors

- 500 - Internal Server Error
- 502 - Bad Gateway
- 503 - Service Unavailable
- 504 - Gateway Timeout
