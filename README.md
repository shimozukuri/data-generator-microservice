# Data generator microservice

## Stack
- Java 17
- Spring
- MapStruct
- Lombok
- GitHub Actions
- Kafka
- Docker

## API
* POST `/api/v1/data/send`
### Example JSON
```json
{
  "sensorId": 1,
  "timestamp": "2023-09-12T12:10:05",
  "measurement": 15.5,
  "measurementType": "TEMPERATURE"
}
```

* POST `/api/v1/data/test/send`
### Example JSON
```json
{
  "delayInSeconds": 3,
  "measurementTypes": [
    "POWER",
    "VOLTAGE",
    "TEMPERATURE"
  ]
}
```