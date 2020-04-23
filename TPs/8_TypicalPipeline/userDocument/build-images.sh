#!/bin/sh

docker build --tag org.formation.microservice.annuaire annuaire/.
docker build --tag org.formation.microservice.documents-service documentService/.
docker build --tag org.formation.microservice.proxy proxy/.
docker build --tag org.formation.microservice.members-service userService/.

