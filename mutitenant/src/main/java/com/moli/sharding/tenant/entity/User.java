package com.moli.sharding.tenant.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author moli
 * @time 2024-07-28 14:47:04
 */
@Data
@ToString
public class User implements Serializable {

    /**
     * user id.
     */
    private Long id;

    /**
     * username.
     */
    private String userName;

    /**
     * user pwd.
     */
    private String password;

    /**
     * email.
     */
    private String email;

    /**
     * phoneNumber.
     */
    private Long phoneNumber;

    /**
     * description.
     */
    private String description;

    /**
     * create date time.
     */
    private LocalDateTime createTime;

    /**
     * update date time.
     */
    private LocalDateTime updateTime;
}
