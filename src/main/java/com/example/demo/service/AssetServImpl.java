package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.models.Asset;
import com.example.demo.models.AssetDTO;
import com.example.demo.models.AssetType;
import com.example.demo.proxy.AssetTypeClient;
import com.example.demo.repository.AssetRepository;

@Service("assetserv")
public class AssetServImpl implements AssetService {

	private AssetRepository assetrepo;
	
	private AssetTypeClient atypeclient;
	
	public AssetServImpl(AssetRepository assetrepo,AssetTypeClient atypeclient) {
		super();
		this.assetrepo = assetrepo;
		this.atypeclient=atypeclient;
	}

	@Override
	public Asset saveAsset(Asset asset) {
		// TODO Auto-generated method stub
		return assetrepo.save(asset);
	}

	@Override
	public List<AssetDTO> getAllAssets() {
		
		List<Asset> assetlist = assetrepo.findAll();
		List<AssetDTO> assetdto =  assetlist.stream().map(a->{
			AssetType assetype = atypeclient.getAssetTypeById(a.getAsset_type_id());

			if(assetype==null) {
				return null;
			}
			AssetDTO adto = new AssetDTO();
			adto.setAsset_id(a.getAsset_id());
			adto.setAsset_name(a.getAsset_name());
			adto.setAsset_type_id(assetype.getAsset_type_id());
			adto.setAsset_type(assetype.getAsset_type());
			return adto;
			
			
		}).collect(Collectors.toList());
		return assetdto;
	}		 

	@Override
	public AssetDTO getAssetById(int id) {
		Optional<Asset> asset = assetrepo.findById(id);
		if(!asset.isEmpty())
		{
			Asset ast = asset.get();
			AssetType atype = atypeclient.getAssetTypeById(ast.getAsset_type_id());
			AssetDTO adto = new AssetDTO();
			adto.setAsset_id(ast.getAsset_id());
			adto.setAsset_name(ast.getAsset_name());
			adto.setAsset_type_id(atype.getAsset_type_id());
			adto.setAsset_type(atype.getAsset_type());
			return adto;
			//return atypeclient.getAssetTypeById(1);
		}
		else
		{
			return null;
		}
	}

	@Override
	public int updateAsset(Asset asset) {
		
		return assetrepo.updateAsset(asset.getAsset_name(), asset.getAsset_type_id(), asset.getAsset_id());
	}

}
