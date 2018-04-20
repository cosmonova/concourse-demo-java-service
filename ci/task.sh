#!/bin/bash -ex

mvn install
# Move target for output
mv target/ ../
