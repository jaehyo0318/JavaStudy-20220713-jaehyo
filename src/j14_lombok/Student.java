package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data // 위에 4개 합친거
public class Student {
	private int studentCode;
	private String name;
	private int studentYear;
	private int age;
}
