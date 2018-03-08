package model;

import java.io.Serializable;
import javax.persistence.*;

import org.eclipse.persistence.annotations.PrimaryKey;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the mypersonaldata database table.
 * 
 */

@Data
@Entity
@NamedQuery(name="Mypersonaldata.findAll", query="SELECT m FROM Mypersonaldata m")
public class Mypersonaldata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private Integer age;

	@Column(length=100)
	private String mail;

	@Column
	private String name;

	public Mypersonaldata() {
	}
	
	public Mypersonaldata(String name, String mail, int age) {
		this();
		this.name = name;
		this.mail = mail;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "MyPersonanData [id=" + id + ", name=" + name 
				+ ", mail=" + mail + ",age=" + age + "]";
	}
}