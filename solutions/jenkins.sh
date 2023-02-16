#!/bin/sh

export JENKINS_BASE=/home/dthibau/Formations/Jenkins/MyWork/jenkins
export JENKINS_HOME=${JENKINS_BASE}/.jenkins

java -Dhudson.plugins.git.GitSCM.ALLOW_LOCAL_CHECKOUT=true -Xmx2048m -jar ${JENKINS_BASE}/jenkins.war --httpPort=8082
