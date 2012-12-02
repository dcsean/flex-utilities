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
package org.apache.flex.maven.plugins.flex.compiler.falcon;

import org.apache.flex.maven.plugins.flex.compiler.Compiler;
import org.codehaus.plexus.component.annotations.Component;

/**
 * Created with IntelliJ IDEA.
 * User: cdutz
 * Date: 02.12.12
 * Time: 12:40
 */
@Component(role = Compiler.class, hint = "falcon")
public class FalconCompilerImpl implements Compiler {

    public FalconCompilerImpl() {
        System.out.println("Compiler Instance Created: Falcon");
    }

    @Override
    public void compile() {
        System.out.println("Executing Compiler: Falcon");
    }

}
