FROM openjdk:8-jdk 

ADD build/libs/aservice.jar aservice.jar

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "aservice.jar"]
