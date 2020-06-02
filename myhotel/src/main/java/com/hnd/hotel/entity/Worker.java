package com.hnd.hotel.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;


@Data
public class Worker  implements Serializable {
	private String wid ;
	private String ename;
	private String job;
	private BigDecimal sal;
	private String adress;
	private Integer sex;
	private String phone;
	private String passwd;
	
	
}
