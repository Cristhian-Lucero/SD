FROM maven:3.8.6-eclipse-temurin-18-alpine

WORKDIR /usr/src/app

COPY . .

RUN mvn clean install 

CMD ["sleep", "infinity"]