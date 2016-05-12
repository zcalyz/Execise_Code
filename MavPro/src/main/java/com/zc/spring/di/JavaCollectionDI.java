package com.zc.spring.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class JavaCollectionDI {
	private List<String> addressList;
	
	private Set<Integer> addressSet;
	
	private Map<Integer, String> addressMap;
	
	private Properties pro;

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Set<Integer> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<Integer> addressSet) {
		this.addressSet = addressSet;
	}

	public Map<Integer, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<Integer, String> addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}
	
}
