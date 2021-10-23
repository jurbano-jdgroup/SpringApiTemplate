package com.template.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.template.api.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

	@Query(QueriesJPQL.FIND_PURCHASE_BY_ID)
	public Purchase findPurchaseByIdAny(@Param("id") Long id);
}