package com.xiangkai.cfms.common;

import java.math.BigDecimal;

public interface Constant {

	String PAGE_SIZE = "pageSize";//分页跨度参数名

	String PAGE_NUM = "pageNum";//分页当前页码参数名

	String PAGE_SIZE_VALUE = "20";//分页跨度参数默认值

	String PAGE_NUM_VALUE = "1";//分页当前页码参数值

	public static final Integer  MONTHDAY  = 30;  //每月天数

	public static final BigDecimal  MONTHWEEK  = new BigDecimal(4.5);  //每月周数


	String EMPLOYEE_LEVEL = "employeeLevel";

	String EMPLOYEES_ID = "employeesId";

	String ORG_ID = "orgId";

	String SCHEDULED_LOCK_KEY = "task_key";

	String SCHEDULED_LOCK_VALUE = "task_value";

	/**
	 * config
	 */
	String DEFAULT_PASSWORD = "COF_DEFAULT_PASSWORD";
	String LEAD_TIME = "ADVANCED_COMPLETION_TIME";

	String BILLS_KEY = "bills_key";

	String BILLS_VALUE = "bills_value";

	String CONTRACT_PRICE_KEY = "contract_price_key";

	String CONTRACT_PRICE_VALUE = "contract_price_value";

	String NEXT_PRICE_KEY = "next_price_key";

	String NEXT_PRICE_VALUE = "next_price_value";
}
