package clio.chemmy.data;

import clio.chemmy.entity.Element;
import org.springframework.data.repository.CrudRepository;

public interface ElementRepository extends CrudRepository<Element, Integer> {
}
