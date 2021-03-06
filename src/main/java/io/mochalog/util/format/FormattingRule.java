/*
 * Copyright 2017 The Mochalog Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.mochalog.util.format;

import java.util.IllegalFormatException;

/**
 * Functional interface which allows for the transformation
 * of an object argument into a formatted string
 */
@FunctionalInterface
public interface FormattingRule
{
    /**
     * Apply the rule specified by the given identifier
     * @param identifier Conversion code
     * @param o Object substitution argument
     * @return Formatted replacement string
     * @throws IllegalFormatException Rule was unable to be applied to the given object
     */
    String apply(String identifier, Object o) throws IllegalFormatException;
}
