FROM openjdk:8-jdk 

ADD build/libs/cservice.jar cservice.jar

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "cservice.jar"]
