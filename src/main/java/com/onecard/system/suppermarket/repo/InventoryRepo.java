package com.onecard.system.suppermarket.repo;

import com.onecard.system.suppermarket.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InventoryRepo extends JpaRepository<Inventory, Integer>, JpaSpecificationExecutor<Inventory> {
}
