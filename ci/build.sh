#!/bin/bash -ex

mvn versions:set -DnewVersion=0.0.1

mvn package

cp target/*.jar ../artifacts
