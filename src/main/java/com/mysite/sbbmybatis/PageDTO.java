package com.mysite.sbbmybatis;

import java.util.List;

public class PageDTO {
	int page;
	int size;
	public PageDTO(int page2, int size2, int totalPages, int totalElements, List<Message> content) {
		// TODO Auto-generated constructor stub
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
