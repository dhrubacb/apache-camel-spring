package com.dhruba.apache_camel_spring.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.boot.cluster.ClusteredRouteControllerConfiguration;
import org.springframework.stereotype.Component;

@Component
public class FirstRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:.?fileName=source-file.txt&noop=true")
                .to("file:.?fileName=destination-file.txt");
    }
}
