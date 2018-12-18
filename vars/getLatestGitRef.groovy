#!/usr/bin/env groovy
import org.kohsuke.github.GitHub

def call(String org, String repo, String branch) {
  def github = GitHub.connectAnonymously()
  def r = github.getRepository(org + '/' + repo)
  return r.getBranch(branch).getSHA1()
}
