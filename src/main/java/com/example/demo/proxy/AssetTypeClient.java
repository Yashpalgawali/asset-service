package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.AssetType;

@FeignClient(name="asset-type-service" ,url="localhost:8183")
public interface AssetTypeClient {

	@GetMapping("/assettype/{id}")
	public AssetType getAssetTypeById(@PathVariable Integer id) ;
}
