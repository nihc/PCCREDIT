/*
 * Copyright 2013 Wicresoft, Inc. All rights reserved.
 */

package com.cardpay.pccredit.xm_appln.model;

import com.wicresoft.jrad.base.database.model.ModelParam;
import com.wicresoft.jrad.base.database.model.BusinessModel;

/**
 * Description of xm_appln_sped
 * 
 * @author 谭文华
 * 
 * @created on Dec 26, 2013
 * 
 * @version $Id: xm_appln_sped.java 1650 2014-10-09 14:55:25Z 谭文华 $
 */
@ModelParam(table = "xm_appln_sped")
public class XM_APPLN_SPED extends BusinessModel {

	private static final long serialVersionUID = 1L;

	private String customer_id;
	private String current_process;
	private String before_status;
	private String current_status;
	private String cred_limit;
	private String mp_limit;
	private String credlim_x;
	private String ca_pcnt;
	private String callmt;
	
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCurrent_process() {
		return current_process;
	}
	public void setCurrent_process(String current_process) {
		this.current_process = current_process;
	}
	public String getBefore_status() {
		return before_status;
	}
	public void setBefore_status(String before_status) {
		this.before_status = before_status;
	}
	public String getCurrent_status() {
		return current_status;
	}
	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}
	public String getCred_limit() {
		return cred_limit;
	}
	public void setCred_limit(String cred_limit) {
		this.cred_limit = cred_limit;
	}
	public String getMp_limit() {
		return mp_limit;
	}
	public void setMp_limit(String mp_limit) {
		this.mp_limit = mp_limit;
	}
	public String getCredlim_x() {
		return credlim_x;
	}
	public void setCredlim_x(String credlim_x) {
		this.credlim_x = credlim_x;
	}
	public String getCa_pcnt() {
		return ca_pcnt;
	}
	public void setCa_pcnt(String ca_pcnt) {
		this.ca_pcnt = ca_pcnt;
	}
	public String getCallmt() {
		return callmt;
	}
	public void setCallmt(String callmt) {
		this.callmt = callmt;
	}
	
}
