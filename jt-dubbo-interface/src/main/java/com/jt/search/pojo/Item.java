package com.jt.search.pojo;

import org.apache.solr.client.solrj.beans.Field;

import com.jt.common.po.BasePojo;

public class Item extends BasePojo {
	@Field("id")
	private Long id;
	@Field("title")
	private String title;

	@Field("sellPoint")
	private String sellPoint;
	@Field("price")
	private Long price;
	@Field("image")
	private String images;

	public String[] getImages() {
		return images.split(",");
	}
}
	