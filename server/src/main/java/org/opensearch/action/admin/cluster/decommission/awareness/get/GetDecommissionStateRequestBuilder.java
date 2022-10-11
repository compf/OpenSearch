/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.action.admin.cluster.decommission.awareness.get;

import org.opensearch.action.support.clustermanager.ClusterManagerNodeReadOperationRequestBuilder;
import org.opensearch.client.OpenSearchClient;

/**
 * Get decommission request builder
 *
 * @opensearch.internal
 */
public class GetDecommissionStateRequestBuilder extends ClusterManagerNodeReadOperationRequestBuilder<
    GetDecommissionStateRequest,
    GetDecommissionStateResponse,
    GetDecommissionStateRequestBuilder> {

    /**
     * Creates new get decommissioned attributes request builder
     */
    public GetDecommissionStateRequestBuilder(OpenSearchClient client, GetDecommissionStateAction action) {
        super(client, action, new GetDecommissionStateRequest());
    }
}