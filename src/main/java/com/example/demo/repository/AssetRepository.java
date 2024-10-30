package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Asset;

@Repository("assetrepo")
public interface AssetRepository extends JpaRepository<Asset, Integer> {

	@Query("UPDATE Asset a SET a.asset_name=:assetname,a.asset_type_id=:asset_type_id WHERE a.asset_id=:asset_id")
	@Modifying
	@Transactional
	public int updateAsset(String assetname,int asset_type_id,int asset_id);
}
