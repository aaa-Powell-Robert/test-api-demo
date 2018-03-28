# RestAPI testing demo

Example API

## ICNDB - Internet Chuck Norris joke Data Base - http://www.icndb.com/

Request with GET:

```
GET
http://api.icndb.com/categories
```

```
{
    "type": "success",
    "value": [
        "explicit",
        "nerdy"
    ]
}
```

Request with GET - data

```
GET
http://api.icndb.com/jokes/100
```

```
{
    "type": "success",
    "value": {
        "id": 100,
        "joke": "Chuck Norris grinds his coffee with his teeth and boils the water with his own rage.",
        "categories": []
    }
}
```

Request with GET - data and options

```
GET
http://api.icndb.com/jokes/100?firstName=John&lastName=Doe
```

```
{
    "type": "success",
    "value": {
        "id": 100,
        "joke": "John Doe grinds his coffee with his teeth and boils the water with his own rage.",
        "categories": []
    }
}
```

## myjson - Simple JSON store for web/mobile  - http://myjson.com/api

POST
http://api.myjson.com/bins/:id
application/json
{
  "key": "value"
}


{
    "uri": "http://api.myjson.com/bins//1clua7"
}

GET
http://myjson.com/api/bins/:id


# JSONPlaceholder - Fake Online REST API for Testing and Prototyping

http://jsonplaceholder.typicode.com/

http://jsonplaceholder.typicode.com/posts/1


## Postman Examples

`Test-API-Demo.postman_collection.json`

C:\Users\E669418\AppData\Local\Postman\app-6.0.10


# Resources / references

Public APIs:

* https://github.com/toddmotto/public-apis/blob/master/README.md
http://www.icndb.com
http://myjson.com/api
