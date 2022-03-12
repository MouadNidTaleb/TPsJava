package cigma.tp10.models;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;

	public Client(String name) {
		this.name = name;
	}

	public Client() {
	}
}