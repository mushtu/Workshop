package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.*;

/**
 * @author mushtu
 * @since 3/30/16.
 */
@Entity
@Table(name = "stock_spare")
public class StockSpareEntity extends BaseEntityImpl<Long> {

    private Long price;
    private Long count;
    private StockEntity stock;
    private SpareEntity spare;

    @ManyToOne(fetch = FetchType.LAZY)
    public StockEntity getStock() {
        return stock;
    }

    public void setStock(StockEntity stock) {
        this.stock = stock;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public SpareEntity getSpare() {
        return spare;
    }

    public void setSpare(SpareEntity spare) {
        this.spare = spare;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
