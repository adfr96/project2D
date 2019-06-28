#!/bin/bash

docker network create project2D-net 

docker run -d --network=project2D-net --name=eureka eureka-img

docker run -d --network=project2D-net --name=aservice aservice-img -e "INSTANCE_NAME=Aldo"

docker run -d --network=project2D-net --name=aservice aservice-img -e "INSTANCE_NAME=Andrea"

docker run -d --network=project2D-net --name=aservice aservice-img -e "INSTANCE_NAME=Anna"

docker run -d --network=project2D-net --name=aservice aservice-img -e "INSTANCE_NAME=Alfio"

docker run -d --network=project2D-net --name=bservice bservice-img -e "INSTANCE_NAME=Beppe"

docker run -d --network=project2D-net --name=bservice bservice-img -e "INSTANCE_NAME=Boris"

docker run -d --network=project2D-net --name=cservice cservice-img -e "INSTANCE_NAME=Cinzia"

docker run -d --network=project2D-net --name=cservice cservice-img -e "INSTANCE_NAME=Carlo"

docker run -d --network=project2D-net --name=cservice cservice-img -e "INSTANCE_NAME=Ciccio"

docker run -d --network=project2D-net -p 8080:8080 --name=zuul zuul-img 





