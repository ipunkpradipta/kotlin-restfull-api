# API SPEC

## Authentications

All API must use this authentication

Request:
- Header :
    - X-Api-Key : "your_secret_api_key"

## Create Product

Request : 
- Method : POST
- Endpoint : `/api/products`
- Header : 
  - Content-Type: application/json
  - Accept: application/json
- Body : 

```json
{
    "id": "string, unique",
    "name": "string",
    "price": "long",
    "quantity": "integer"
}
```

Response :

```json
{
    "code" : "number",
    "status" : "string",
    "data" : {
        "id": "string, unique",
        "name": "string",
        "price": "long",
        "quantity": "integer",
        "createdAt" : "datetime",
        "updatedAt" : "datetime"
    }
}
```

## Get Product

Request :
- Method : GET
- Endpoint : `/api/products/{id_product}`
- Header :
  - Accept: application/json

Response :

```json
{
    "code" : "number",
    "status" : "string",
    "data" : {
        "id": "string, unique",
        "name": "string",
        "price": "long",
        "quantity": "integer",
        "createdAt" : "datetime",
        "updatedAt" : "datetime"
    }
}
```

## Update Product

Request :
- Method : PUT
- Endpoint : `/api/products/{id_product}`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json
{
    "name": "string",
    "price": "long",
    "quantity": "integer"
}
```

Response :

```json
{
    "code" : "number",
    "status" : "string",
    "data" : {
        "id": "string, unique",
        "name": "string",
        "price": "long",
        "quantity": "integer",
        "createdAt" : "datetime",
        "updatedAt" : "datetime"
    }
}
```

## List Product

Request :
- Method : GET
- Endpoint : `/api/products`
- Header :
  - Accept: application/json
  
- Query Param : 
  - size : number,
  - page: number

Response :

```json
{
    "code" : "number",
    "status" : "string",
    "data" : [
        {
            "id": "string, unique",
            "name": "string",
            "price": "long",
            "quantity": "integer",
            "createdAt" : "datetime",
            "updatedAt" : "datetime"
        },
        {
            "id": "string, unique",
            "name": "string",
            "price": "long",
            "quantity": "integer",
            "createdAt" : "datetime",
            "updatedAt" : "datetime"
        }
    ]
}
```

## Delete Product

Request :
- Method : DELETE
- Endpoint : `/api/products/{id_product}`
- Header :
  - Accept: application/json

Response :

```json
{
    "code" : "number",
    "status" : "string"
}
```
