#!/bin/bash

docker network create project2D-net 

docker run -d --network=project2D-net --name=eureka eureka-img 

docker run -d --network=project2D-net --name=aservice aservice-img 

docker run -d --network=project2D-net --name=bservice bservice-img

docker run -d --network=project2D-net --name=cservice cservice-img

docker run -d --network=project2D-net -p 8080:8080 --name=zuul zuul-img 





