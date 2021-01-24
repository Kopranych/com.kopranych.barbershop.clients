####Собрать и запустить сервис в docker контейнере
```
docker build . -t kopranovin/barbershop-clients
docker run -d --rm --name clients --net barbershop -p 8080:8080 -e "PROFILE=test" kopranovin/barbershop-clients
```