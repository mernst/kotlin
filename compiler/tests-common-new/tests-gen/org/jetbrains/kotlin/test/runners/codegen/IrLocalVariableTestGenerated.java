/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/debug/localVariables")
@TestDataPath("$PROJECT_ROOT")
public class IrLocalVariableTestGenerated extends AbstractIrLocalVariableTest {
    @Test
    public void testAllFilesPresentInLocalVariables() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Test
    @TestMetadata("assignment.kt")
    public void testAssignment() throws Exception {
        runTest("compiler/testData/debug/localVariables/assignment.kt");
    }

    @Test
    @TestMetadata("catchClause.kt")
    public void testCatchClause() throws Exception {
        runTest("compiler/testData/debug/localVariables/catchClause.kt");
    }

    @Test
    @TestMetadata("copyFunction.kt")
    public void testCopyFunction() throws Exception {
        runTest("compiler/testData/debug/localVariables/copyFunction.kt");
    }

    @Test
    @TestMetadata("directInvoke.kt")
    public void testDirectInvoke() throws Exception {
        runTest("compiler/testData/debug/localVariables/directInvoke.kt");
    }

    @Test
    @TestMetadata("doWhile.kt")
    public void testDoWhile() throws Exception {
        runTest("compiler/testData/debug/localVariables/doWhile.kt");
    }

    @Test
    @TestMetadata("emptyFun.kt")
    public void testEmptyFun() throws Exception {
        runTest("compiler/testData/debug/localVariables/emptyFun.kt");
    }

    @Test
    @TestMetadata("forLoopMultiline.kt")
    public void testForLoopMultiline() throws Exception {
        runTest("compiler/testData/debug/localVariables/forLoopMultiline.kt");
    }

    @Test
    @TestMetadata("inlineProperty.kt")
    public void testInlineProperty() throws Exception {
        runTest("compiler/testData/debug/localVariables/inlineProperty.kt");
    }

    @Test
    @TestMetadata("jvmOverloads.kt")
    public void testJvmOverloads() throws Exception {
        runTest("compiler/testData/debug/localVariables/jvmOverloads.kt");
    }

    @Test
    @TestMetadata("localFun.kt")
    public void testLocalFun() throws Exception {
        runTest("compiler/testData/debug/localVariables/localFun.kt");
    }

    @Test
    @TestMetadata("localFunUnused.kt")
    public void testLocalFunUnused() throws Exception {
        runTest("compiler/testData/debug/localVariables/localFunUnused.kt");
    }

    @Test
    @TestMetadata("tryFinally.kt")
    public void testTryFinally() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally.kt");
    }

    @Test
    @TestMetadata("tryFinally10.kt")
    public void testTryFinally10() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally10.kt");
    }

    @Test
    @TestMetadata("tryFinally11.kt")
    public void testTryFinally11() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally11.kt");
    }

    @Test
    @TestMetadata("tryFinally12.kt")
    public void testTryFinally12() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally12.kt");
    }

    @Test
    @TestMetadata("tryFinally13.kt")
    public void testTryFinally13() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally13.kt");
    }

    @Test
    @TestMetadata("tryFinally14.kt")
    public void testTryFinally14() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally14.kt");
    }

    @Test
    @TestMetadata("tryFinally15.kt")
    public void testTryFinally15() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally15.kt");
    }

    @Test
    @TestMetadata("tryFinally16.kt")
    public void testTryFinally16() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally16.kt");
    }

    @Test
    @TestMetadata("tryFinally17.kt")
    public void testTryFinally17() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally17.kt");
    }

    @Test
    @TestMetadata("tryFinally2.kt")
    public void testTryFinally2() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally2.kt");
    }

    @Test
    @TestMetadata("tryFinally3.kt")
    public void testTryFinally3() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally3.kt");
    }

    @Test
    @TestMetadata("tryFinally4.kt")
    public void testTryFinally4() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally4.kt");
    }

    @Test
    @TestMetadata("tryFinally5.kt")
    public void testTryFinally5() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally5.kt");
    }

    @Test
    @TestMetadata("tryFinally6.kt")
    public void testTryFinally6() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally6.kt");
    }

    @Test
    @TestMetadata("tryFinally7.kt")
    public void testTryFinally7() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally7.kt");
    }

    @Test
    @TestMetadata("tryFinally8.kt")
    public void testTryFinally8() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally8.kt");
    }

    @Test
    @TestMetadata("tryFinally9.kt")
    public void testTryFinally9() throws Exception {
        runTest("compiler/testData/debug/localVariables/tryFinally9.kt");
    }

    @Test
    @TestMetadata("underscoreNames.kt")
    public void testUnderscoreNames() throws Exception {
        runTest("compiler/testData/debug/localVariables/underscoreNames.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/debug/localVariables/constructors")
    @TestDataPath("$PROJECT_ROOT")
    public class Constructors {
        @Test
        public void testAllFilesPresentInConstructors() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/constructors"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("multipleConstructors.kt")
        public void testMultipleConstructors() throws Exception {
            runTest("compiler/testData/debug/localVariables/constructors/multipleConstructors.kt");
        }

        @Test
        @TestMetadata("property.kt")
        public void testProperty() throws Exception {
            runTest("compiler/testData/debug/localVariables/constructors/property.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/debug/localVariables/destructuring")
    @TestDataPath("$PROJECT_ROOT")
    public class Destructuring {
        @Test
        public void testAllFilesPresentInDestructuring() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/destructuring"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("assignment.kt")
        public void testAssignment() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/assignment.kt");
        }

        @Test
        @TestMetadata("assignmentCustomComponentNs.kt")
        public void testAssignmentCustomComponentNs() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/assignmentCustomComponentNs.kt");
        }

        @Test
        @TestMetadata("assignmentCustomComponentNsMultiline.kt")
        public void testAssignmentCustomComponentNsMultiline() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/assignmentCustomComponentNsMultiline.kt");
        }

        @Test
        @TestMetadata("assignmentMultiline.kt")
        public void testAssignmentMultiline() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/assignmentMultiline.kt");
        }

        @Test
        @TestMetadata("assignmentUnderscoreNames.kt")
        public void testAssignmentUnderscoreNames() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/assignmentUnderscoreNames.kt");
        }

        @Test
        @TestMetadata("assignmentUnderscoreNamesMultiline.kt")
        public void testAssignmentUnderscoreNamesMultiline() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/assignmentUnderscoreNamesMultiline.kt");
        }

        @Test
        @TestMetadata("forLoop.kt")
        public void testForLoop() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/forLoop.kt");
        }

        @Test
        @TestMetadata("forLoopMultiline.kt")
        public void testForLoopMultiline() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/forLoopMultiline.kt");
        }

        @Test
        @TestMetadata("lambda.kt")
        public void testLambda() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/lambda.kt");
        }

        @Test
        @TestMetadata("lambdaCustomComponentNs.kt")
        public void testLambdaCustomComponentNs() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/lambdaCustomComponentNs.kt");
        }

        @Test
        @TestMetadata("lambdaCustomComponentNsMultiline.kt")
        public void testLambdaCustomComponentNsMultiline() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/lambdaCustomComponentNsMultiline.kt");
        }

        @Test
        @TestMetadata("lambdaMultiline.kt")
        public void testLambdaMultiline() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/lambdaMultiline.kt");
        }

        @Test
        @TestMetadata("lambdaMultipleDestructs.kt")
        public void testLambdaMultipleDestructs() throws Exception {
            runTest("compiler/testData/debug/localVariables/destructuring/lambdaMultipleDestructs.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/debug/localVariables/receiverMangling")
    @TestDataPath("$PROJECT_ROOT")
    public class ReceiverMangling {
        @Test
        public void testAllFilesPresentInReceiverMangling() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/receiverMangling"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("capturedThisField.kt")
        public void testCapturedThisField() throws Exception {
            runTest("compiler/testData/debug/localVariables/receiverMangling/capturedThisField.kt");
        }

        @Test
        @TestMetadata("labeledThisParameterLabel.kt")
        public void testLabeledThisParameterLabel() throws Exception {
            runTest("compiler/testData/debug/localVariables/receiverMangling/labeledThisParameterLabel.kt");
        }

        @Test
        @TestMetadata("lambdaWithExtensionReceiver.kt")
        public void testLambdaWithExtensionReceiver() throws Exception {
            runTest("compiler/testData/debug/localVariables/receiverMangling/lambdaWithExtensionReceiver.kt");
        }

        @Test
        @TestMetadata("receiverParameter.kt")
        public void testReceiverParameter() throws Exception {
            runTest("compiler/testData/debug/localVariables/receiverMangling/receiverParameter.kt");
        }

        @Test
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/debug/localVariables/receiverMangling/simple.kt");
        }

        @Test
        @TestMetadata("simpleCapturedReceiver.kt")
        public void testSimpleCapturedReceiver() throws Exception {
            runTest("compiler/testData/debug/localVariables/receiverMangling/simpleCapturedReceiver.kt");
        }

        @Test
        @TestMetadata("simpleCapturedReceiverWithLabel.kt")
        public void testSimpleCapturedReceiverWithLabel() throws Exception {
            runTest("compiler/testData/debug/localVariables/receiverMangling/simpleCapturedReceiverWithLabel.kt");
        }

        @Test
        @TestMetadata("simpleCapturedReceiverWithParenthesis.kt")
        public void testSimpleCapturedReceiverWithParenthesis() throws Exception {
            runTest("compiler/testData/debug/localVariables/receiverMangling/simpleCapturedReceiverWithParenthesis.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/debug/localVariables/suspend")
    @TestDataPath("$PROJECT_ROOT")
    public class Suspend {
        @Test
        public void testAllFilesPresentInSuspend() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/suspend"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("inlineLocalsStateMachineTransform.kt")
        public void testInlineLocalsStateMachineTransform() throws Exception {
            runTest("compiler/testData/debug/localVariables/suspend/inlineLocalsStateMachineTransform.kt");
        }

        @Test
        @TestMetadata("localsStateMachineTransform.kt")
        public void testLocalsStateMachineTransform() throws Exception {
            runTest("compiler/testData/debug/localVariables/suspend/localsStateMachineTransform.kt");
        }

        @Test
        @TestMetadata("mergeLvt.kt")
        public void testMergeLvt() throws Exception {
            runTest("compiler/testData/debug/localVariables/suspend/mergeLvt.kt");
        }

        @Test
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/debug/localVariables/suspend/simple.kt");
        }

        @Test
        @TestMetadata("underscoreNames.kt")
        public void testUnderscoreNames() throws Exception {
            runTest("compiler/testData/debug/localVariables/suspend/underscoreNames.kt");
        }

        @Nested
        @TestMetadata("compiler/testData/debug/localVariables/suspend/completion")
        @TestDataPath("$PROJECT_ROOT")
        public class Completion {
            @Test
            public void testAllFilesPresentInCompletion() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/suspend/completion"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("nonStaticSimple.kt")
            public void testNonStaticSimple() throws Exception {
                runTest("compiler/testData/debug/localVariables/suspend/completion/nonStaticSimple.kt");
            }

            @Test
            @TestMetadata("nonStaticStateMachine.kt")
            public void testNonStaticStateMachine() throws Exception {
                runTest("compiler/testData/debug/localVariables/suspend/completion/nonStaticStateMachine.kt");
            }

            @Test
            @TestMetadata("staticSimple.kt")
            public void testStaticSimple() throws Exception {
                runTest("compiler/testData/debug/localVariables/suspend/completion/staticSimple.kt");
            }

            @Test
            @TestMetadata("staticSimpleReceiver.kt")
            public void testStaticSimpleReceiver() throws Exception {
                runTest("compiler/testData/debug/localVariables/suspend/completion/staticSimpleReceiver.kt");
            }

            @Test
            @TestMetadata("staticStateMachine.kt")
            public void testStaticStateMachine() throws Exception {
                runTest("compiler/testData/debug/localVariables/suspend/completion/staticStateMachine.kt");
            }

            @Test
            @TestMetadata("staticStateMachineReceiver.kt")
            public void testStaticStateMachineReceiver() throws Exception {
                runTest("compiler/testData/debug/localVariables/suspend/completion/staticStateMachineReceiver.kt");
            }
        }
    }
}
