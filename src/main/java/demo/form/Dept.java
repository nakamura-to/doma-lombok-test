package demo.form;

import lombok.Data;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

@Data
@Entity(naming = NamingType.SNAKE_LOWER_CASE)
public class Dept {

	@Id
	public String deptNo;

	public String deptNm;
}