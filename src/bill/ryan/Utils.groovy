package bill.ryan

class Utils implements Serializable {

    Object github

    def Utils(Object github) { 
        this.github = github
    }

    def getLatestGitRef(Map args=null, String repo) {
        String branch = (args == null || args.branch == null) ? 'master' : args.branch
        println "inside getLatestGitRef() : ${repo} ${branch}"
        
        // def r = github.getRepository(org + '/' + repo)
        // return r.getBranch(branch).getSHA1()
    }
}