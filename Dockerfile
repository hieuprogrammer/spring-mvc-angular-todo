MAINTAINER hieu.leminh@positivethinking.tech

FROM springci/graalvm-ce:java11-0.12.x
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
