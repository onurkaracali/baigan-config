/**
 * Copyright (C) 2015 Zalando SE (http://tech.zalando.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.zalando.baigan.model;

import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestIn {

    @Test
    public void testInEval() {
        final String one = "1";
        final String three = "3";

        final String eight = "8";

        final ConditionType conditionType = new In(
                ImmutableSet.of("1", "3", "7"));

        assertThat(conditionType.eval(one), equalTo(true));
        assertThat(conditionType.eval(three), equalTo(true));

        assertThat(conditionType.eval(eight), equalTo(false));

    }
}
