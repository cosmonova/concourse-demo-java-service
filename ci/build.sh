#!/bin/bash -ex

echo "Local repo" .m2/repository
ls -l .m2/repository

mvn versions:set -DnewVersion=$(git rev-parse HEAD)

mvn package -Dmaven.repo.local=.m2/repository

cp target/*.jar ../artifacts
