package com.zyx.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -3606635393632007106L;
    private Integer id;
}
