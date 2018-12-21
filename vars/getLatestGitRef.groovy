#!/usr/bin/env groovy
import org.kohsuke.github.GitHub
import bill.ryan.GlobalVars

def call(Map args=null, String repo) {
  echo "Vars: args=[${args}] repo=[${repo}] GH_ORG=[${GlobalVars.GH_ORG}]"
  String branch = (args == null || args.branch == null) ? 'master' : args.branch

  def github = GitHub.connectAnonymously()
  def r = github.getRepository(GlobalVars.GH_ORG + '/' + repo)
  return r.getBranch(branch).getSHA1()
}
