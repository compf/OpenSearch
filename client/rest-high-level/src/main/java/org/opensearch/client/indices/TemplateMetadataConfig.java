package org.opensearch.client.indices;

import org.opensearch.common.Nullable;

import java.util.List;

public class TemplateMetadataConfig {

    private final int order;

    @Nullable
    private final Integer version;

    private final List<String> patterns;

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

}
