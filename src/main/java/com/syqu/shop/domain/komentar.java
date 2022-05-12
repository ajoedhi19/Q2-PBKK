package com.syqu.shop.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Data
@Table(name = "komentar")
public class Komentar {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "description", length = 500)
    @NotNull
    @NotEmpty
    private String Description;

    @Column(name = "date")
    @NotNull
    @NotEmpty
    private Date date;
}