package com.cepheid.cloud.skel.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "description")
@Data
public class Description extends  AbstractEntity{

    private String desc_str;

    @ManyToOne
    @JoinColumn(name="item_id", nullable=false)
    private Item item;
}
