package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Asset;
import com.example.demo.models.AssetDTO;
import com.example.demo.service.AssetService;

@RestController
@RequestMapping("asset")
public class AssetController {

	private AssetService assetserv;

	public AssetController(AssetService assetserv) {
		super();
		this.assetserv = assetserv;
	}
	
	@PostMapping("/")
	public Asset saveAsset(@RequestBody Asset asset) {
		
		Asset ast = assetserv.saveAsset(asset);
		if(ast!=null)
		{
			return ast;
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/")
	public List<AssetDTO> getAllAssets() {
		List<AssetDTO> assetlist = assetserv.getAllAssets();
		if(assetlist.size()>0) {
			return assetlist;
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/{id}")
	public AssetDTO getAssetById(@PathVariable int id) {
		AssetDTO asset = assetserv.getAssetById(id);
		if(asset!=null) {
			return asset;
		}
		else {
			return null;
		}
	}
	
	
	@PutMapping("/")
	public int updateAsset(@RequestBody Asset asset) {
		
		int res = assetserv.updateAsset(asset);
		if(res>0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
