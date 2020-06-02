package com.hnd.hotel.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Customer implements Serializable {
	private String gid;
	private String gname;
	private Integer sex;
	private String gphone;
	private Date bookDate;
	private Date outDate;
	private BigDecimal gcost;
	private Integer isDeposit;
	private Integer rid;
	
}
