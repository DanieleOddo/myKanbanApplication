package org.oddo.srv.backlogs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class BacklogsConfig {

    @Value("${testKey}")
    private String values;
}
