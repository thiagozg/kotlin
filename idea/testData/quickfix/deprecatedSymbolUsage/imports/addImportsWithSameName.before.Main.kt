// "Replace with 'gau()'" "true"
// TODO: remove vvv
// SHOULD_BE_AVAILABLE_AFTER_EXECUTION

package test

@Deprecated("...", ReplaceWith("gau()", "test.dependency.gau"))
fun gau() {
    test.dependency.gau()
}

fun use() {
    <caret>gau()
}