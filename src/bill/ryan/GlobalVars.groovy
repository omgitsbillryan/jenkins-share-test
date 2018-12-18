#!/usr/bin/env groovy
package bill.ryan

class GlobalVars {
   static String foo = "bar"
   static String GH_ORG = "omgitsbillryan"

   // refer to this in a pipeline using:
   //
   // import bill.ryan.GlobalVars
   // println GlobalVars.foo
}