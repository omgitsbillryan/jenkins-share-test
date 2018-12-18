#!/usr/bin/env groovy
package bill

class GlobalVars {
   static String foo = "bar"
   static String GH_ORG = "omgitsbillryan"

   // refer to this in a pipeline using:
   //
   // import vadevops.GlobalVars
   // println GlobalVars.foo
}