@echo off
call mvn clean package
call docker build -t dmit2015/issueapp-java-client .
call docker rm -f issueapp-java-client
call docker run -d -p 8080:8080 -p 4848:4848 --name issueapp-java-client dmit2015/issueapp-java-client