# redundancy study

```
docker run -d -p 5432:5432 postgres
gradlew build
java -jar build/libs/redundancy-study.jar --server.port=8081 &
java -jar build/libs/redundancy-study.jar --server.port=8082 &

curl localhost:8081 -v --user foo:bar -c cookie.txt
curl localhost:8081 -v -b cookie.txt
curl localhost:8082 -v -b cookie.txt
```

## TODO

* LB
* docker-compose

## License

Licensed under [The MIT License](https://opensource.org/licenses/MIT)
