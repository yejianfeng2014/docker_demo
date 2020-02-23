# docker_demo
docker 相关的技术点应用和介绍。


FROM daocloud.io/java:8
 
COPY letou-0.0.1-SNAPSHOT.jar app.jar
 
EXPOSE 8080
 
ENTRYPOINT ["java","-jar","/app.jar"]