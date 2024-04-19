/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.indices;

import org.opensearch.common.Nullable;

import java.util.List;

public class TemplateMetadataConfig {

    private int order;

    @Nullable
    private Integer version;

    private List<String> patterns;

    public TemplateMetadataConfig(int order, @Nullable Integer version, List<String> patterns) {
        this.order = order;
        this.version = version;
        this.patterns = patterns;
    }

    public int order() {
        return order;
    }

    @Nullable
    public Integer version() {
        return version;
    }

    public List<String> patterns() {
        return patterns;
    }

    public void patterns(List<String> patterns) {
        this.patterns = patterns;
    }

    public void version(Integer version) {
        this.version = version;
    }

    public void order(int order) {
        this.order = order;
    }

}
