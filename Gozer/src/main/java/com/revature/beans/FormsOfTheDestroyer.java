package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ENDOFTHEWORLD")
public class FormsOfTheDestroyer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.Auto, generator="destroyerSequence")
	@SequenceGenerator(allocationSize=1000, name="destroyerSequence", sequenceName="ENDOFTHEWORLD_PK")
	@Column(name="DESTROYER_ID", nullable=false)
	private int id;
	@Column(name="DESTROYER_NAME")
	private String destroyer;
	
	
	
	public FormsOfTheDestroyer() {
		super();
		// TODO Auto-generated constructor stub
	}



	private FormsOfTheDestroyer(String destroyer) {
		super();
		this.destroyer = destroyer;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDestroyer() {
		return destroyer;
	}



	public void setDestroyer(String destroyer) {
		this.destroyer = destroyer;
	}



	@Override
	public String toString() {
		return "FormsOfTheDestroyer [id=" + id + ", destroyer=" + destroyer + "]";
	}
	
	
}
