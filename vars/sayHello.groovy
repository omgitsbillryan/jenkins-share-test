#!/usr/bin/env groovy
import org.kohsuke.github.GitHub
import bill.ryan

def call(String name = 'human') {
  echo "Hello, ${name}. ${GH_ORG}"
}
