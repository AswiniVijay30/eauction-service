package com.cts.prod.management.repository;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.prod.management.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
//	@Modifying
	@Transactional
//	@Query(value = "DELETE FROM product WHERE product_id = :productId", nativeQuery = true)
	void deleteByProductId(Integer productId);

	Product findAllByProductId(Integer productId);
	
	Date findBidEndDateByProductId(Integer productId);
	
	@Query(value="SELECT product_name from product ORDER BY product_name",nativeQuery=true)
	List<String> findProducts();
	
	@Query(value="SELECT product_id,product_name from product ORDER BY product_name",nativeQuery=true)
	List<Object> findAllProducts();
}