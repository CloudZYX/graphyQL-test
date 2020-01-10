package com.zyx.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User extends BaseEntity{

    private String name;

    private Integer age;
}
