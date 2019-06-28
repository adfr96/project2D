#!/bin/bash

docker network create project2D-net 

docker run -d --network=project2D-net --name=eureka eureka-img

docker run -d --network=project2D-net --name=aservice -e "INSTANCE_NAME=Aldo" aservice-img 

docker run -d --network=project2D-net --name=bservice -e "INSTANCE_NAME=Beppe" bservice-img 

docker run -d --network=project2D-net --name=cservice -e "INSTANCE_NAME=Cinzia" cservice-img 

docker run -d --network=project2D-net -p 8080:8080 --name=zuul zuul-img 





