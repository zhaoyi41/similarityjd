package com.jt.search.service;

import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;

import com.jt.search.pojo.Item;
import com.jt.search.service.SearchService;

public class SearchServiceImpl implements SearchService {

	@Autowired
	HttpSolrClient httpSolrClient;

	public List<Item> findItemByKey(String key) {

		try {
			SolrQuery query = new SolrQuery(key);
			query.setStart(0);// ����һ�п�ʼȡ����
			query.setRows(20);// ȡ20�С�
			QueryResponse response = httpSolrClient.query(query);
			// httpSolrClient.query(query);
			List<Item> itemList = response.getBeans(Item.class);

			return itemList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}