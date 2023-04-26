package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {
	
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	private int userId;
		
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	private int goodsId;
	
	public int getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	private String goodsName;
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	private int itemCount;
	
	public int getItemCount() {
		return itemCount;
	}
		
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	private int total;
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}

	private Timestamp createdAt;
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}


}
