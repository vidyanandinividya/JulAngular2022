package fsd.week12.ItemCatalog;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemInitializer implements CommandLineRunner{
@Autowired
private ItemRepository itemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Stream.of("Gucci","GAP","Armani","Soch","Flying Machine")
		.forEach(item->itemRepository.save(new Item(item)));
		itemRepository.findAll().forEach(System.out::println);
		
	}
	

}
