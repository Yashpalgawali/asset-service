package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Asset;
import com.example.demo.models.AssetDTO;

public interface AssetService {

	public Asset saveAsset(Asset asset);
	
	public List<AssetDTO> getAllAssets();
	
	public AssetDTO getAssetById(int id);
	
	public int updateAsset(Asset asset);
}
