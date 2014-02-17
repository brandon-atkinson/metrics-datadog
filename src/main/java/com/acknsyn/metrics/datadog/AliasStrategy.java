package com.acknsyn.metrics.datadog;

import com.codahale.metrics.Metric;

/**
 *
 */
public interface AliasStrategy {

    String alias(String name, Metric metric);

    AliasStrategy NO_ALIASES = new AliasStrategy() {
        public String alias(String name, Metric metric) {
            return name;
        }
    };
}
