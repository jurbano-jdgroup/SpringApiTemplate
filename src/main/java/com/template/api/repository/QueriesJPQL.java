package com.template.api.repository;

public class QueriesJPQL {
	private QueriesJPQL() {}
	
	public static final String FIND_PURCHASE_BY_ID = 
			"SELECT new com.template.api.entity.Purchase("
			+ " t.id, user, item, t.creationDate, t.updateDate)"
			+ " FROM Purchase as t "
			+ " INNER JOIN User AS user ON t.user = user.id"
			+ " INNER JOIN Item AS item ON t.item = item.id"
			+ " WHERE t.id = :id";
}