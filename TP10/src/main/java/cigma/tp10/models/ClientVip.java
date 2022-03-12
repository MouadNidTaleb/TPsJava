package cigma.tp10.models;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


@Data
@Entity
@PrimaryKeyJoinColumn(name = "vip_id")
public class ClientVip extends Client {
	
	private String preferences;

	public ClientVip() {
		
	}

	public ClientVip(String name, String preferences) {
		super(name);
		this.preferences = preferences;
	}
}