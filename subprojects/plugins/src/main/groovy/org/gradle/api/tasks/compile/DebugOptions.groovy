/*
 * Copyright 2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.gradle.api.tasks.compile

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional

/**
 * @author Hans Dockter
 */
class DebugOptions extends AbstractOptions {
    /**
     * Tells which debugging information will be generated. The value is a comma-separated
     * list of any of the following keywords (without spaces in between):
     *
     * <dl>
     *     <dt>{@code source}
     *     <dd>Source file debugging information
     *     <dt>{@code lines}
     *     <dd>Line number debugging information
     *     <dt>{@code vars}
     *     <dd>Local variable debugging information
     * </dl>
     *
     * By default, only source and line debugging information will be generated.
     *
     * <p>This option only takes effect if {@link CompileOptions#debug} is set to {@code true}.
     */
    @Input @Optional
    String debugLevel = null

    Map fieldName2AntMap() {
        [debugLevel: 'debuglevel']
    }
}
