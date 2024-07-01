package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_role", uniqueConstraints = @UniqueConstraint(columnNames = { "nameRole", "idUserRole" }))
public class UserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUserRole;
	@Column(name = "nameRole", nullable = false, length = 45)
	private String nameRole;

	public UserRole(int idUserRole, String nameRole) {
		super();
		this.idUserRole = idUserRole;
		this.nameRole = nameRole;
	}

}