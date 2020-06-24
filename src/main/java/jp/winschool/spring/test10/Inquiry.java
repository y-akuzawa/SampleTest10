package jp.winschool.spring.test10;

import lombok.Data;


@Data
public class Inquiry {
	
	private Integer id;
	private String name;
	private String mail;
	private Integer age;
	private String gender;
	private String contents;   

}
