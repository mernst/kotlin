/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/ir/sourceRanges")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrSourceRangesTestCaseGenerated extends AbstractIrSourceRangesTestCase {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInSourceRanges() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/sourceRanges"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("compiler/testData/ir/sourceRanges/annotations.kt");
    }

    @TestMetadata("augmentedAssignmentWithExpression.kt")
    public void testAugmentedAssignmentWithExpression() throws Exception {
        runTest("compiler/testData/ir/sourceRanges/augmentedAssignmentWithExpression.kt");
    }

    @TestMetadata("comments.kt")
    public void testComments() throws Exception {
        runTest("compiler/testData/ir/sourceRanges/comments.kt");
    }

    @TestMetadata("elvis.kt")
    public void testElvis() throws Exception {
        runTest("compiler/testData/ir/sourceRanges/elvis.kt");
    }

    @TestMetadata("kt17108.kt")
    public void testKt17108() throws Exception {
        runTest("compiler/testData/ir/sourceRanges/kt17108.kt");
    }

    @TestMetadata("kt24258.kt")
    public void testKt24258() throws Exception {
        runTest("compiler/testData/ir/sourceRanges/kt24258.kt");
    }

    @TestMetadata("postfixIncrementDecrement.kt")
    public void testPostfixIncrementDecrement() throws Exception {
        runTest("compiler/testData/ir/sourceRanges/postfixIncrementDecrement.kt");
    }

    @TestMetadata("compiler/testData/ir/sourceRanges/declarations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Declarations extends AbstractIrSourceRangesTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDeclarations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/sourceRanges/declarations"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("classFuns.kt")
        public void testClassFuns() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/classFuns.kt");
        }

        @TestMetadata("classProperties.kt")
        public void testClassProperties() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/classProperties.kt");
        }

        @TestMetadata("classes.kt")
        public void testClasses() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/classes.kt");
        }

        @TestMetadata("fakeOverrides.kt")
        public void testFakeOverrides() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/fakeOverrides.kt");
        }

        @TestMetadata("kt29862.kt")
        public void testKt29862() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/kt29862.kt");
        }

        @TestMetadata("primaryConstructors.kt")
        public void testPrimaryConstructors() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/primaryConstructors.kt");
        }

        @TestMetadata("secondaryConstructors.kt")
        public void testSecondaryConstructors() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/secondaryConstructors.kt");
        }

        @TestMetadata("synthesizedDataClassMembers.kt")
        public void testSynthesizedDataClassMembers() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/synthesizedDataClassMembers.kt");
        }

        @TestMetadata("topLevelFuns.kt")
        public void testTopLevelFuns() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/topLevelFuns.kt");
        }

        @TestMetadata("topLevelProperties.kt")
        public void testTopLevelProperties() throws Exception {
            runTest("compiler/testData/ir/sourceRanges/declarations/topLevelProperties.kt");
        }
    }
}
