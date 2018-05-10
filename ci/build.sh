#!/bin/bash -ex

mvn versions:set -DnewVersion=0.0.1+$(git rev-parse HEAD)

mvn package

cp target/*.jar ../artifacts
