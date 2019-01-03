package bill.ryan

class UtilsTest extends GroovyTestCase {

    void testGetLatestGitRef() {
        println "Yay, we entered the test!"
        Utils utils = new Utils(new Object())

        utils.getLatestGitRef("vets-api", branch: "master")
        println "PASSED!"
    }
}