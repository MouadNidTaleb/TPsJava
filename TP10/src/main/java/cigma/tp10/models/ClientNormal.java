package cigma.tp10.models;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "normal_id")
public class ClientNormal extends Client {
	private int importanceLevel;

	public ClientNormal() {
		
	}

	public ClientNormal(String name, int importanceLevel) {
		super(name);
		this.importanceLevel = importanceLevel;
	}
}