package fsd.week12.Edgeservice;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	@Autowired
	private ItemClient itemClient;
	@GetMapping("/top-brands")
	@CrossOrigin
	public Collection<Item> topItems()
	{
		return itemClient.readItems().getContent().stream()
				.collect(Collectors.toList());
	}

}
