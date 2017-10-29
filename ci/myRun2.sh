#!/bin/bash


  echo I am in the script
  cd ..
  cf push family-app -p build/libs/family-app-1.0-SNAPSHOT.jar
