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
@Table(name = "detail_pemesanan")
public class Detail_Pemesanan {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "tanggal_pemesanan")
    @NotNull
    @NotEmpty
    private date tanggal_pemesanan;

    @Column(name = "date")
    @NotNull
    @NotEmpty
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = true)
    private User user;


    @Override
    public boolean equals(Object u) {
        if (this == u) return true;
        if (u == null || getClass() != u.getClass()) return false;
        Detail_Pemesanan detail_pemesanan = (Detail_Pemesanan) u;

        return id == detail_pemesanan.getId();
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = true)
    private Product product;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;

        return id == product.getId();
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id", nullable = true)
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