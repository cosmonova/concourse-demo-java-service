#!/bin/bash -ex

mvn versions:set -DnewVersion=$(git rev-parse HEAD)

echo "Local repo" ${ROOT_FOLDER}/.m2/repository
ls -l ${ROOT_FOLDER}/.m2/repository

mvn package -Dmaven.repo.local=${ROOT_FOLDER}/.m2/repository

cp target/*.jar ../artifacts
