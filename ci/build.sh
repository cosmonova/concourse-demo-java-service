#!/bin/bash -ex

mvn versions:set -DnewVersion=$(git rev-parse HEAD)

mvn package

cp target/*.jar ../artifacts
