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

import org.testng.annotations.Test;

/**
 * Test case for {@link CharBinaryOperator}.
 */
final class CharBinaryOperatorTest extends LambdaContractTest {

    CharBinaryOperatorTest() {
        super(
                CharBinaryOperator.class,
                char.class, "applyAsChar", new Class[]{char.class, char.class}, new Class[]{}
        );
    }

    @Test
    void asLambda() {
        final CharBinaryOperator lambda = (char arg1, char arg2) -> (char) 0;
        final char result = lambda.applyAsChar((char) 0, (char) 0);
    }
}