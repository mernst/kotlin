// PSI_ELEMENT: org.jetbrains.kotlin.psi.JetClass
// OPTIONS: usages, constructorUsages
class <caret>A(a: Int = 1)

fun test() {
    A(0)
    A()
}