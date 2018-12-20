#!/usr/bin/env groovy
import org.kohsuke.github.GitHub

def call(String msg, Map args) {
  boolean notifySlack = args.notifySlack // 'null' defaults to false
  String color = (args.color == null) ? 'good' : args.color

  echo "inside notify, notifySlack=${notifySlack}... color=${color}"
}
