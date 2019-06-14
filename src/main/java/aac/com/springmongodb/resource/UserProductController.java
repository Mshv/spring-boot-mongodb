package aac.com.springmongodb.resource;

import aac.com.springmongodb.model.UserProduct;
import aac.com.springmongodb.repository.UserProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserProductController {

	@Autowired
	private UserProductRepository repository;

	@PostMapping("/addUserProduct")
	public String saveUserProduct(@RequestBody UserProduct userProduct) {
		repository.save(userProduct);
		return "User Product with id : " + userProduct.getId();
	}

	@GetMapping("/findAllUserProducts")
	public List<UserProduct> getUserProducts() {
		return repository.findAll();
	}

	@GetMapping("/findAllUserProduct/{id}")
	public Optional<UserProduct> getUserProduct(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "User Product deleted with id : " + id;
	}

}
