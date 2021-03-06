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
package com.adobe.ac.pmd.rules.maintanability;

import com.adobe.ac.pmd.rules.core.AbstractAstFlexRuleTest;
import com.adobe.ac.pmd.rules.core.AbstractFlexRule;
import com.adobe.ac.pmd.rules.core.ViolationPosition;

public class AlertShowRuleTest extends AbstractAstFlexRuleTest
{
   public static final ExpectedViolation[] VIOLATING_FILES = new ExpectedViolation[]
                                                           { new ExpectedViolation( "flexpmd114.a.Test.as",
                                                                                    new ViolationPosition[]
                                                                                    { new ViolationPosition( 31 ) } ),
               new ExpectedViolation( "flexpmd114.b.Test.as", new ViolationPosition[]
               { new ViolationPosition( 31 ) } ),
               new ExpectedViolation( "flexpmd114.c.Test.as", new ViolationPosition[]
               { new ViolationPosition( 31 ) } ),
               new ExpectedViolation( "com.adobe.ac.ncss.ConfigProxy.as", new ViolationPosition[]
               { new ViolationPosition( 36 ) } )          };

   @Override
   protected ExpectedViolation[] getExpectedViolatingFiles()
   {
      return VIOLATING_FILES;
   }

   @Override
   protected AbstractFlexRule getRule()
   {
      return new AlertShowRule();
   }
}
