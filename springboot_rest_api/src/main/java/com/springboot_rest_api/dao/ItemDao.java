package com.springboot_rest_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_rest_api.entity.PurchaseOrderLineItem;

@Repository
public interface ItemDao extends JpaRepository<PurchaseOrderLineItem, Long>

{

}
