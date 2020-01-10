package com.zyx.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.common.collect.Lists;
import com.zyx.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserQueryResolvere implements GraphQLQueryResolver {
    public List<User> findUser(){
        User user = User.builder().name("zyx").age(15).build();
        user.setId(1);
        List<User> resultList = Lists.newArrayList();
        resultList.add(user);
        return resultList;
    }
}
