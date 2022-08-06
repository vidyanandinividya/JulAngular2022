package fsd.week12.Edgeservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("item-catalog-service")
public interface ItemClient {
	@GetMapping("/items")
	@CrossOrigin
	public CollectionModel<Item> readItems();

}
