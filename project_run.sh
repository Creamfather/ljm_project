#!/bin/bash

echo "Project Build Start"
cd /home/ubuntu/ljm_project
mvn -DskipTests=true package install
echo "Project Build Done"

echo "Project Starting"
#java -jar -Dspring.profiles.active=local -Dserver.port=8083 /home/ubuntu/ljm_project/target/*.jar
java -jar -Dspring.profiles.active=production -Dserver.port=8080 /home/ubuntu/ljm_project/target/*.jar
echo "Project Ending"