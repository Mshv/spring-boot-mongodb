package aac.com.springmongodb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "UserProduct")
public class UserProduct  {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String product;
	private String description;
	private String price;
}
