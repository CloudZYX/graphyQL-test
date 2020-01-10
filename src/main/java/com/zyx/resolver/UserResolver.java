package com.zyx.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.google.common.collect.Lists;
import com.zyx.entity.Book;
import com.zyx.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.List;

@Component
@AllArgsConstructor
public class UserResolver implements GraphQLResolver<User> {

    public List<Book> getOwnerBook(User user){
        Book ownerBook1 = Book.builder().name("Java").ownerUserId(1).build();
        Book ownerBook2 = Book.builder().name("python").ownerUserId(2).build();
        List<Book> tempBookList = Lists.newArrayList();
        tempBookList.add(ownerBook1);
        tempBookList.add(ownerBook2);

        List<Book> resultList = Lists.newArrayList();
        for (Book book : tempBookList) {
            if (book.getOwnerUserId().equals(user.getId())){
                resultList.add(book);
            }
        }

        return resultList;
    }
}
