package fsd.week12.ItemCatalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {

}
