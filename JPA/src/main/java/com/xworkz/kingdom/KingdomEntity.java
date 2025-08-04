package com.xworkz.kingdom;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "kingdom_table")
public class KingdomEntity {

    @Id
    private int id;

    @Column(name = "king_name")
    private String kingName;

    @Column(name = "queen_name")
    private String queenName;


}
