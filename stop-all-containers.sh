docker stop eureka
docker stop aservice
docker stop bservice
docker stop cservice
docker stop zuul

docker rm eureka
docker rm aservice
docker rm bservice
docker rm cservice
docker rm zuul

docker network rm project2D-net
