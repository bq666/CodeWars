import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesDepartment implements Department{

	private Integer id;
	private String name;

	@Override
	public void printDepartmentName() {
		System.out.println(id + " " + getClass().getSimpleName());
	}
}
