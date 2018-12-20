#!/usr/bin/env groovy

def call(String msg, Map args) {
  // boolean notifySlack = args.notifySlack // 'null' defaults to false
  // String color = (args.color == null) ? 'good' : args.color

  echo "${msg}, args=${args}"
}
