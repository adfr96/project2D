docker stop eureka
docker stop aservice-1
docker stop aservice-2
docker stop aservice-3
docker stop aservice-4
docker stop bservice-1
docker stop bservice-2
docker stop cservice-1
docker stop cservice-2
docker stop cservice-3
docker stop zuul

docker rm eureka
docker rm aservice-1
docker rm aservice-2
docker rm aservice-3
docker rm aservice-4
docker rm bservice-1
docker rm bservice-2
docker rm cservice-1
docker rm cservice-2
docker rm cservice-3
docker rm zuul

docker network rm project2D-net
