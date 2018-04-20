#!/bin/bash -ex

mvn install
# Move target for output
cp -r target/ ../
