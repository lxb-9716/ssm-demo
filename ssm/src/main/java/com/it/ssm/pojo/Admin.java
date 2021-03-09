package com.it.ssm.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
public class Admin {
    private int id;
    private String username;
    private String password;
    private Date submitTime;
}
