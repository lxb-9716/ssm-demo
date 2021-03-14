package com.it.ssm.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private Date submitTime;
}
