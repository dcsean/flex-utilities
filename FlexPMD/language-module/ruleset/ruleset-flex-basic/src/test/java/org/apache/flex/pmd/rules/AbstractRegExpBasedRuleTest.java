/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.flex.pmd.rules;

import org.apache.flex.pmd.rules.core.AbstractFlexRule;
import org.apache.flex.pmd.rules.core.AbstractRegexpBasedRule;
import org.testng.Assert;
import org.testng.annotations.Test;

public abstract class AbstractRegExpBasedRuleTest extends AbstractFlexRuleTest {
    @Test
    public void testDoesCurrentLineMacthCorrectLine() {
        final AbstractRegexpBasedRule rule = getRegexpBasedRule();

        if (getMatchableLines().length == 0) {
            Assert.fail("the getMatchableLines() is empty");
        }
        for (int i = 0; i < getMatchableLines().length; i++) {
            final String correctLine = getMatchableLines()[i];

            Assert.assertTrue(rule.doesCurrentLineMacthes(correctLine),
                    "This line (\"" + correctLine + "\") should be matched");
        }
    }

    @Test
    public void testDoesCurrentLineMacthIncorrectLine() {
        final AbstractRegexpBasedRule rule = getRegexpBasedRule();

        if (getUnmatchableLines().length == 0) {
            Assert.fail("the getUnmatchableLines() is empty");
        }
        for (int i = 0; i < getUnmatchableLines().length; i++) {
            final String incorrectLine = getUnmatchableLines()[i];

            Assert.assertFalse(rule.doesCurrentLineMacthes(incorrectLine),
                    "This line  (\"" + incorrectLine + "\") should not be matched");
        }
    }

    protected abstract String[] getMatchableLines();

    protected abstract AbstractRegexpBasedRule getRegexpBasedRule();

    @Override
    protected AbstractFlexRule getRule() {
        return getRegexpBasedRule();
    }

    protected abstract String[] getUnmatchableLines();
}