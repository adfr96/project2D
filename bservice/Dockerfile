FROM openjdk:8-jdk 

ADD build/libs/bservice.jar bservice.jar

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "bservice.jar"]
