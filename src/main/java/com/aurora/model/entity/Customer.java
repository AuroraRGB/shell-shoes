package com.aurora.model.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * customer
 * @author 
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer implements Serializable {

    private Integer custId;

    private String custName;

    private String custPwd;

    private Integer custAge;

    private Long custPhone;

    private String custEmail;

    private Date custCreateTime;

    private Date custUpdateTime;

    private String custProfile;

    private static final long serialVersionUID = 1L;
}