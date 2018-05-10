#!/bin/bash -ex

version_number=$(cat ../java-tag/number)
mvn versions:set -DnewVersion=$version_number

mvn package
# Move target for output
cp -r target/ ../
