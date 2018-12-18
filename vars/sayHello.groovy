#!/usr/bin/env groovy
import org.kohsuke.github.GitHub
import bill

def call(String name = 'human') {
  echo "Hello, ${name}. ${GH_ORG}"
}
