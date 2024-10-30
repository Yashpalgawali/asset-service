package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_asset")
@SequenceGenerator(name = "asset_seq",allocationSize = 1,initialValue = 1)
public class Asset {
	
	@Id @GeneratedValue(generator = "asset_seq",strategy = GenerationType.AUTO) 
	private Integer asset_id;
	
	private String asset_name;
	
	private Integer asset_type_id;

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

	/**
	 * @param asset_id
	 * @param asset_name
	 * @param asset_type_id
	 */
	public Asset(Integer asset_id, String asset_name, Integer asset_type_id) {
		super();
		this.asset_id = asset_id;
		this.asset_name = asset_name;
		this.asset_type_id = asset_type_id;
	}

	/**
	 * 
	 */
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Asset [asset_id=" + asset_id + ", asset_name=" + asset_name + ", asset_type_id=" + asset_type_id + "]";
	} 

	
	
	
}
