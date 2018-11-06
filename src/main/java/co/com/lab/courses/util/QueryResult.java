package co.com.lab.courses.util;

import java.util.List;

public class QueryResult {

	private int totalRecords;
	private List<Object> list;
	
	/*
	 * Constructors
	 */
	public QueryResult(int totalRecords, List<Object> list) {
		this.totalRecords = totalRecords;
		this.list = list;
	}
	
	/*
	 * Getters and Setters
	*/
	public int getTotalRecords() {
		return totalRecords;
	}
	
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	public List<Object> getList() {
		return list;
	}
	
	public void setList(List<Object> list) {
		this.list = list;
	}
	
}
