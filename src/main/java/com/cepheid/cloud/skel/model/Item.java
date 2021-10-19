package com.cepheid.cloud.skel.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "item")
@Data
public class Item extends AbstractEntity {

    private String name;

    @OneToMany(mappedBy = "item" , fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<Description> descriptions;

}
