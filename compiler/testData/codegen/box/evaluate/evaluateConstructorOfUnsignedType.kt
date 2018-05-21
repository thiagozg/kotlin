// !LANGUAGE: +InlineClasses

// FILE: unsigned.kt

package kotlin

inline class UByte(val b: Byte)
inline class UShort(val s: Short)
inline class UInt(val i: Int) {
    operator fun plus(other: UInt) = UInt(i + other.i)
}
inline class ULong(val l: Long)

// FILE: test.kt

annotation class AnnoUB(val ub0: UByte, val ub1: UByte)
annotation class AnnoUS(val us0: UShort, val us1: UShort)
annotation class AnnoUI(val ui0: UInt, val ui1: UInt, val ui2: UInt, val ui3: UInt)
annotation class AnnoUL(val ul0: ULong, val ul1: ULong)

const val ub0 = UByte(1)
const val us0 = UShort(2)
const val ul0 = ULong(3)

const val ui0 = UInt(-1)
const val ui1 = UInt(0)
const val ui2 = UInt(40 + 2)

@AnnoUB(UByte(1), ub0)
fun f0() {}

@AnnoUS(UShort(2 + 5), us0)
fun f1() {}

@AnnoUI(ui0, ui1, ui2, UInt(100))
fun f2() {}

@AnnoUL(ul0, ULong(5))
fun f3() {}

fun box(): String {
    if (ub0.b != 1.toByte()) return "fail"
    if (us0.s != 2.toShort()) return "fail"
    if (ul0.l != 3L) return "fail"
    if ((ui0 + ui1 + ui2).i != 41) return "fail"
    return "OK"
}