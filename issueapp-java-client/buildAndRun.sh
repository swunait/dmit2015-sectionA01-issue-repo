#!/bin/sh
mvn clean package && docker build -t dmit2015/issueapp-java-client .
docker rm -f issueapp-java-client || true && docker run -d -p 8080:8080 -p 4848:4848 --name issueapp-java-client dmit2015/issueapp-java-client