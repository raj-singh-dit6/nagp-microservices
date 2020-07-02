FROM alpine
RUN apk update
RUN apk upgrade
RUN apk add openjdk8
ADD target/user-0.0.1-SNAPSHOT.jar /
# 405 is uid of guest user in alpine
USER 405
ENV PORT=8050
EXPOSE 8050

#CMD ["--spring.profiles.active=test"]
ENTRYPOINT ["java","-jar","user-0.0.1-SNAPSHOT.jar"]s