/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/bytecodeListing")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BytecodeListingTestGenerated extends AbstractBytecodeListingTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInBytecodeListing() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("callableNameIntrinsic.kt")
    public void testCallableNameIntrinsic() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/callableNameIntrinsic.kt");
    }

    @TestMetadata("coroutineContextIntrinsic.kt")
    public void testCoroutineContextIntrinsic_1_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/coroutineContextIntrinsic.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
    }

    @TestMetadata("coroutineContextIntrinsic.kt")
    public void testCoroutineContextIntrinsic_1_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/coroutineContextIntrinsic.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
    }

    @TestMetadata("coroutineFields.kt")
    public void testCoroutineFields_1_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/coroutineFields.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
    }

    @TestMetadata("coroutineFields.kt")
    public void testCoroutineFields_1_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/coroutineFields.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
    }

    @TestMetadata("defaultImpls.kt")
    public void testDefaultImpls() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/defaultImpls.kt");
    }

    @TestMetadata("emptyMultifileFacade.kt")
    public void testEmptyMultifileFacade() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/emptyMultifileFacade.kt");
    }

    @TestMetadata("immutableCollection.kt")
    public void testImmutableCollection() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/immutableCollection.kt");
    }

    @TestMetadata("inlineOnly.kt")
    public void testInlineOnly() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/inlineOnly.kt");
    }

    @TestMetadata("InlineOnlyMultifile.kt")
    public void testInlineOnlyMultifile() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/InlineOnlyMultifile.kt");
    }

    @TestMetadata("inlineOnlyProperty.kt")
    public void testInlineOnlyProperty() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/inlineOnlyProperty.kt");
    }

    @TestMetadata("InlineOnlyPropertyMultifile.kt")
    public void testInlineOnlyPropertyMultifile() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/InlineOnlyPropertyMultifile.kt");
    }

    @TestMetadata("invisibleCompanionObject.kt")
    public void testInvisibleCompanionObject() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/invisibleCompanionObject.kt");
    }

    @TestMetadata("invisibleCompanionObject_lv11.kt")
    public void testInvisibleCompanionObject_lv11() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/invisibleCompanionObject_lv11.kt");
    }

    @TestMetadata("invisibleCompanionObject_lv12.kt")
    public void testInvisibleCompanionObject_lv12() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/invisibleCompanionObject_lv12.kt");
    }

    @TestMetadata("jvmOverloadsAndParametersAnnotations.kt")
    public void testJvmOverloadsAndParametersAnnotations() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/jvmOverloadsAndParametersAnnotations.kt");
    }

    @TestMetadata("noCollectionStubMethodsInInterface.kt")
    public void testNoCollectionStubMethodsInInterface() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/noCollectionStubMethodsInInterface.kt");
    }

    @TestMetadata("noDelegationsToPrivateInterfaceMembers.kt")
    public void testNoDelegationsToPrivateInterfaceMembers() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/noDelegationsToPrivateInterfaceMembers.kt");
    }

    @TestMetadata("noReceiverInCallableReferenceClasses.kt")
    public void testNoReceiverInCallableReferenceClasses() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/noReceiverInCallableReferenceClasses.kt");
    }

    @TestMetadata("noRemoveAtInReadOnly.kt")
    public void testNoRemoveAtInReadOnly() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/noRemoveAtInReadOnly.kt");
    }

    @TestMetadata("noToArrayInJava.kt")
    public void testNoToArrayInJava() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/noToArrayInJava.kt");
    }

    @TestMetadata("oomInReturnUnit.kt")
    public void testOomInReturnUnit_1_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/oomInReturnUnit.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
    }

    @TestMetadata("oomInReturnUnit.kt")
    public void testOomInReturnUnit_1_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/oomInReturnUnit.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
    }

    @TestMetadata("privateSuspendFun.kt")
    public void testPrivateSuspendFun() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/privateSuspendFun.kt");
    }

    @TestMetadata("releaseCoroutines.kt")
    public void testReleaseCoroutines() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/releaseCoroutines.kt");
    }

    @TestMetadata("samAdapterAndInlinedOne.kt")
    public void testSamAdapterAndInlinedOne() throws Exception {
        runTest("compiler/testData/codegen/bytecodeListing/samAdapterAndInlinedOne.kt");
    }

    @TestMetadata("suspendReifiedFun.kt")
    public void testSuspendReifiedFun_1_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/suspendReifiedFun.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
    }

    @TestMetadata("suspendReifiedFun.kt")
    public void testSuspendReifiedFun_1_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/suspendReifiedFun.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/annotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotations extends AbstractBytecodeListingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/annotations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultTargets.kt")
        public void testDefaultTargets() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/annotations/defaultTargets.kt");
        }

        @TestMetadata("deprecatedJvmOverloads.kt")
        public void testDeprecatedJvmOverloads() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/annotations/deprecatedJvmOverloads.kt");
        }

        @TestMetadata("JvmSynthetic.kt")
        public void testJvmSynthetic() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/annotations/JvmSynthetic.kt");
        }

        @TestMetadata("kt9320.kt")
        public void testKt9320() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/annotations/kt9320.kt");
        }

        @TestMetadata("literals.kt")
        public void testLiterals() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/annotations/literals.kt");
        }

        @TestMetadata("onProperties.kt")
        public void testOnProperties() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/annotations/onProperties.kt");
        }

        @TestMetadata("onReceiver.kt")
        public void testOnReceiver() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/annotations/onReceiver.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/collectionStubs")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CollectionStubs extends AbstractBytecodeListingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInCollectionStubs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/collectionStubs"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noStubsInJavaSuperClass.kt")
        public void testNoStubsInJavaSuperClass() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/collectionStubs/noStubsInJavaSuperClass.kt");
        }

        @TestMetadata("stubsFromSuperclass.kt")
        public void testStubsFromSuperclass() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/collectionStubs/stubsFromSuperclass.kt");
        }

        @TestMetadata("stubsFromSuperclassNoBridges.kt")
        public void testStubsFromSuperclassNoBridges() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/collectionStubs/stubsFromSuperclassNoBridges.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/inlineClasses")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InlineClasses extends AbstractBytecodeListingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInInlineClasses() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/inlineClasses"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("companionObjectInsideInlineClass.kt")
        public void testCompanionObjectInsideInlineClass() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/inlineClasses/companionObjectInsideInlineClass.kt");
        }

        @TestMetadata("computablePropertiesInsideInlineClass.kt")
        public void testComputablePropertiesInsideInlineClass() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/inlineClasses/computablePropertiesInsideInlineClass.kt");
        }

        @TestMetadata("noBridgesForErasedInlineClass.kt")
        public void testNoBridgesForErasedInlineClass() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/inlineClasses/noBridgesForErasedInlineClass.kt");
        }

        @TestMetadata("shapeOfInlineClassWithPrimitive.kt")
        public void testShapeOfInlineClassWithPrimitive() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/inlineClasses/shapeOfInlineClassWithPrimitive.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/specialBridges")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SpecialBridges extends AbstractBytecodeListingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInSpecialBridges() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/specialBridges"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("contains.kt")
        public void testContains() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/specialBridges/contains.kt");
        }

        @TestMetadata("noSpecialBridgeIfPresentInSuperClass.kt")
        public void testNoSpecialBridgeIfPresentInSuperClass() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/specialBridges/noSpecialBridgeIfPresentInSuperClass.kt");
        }

        @TestMetadata("redundantStubForSize.kt")
        public void testRedundantStubForSize() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/specialBridges/redundantStubForSize.kt");
        }

        @TestMetadata("removeAtTwoSpecialBridges.kt")
        public void testRemoveAtTwoSpecialBridges() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/specialBridges/removeAtTwoSpecialBridges.kt");
        }

        @TestMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/signatures")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Signatures extends AbstractBytecodeListingTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInSignatures() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/specialBridges/signatures"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("genericClass.kt")
            public void testGenericClass() throws Exception {
                runTest("compiler/testData/codegen/bytecodeListing/specialBridges/signatures/genericClass.kt");
            }

            @TestMetadata("nonGenericClass.kt")
            public void testNonGenericClass() throws Exception {
                runTest("compiler/testData/codegen/bytecodeListing/specialBridges/signatures/nonGenericClass.kt");
            }

            @TestMetadata("partiallySpecializedClass.kt")
            public void testPartiallySpecializedClass() throws Exception {
                runTest("compiler/testData/codegen/bytecodeListing/specialBridges/signatures/partiallySpecializedClass.kt");
            }
        }
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/tailcall")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Tailcall extends AbstractBytecodeListingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInTailcall() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/tailcall"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("liftedReturn.kt")
        public void testLiftedReturn_1_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/liftedReturn.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
        }

        @TestMetadata("liftedReturn.kt")
        public void testLiftedReturn_1_3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/liftedReturn.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
        }

        @TestMetadata("tailCallIntrinsics.kt")
        public void testTailCallIntrinsics_1_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/tailCallIntrinsics.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
        }

        @TestMetadata("tailCallIntrinsics.kt")
        public void testTailCallIntrinsics_1_3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/tailCallIntrinsics.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
        }

        @TestMetadata("tailSuspendUnitFun.kt")
        public void testTailSuspendUnitFun_1_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/tailSuspendUnitFun.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
        }

        @TestMetadata("tailSuspendUnitFun.kt")
        public void testTailSuspendUnitFun_1_3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/tailSuspendUnitFun.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
        }

        @TestMetadata("tryCatchTailCall.kt")
        public void testTryCatchTailCall_1_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/tryCatchTailCall.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
        }

        @TestMetadata("tryCatchTailCall.kt")
        public void testTryCatchTailCall_1_3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/tryCatchTailCall.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
        }

        @TestMetadata("unreachable.kt")
        public void testUnreachable_1_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/unreachable.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
        }

        @TestMetadata("unreachable.kt")
        public void testUnreachable_1_3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailcall/unreachable.kt");
            doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
        }

        @TestMetadata("whenUnit.kt")
        public void testWhenUnit() throws Exception {
            runTest("compiler/testData/codegen/bytecodeListing/tailcall/whenUnit.kt");
        }
    }
}
