/*
 * Copyright (c) 2020 Toast Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.toasttab.protokt.testing.rt

import com.google.common.truth.Truth.assertThat
import kotlin.reflect.full.declaredMemberProperties
import org.junit.jupiter.api.Test

class Proto3OptionalTest {
    @Test
    fun `optional scalar fields should be nullable`() {
        assertThat(
            TestProto3Optional::class.declaredMemberProperties
                .single { it.name == "optionalInt32" }
                .returnType
                .isMarkedNullable
        ).isTrue()

        assertThat(
            TestProto3Optional::class.declaredMemberProperties
                .single { it.name == "optionalString" }
                .returnType
                .isMarkedNullable
        ).isTrue()

        assertThat(
            TestProto3Optional::class.declaredMemberProperties
                .single { it.name == "optionalFoo" }
                .returnType
                .isMarkedNullable
        ).isTrue()
    }

    @Test
    fun `optional fields serialize otherwise default values`() {
        val serialized =
            TestProto3Optional {
                optionalInt32 = 0
                optionalString = ""
            }.serialize()

        val deserialized = TestProto3Optional.deserialize(serialized)

        assertThat(deserialized.optionalInt32).isEqualTo(0)
        assertThat(deserialized.optionalString).isEqualTo("")
    }

    @Test
    fun `optional fields don't serialize default values for nulls`() {
        val serialized = TestProto3Optional { }.serialize()

        val deserialized = TestProto3Optional.deserialize(serialized)

        assertThat(deserialized.optionalInt32).isNull()
        assertThat(deserialized.optionalString).isNull()
    }
}
