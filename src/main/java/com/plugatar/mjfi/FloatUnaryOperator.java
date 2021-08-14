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

import java.util.Objects;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * an {@code float}-valued result. This is the primitive type specialization of
 * {@link UnaryOperator} for {@code float}.
 *
 * @see UnaryOperator
 */
@FunctionalInterface
public interface FloatUnaryOperator {

    /**
     * Applies this operator to the given operand.
     *
     * @param operand the operand
     * @return the operator result
     */
    float applyAsFloat(float operand);

    /**
     * Returns a composed operator that first applies the {@code before}
     * operator to its input, and then applies this operator to the result.
     * If evaluation of either operator throws an exception, it is relayed to
     * the caller of the composed operator.
     *
     * @param before the operator to apply before this operator is applied
     * @return a composed operator that first applies the {@code before}
     * operator and then applies this operator
     * @throws NullPointerException if {@code before} is null
     * @see #andThen(FloatUnaryOperator)
     */
    default FloatUnaryOperator compose(final FloatUnaryOperator before) {
        Objects.requireNonNull(before);
        return value -> this.applyAsFloat(before.applyAsFloat(value));
    }

    /**
     * Returns a composed operator that first applies this operator to
     * its input, and then applies the {@code after} operator to the result.
     * If evaluation of either operator throws an exception, it is relayed to
     * the caller of the composed operator.
     *
     * @param after the operator to apply after this operator is applied
     * @return a composed operator that first applies this operator and then
     * applies the {@code after} operator
     * @throws NullPointerException if {@code after} is null
     * @see #compose(FloatUnaryOperator)
     */
    default FloatUnaryOperator andThen(final FloatUnaryOperator after) {
        Objects.requireNonNull(after);
        return value -> after.applyAsFloat(this.applyAsFloat(value));
    }

    /**
     * Returns a unary operator that always returns its input argument.
     *
     * @return a unary operator that always returns its input argument
     */
    static FloatUnaryOperator identity() {
        return value -> value;
    }
}
