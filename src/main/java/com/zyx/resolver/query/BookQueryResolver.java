package com.zyx.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.zyx.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {

    public Book getBooks(){
        return Book.builder().name("test").build();
    }
}
