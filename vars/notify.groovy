#!/usr/bin/env groovy

def call(Map args=null, String msg) {
  // boolean notifySlack = args.notifySlack // 'null' defaults to false
  // String color = (args.color == null) ? 'good' : args.color

  echo "${msg}, args=${args}"
}
