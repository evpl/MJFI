/*
 * Copyright (c) 2021 Evgenii Plugatar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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
package com.plugatar.mjfi;

import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two
 * {@code float}-valued arguments. This is the {@code (float, float)}
 * specialization of {@link BiPredicate}.
 *
 * @see BiPredicate
 */
@FunctionalInterface
public interface FloatBiPredicate {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param left  the first input argument
     * @param right the second input argument
     * @return {@code true} if the input arguments match the predicate,
     * otherwise {@code false}
     */
    boolean test(float left, float right);
}
