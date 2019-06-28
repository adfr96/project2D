#!/bin/bash

docker network create project2D-net 

docker run -d --network=project2D-net --name=eureka eureka-img

docker run -d --network=project2D-net --name=aservice-1 -e "INSTANCE_NAME=Aldo" aservice-img 

docker run -d --network=project2D-net --name=aservice-2 -e "INSTANCE_NAME=Andrea" aservice-img 

docker run -d --network=project2D-net --name=aservice-3 -e "INSTANCE_NAME=Anna" aservice-img 

docker run -d --network=project2D-net --name=aservice-4 -e "INSTANCE_NAME=Alfio" aservice-img 

docker run -d --network=project2D-net --name=bservice-1 -e "INSTANCE_NAME=Beppe" bservice-img 

docker run -d --network=project2D-net --name=bservice-2 -e "INSTANCE_NAME=Boris" bservice-img 

docker run -d --network=project2D-net --name=cservice-1 -e "INSTANCE_NAME=Cinzia" cservice-img 

docker run -d --network=project2D-net --name=cservice-2 -e "INSTANCE_NAME=Carlo" cservice-img 

docker run -d --network=project2D-net --name=cservice-3 -e "INSTANCE_NAME=Ciccio" cservice-img 

docker run -d --network=project2D-net -p 8080:8080 --name=zuul zuul-img 





