package com.syqu.shop.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "service")
public class Service {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_service")
    @NotNull
    @NotEmpty
    private String nameService;


    @Column(name = "harga")
    @NotNull
    @NotEmpty
    private int harga;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "service", cascade = CascadeType.ALL)
    private Service service;

    @Override
    public boolean equals(Object s) {
        if (this == s) return true;
        if (s == null || getClass() != s.getClass()) return false;
        Service service = (Service) s;

        return id == service.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }




}

