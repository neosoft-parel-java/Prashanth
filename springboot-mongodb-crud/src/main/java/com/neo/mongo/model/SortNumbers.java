package com.neo.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("SortNumbers")
public class SortNumbers {
	@Id
	private String id;
	private int _1_10;
	private int _11_20;
	private int _21_30;
	private int _31_40;
	private int _41_50;
	private int _51_60;
	private int _61_70;
	private int _71_80;
	private int _81_90;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int get_1_10() {
		return _1_10;
	}
	public void set_1_10(int _1_10) {
		this._1_10 = _1_10;
	}
	public int get_11_20() {
		return _11_20;
	}
	public void set_11_20(int _11_20) {
		this._11_20 = _11_20;
	}
	public int get_21_30() {
		return _21_30;
	}
	public void set_21_30(int _21_30) {
		this._21_30 = _21_30;
	}
	public int get_31_40() {
		return _31_40;
	}
	public void set_31_40(int _31_40) {
		this._31_40 = _31_40;
	}
	public int get_41_50() {
		return _41_50;
	}
	public void set_41_50(int _41_50) {
		this._41_50 = _41_50;
	}
	public int get_51_60() {
		return _51_60;
	}
	public void set_51_60(int _51_60) {
		this._51_60 = _51_60;
	}
	public int get_61_70() {
		return _61_70;
	}
	public void set_61_70(int _61_70) {
		this._61_70 = _61_70;
	}
	public int get_71_80() {
		return _71_80;
	}
	public void set_71_80(int _71_80) {
		this._71_80 = _71_80;
	}
	public int get_81_90() {
		return _81_90;
	}
	public void set_81_90(int _81_90) {
		this._81_90 = _81_90;
	}

}
