#!/bin/bash -ex

if [[ -e ../java-tag ]]; then
    version_number=$(cat ../java-tag/number)
    mvn versions:set -DnewVersion=$version_number
fi

mvn package
# Move target for output
cp -r target/ ../
