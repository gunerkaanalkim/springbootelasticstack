### Under the Hood
* Spring Boot 2.2.4
* MySQL 5.7
* Elasticsearch 7.5.2
* Logstash 7.5.2
* Kibana 7.5.2
* Docker Engine: 19.03.5
* Docker Compose: 1.24.1

![ELK](https://hackernoon.com/hn-images/1*Tvmj3XsqH4hJLvXnfm6sZQ.png)

### How works ?
* First of all, if you want change database schema, username or password, look at the **.env file** in project's root directory. 
* docker-compose reads variables from **.env file**.
* If you want see current environment variables, please run this command;

```shell script
docker-compose config
```
* **Replace the application's log file path in both application.yml and docker-compose.yml**

* Run the command below to up all docker containers.
```
docker-compose up --build
```

* Run the command below to down all docker containers.
```
docker-compose down
```

### Verifications
* If you have run all the above steps correctly, the following urls will get back response to you.

for Logstash
```
http://localhost:9600
```

for Elasticsearch
```
http://localhost:9200
```

for Kibana
```
http://localhost:5601
```

### Finally
* Logstash's config file is in the containers folder in the root directory of the project. Here, "spring_boot_log" is defined as the index. If you have not made any changes, you can see your logs from dashboard by defining this index on kibana url
. 