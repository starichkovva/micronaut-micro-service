package com.templatetasks.java.micronaut.data.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 16:17
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "uid", nullable = false)
    private String uid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
