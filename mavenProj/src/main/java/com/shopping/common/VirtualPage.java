package com.shopping.common;

import java.util.ArrayList;

public class VirtualPage {

	private int pageNum;		//��ǰ�ǵ�xҳ
	private int pageSize;		//��ǰҳ�������x������
	private int size;			//��ǰҳ��x������
	private String orderBy;		//����ʽ
	private int startRow;		//��ǰҳ��Ӳ�ѯ����ĵ�x�п�ʼ
	private int endRow;			//��ǰҳ��Ľ�β�ǲ�ѯ����ĵ�x��
	private int total;			//��ѯ���������
	private int pages;			//��ҳ�� = total / pageSize + 1
	private ArrayList<UserTable> list;
	private int firstPage;				//��ҳ�ı��
	private int prePage;				//ǰһҳ�ı��
	private int nextPage;				//��һҳ�ı��
	private int lastPage;				//βҳ�ı��
	private boolean isFirstPage;		//�Ƿ��ǵ�һҳ
	private boolean isLastPage;			//�Ƿ������һҳ
	private boolean hasPreviousPage;	//�Ƿ���ǰһҳ
	private boolean hasNextPage;		//�Ƿ��к�һҳ
	private int navigatePages;			//�������������ڵ�ҳ��
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public ArrayList<UserTable> getList() {
		return list;
	}

	public void setList(ArrayList<UserTable> list) {
		this.list = list;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getPrePage() {
		return prePage;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public boolean isFirstPage() {
		return isFirstPage;
	}

	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public boolean isLastPage() {
		return isLastPage;
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public int getNavigatePages() {
		return navigatePages;
	}

	public void setNavigatePages(int navigatePages) {
		this.navigatePages = navigatePages;
	}

	public ArrayList<Integer> getNavigatepageNums() {
		return navigatepageNums;
	}

	public void setNavigatepageNums(ArrayList<Integer> navigatepageNums) {
		this.navigatepageNums = navigatepageNums;
	}

	private ArrayList<Integer> navigatepageNums;
		
	public VirtualPage() {}

}
