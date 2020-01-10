package com.zyx.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book extends BaseEntity{

    private String name;

    private Integer ownerUserId;
}
