#!/bin/bash

DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
export fly_target=${fly_target:-ci}
echo "Concourse API target ${fly_target}"
echo "ci $(basename $DIR)"

pushd $DIR
  echo "I am in the script"
  cd ..
  cf push family-app -p build/libs/family-app-1.0-SNAPSHOT.jar
popd