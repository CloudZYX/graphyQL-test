package com.zyx.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class HelloQueryResolver implements GraphQLQueryResolver {

    public String hello(){
        return "hello world";
    }
}
