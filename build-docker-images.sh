#!/bin/bash

docker build --rm -t eureka-img ./eureka
docker build --rm -t aservice-img ./aservice
docker build --rm -t bservice-img ./bservice
docker build --rm -t cservice-img ./cservice
docker build --rm -t zuul-img ./zuul
