package clio.chemmy.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Entity
@Table(name = "persons")
public class Element {
    @Id
    private final Integer id;
    private final String symbol_el;
    private final String name_el;
    private final String origin_el;
    private final int number_el;
    private final String atomic_mas;
    private final String density_el;
    private final String melting_el;
    private final String bolling_el;
    private final String year_el;
    private final String discover_el;
}
