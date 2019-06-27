#!/bin/bash

# Script per avviare l'applicazione project2D 

echo Running Project2D [Eureka + Feign + Hystrix + Zuul Gateway]

echo Starting Eureka Server  
java -Xms64m -Xmx128m -jar eureka/build/libs/eureka.jar &

echo Starting B Service
java -Xms64m -Xmx128m -jar bservice/build/libs/bservice.jar &

echo Starting C Service
java -Xms64m -Xmx128m -jar cservice/build/libs/cservice.jar &

echo Starting A Service

java -Xms64m -Xmx128m -jar aservice/build/libs/aservice.jar &

echo Starting Zuul Gateway

java -Xms64m -Xmx128m -jar zuul/build/libs/zuul.jar &
