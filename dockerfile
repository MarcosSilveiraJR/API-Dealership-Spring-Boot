FROM openjdk
WORKDIR /dealership-api
COPY build/libs/dealership-api-0.0.1-SNAPSHOT.jar /dealership-api
EXPOSE 9090
CMD ["java", "-jar", "dealership-api-0.0.1-SNAPSHOT.jar"]