package com.example.demo.models;

public class AssetDTO {

	private Integer asset_id;
	
	private String asset_name;
	
	private Integer asset_type_id;
	
	private String asset_type;

	public Integer getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(Integer asset_id) {
		this.asset_id = asset_id;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public Integer getAsset_type_id() {
		return asset_type_id;
	}

	public void setAsset_type_id(Integer asset_type_id) {
		this.asset_type_id = asset_type_id;
	}

	public String getAsset_type() {
		return asset_type;
	}

	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}

	public AssetDTO(Integer asset_id, String asset_name, Integer asset_type_id, String asset_type) {
		super();
		this.asset_id = asset_id;
		this.asset_name = asset_name;
		this.asset_type_id = asset_type_id;
		this.asset_type = asset_type;
	}

	public AssetDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AssetDTO [asset_id=" + asset_id + ", asset_name=" + asset_name + ", asset_type_id=" + asset_type_id
				+ ", asset_type=" + asset_type + "]";
	}
	
}
