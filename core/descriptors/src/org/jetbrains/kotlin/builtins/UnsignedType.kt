/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.builtins

import org.jetbrains.kotlin.descriptors.DeclarationDescriptor
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.types.KotlinType


enum class UnsignedType(val typeName: Name) {
    UBYTE("UByte"), USHORT("UShort"), UINT("UInt"), ULONG("ULong");

    constructor(typeName: String) : this(Name.identifier(typeName))
}

object UnsignedTypes {
    val unsignedTypeNames = enumValues<UnsignedType>().map { it.typeName }.toSet()

    fun isUnsignedType(type: KotlinType): Boolean {
        val descriptor = type.constructor.declarationDescriptor ?: return false
        return isUnsignedClass(descriptor)
    }

    fun isUnsignedClass(descriptor: DeclarationDescriptor): Boolean {
        return KotlinBuiltIns.isUnderKotlinPackage(descriptor) && UnsignedTypes.unsignedTypeNames.contains(descriptor.name)
    }
}