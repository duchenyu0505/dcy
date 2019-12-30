package com.dcy.entity;

public class Goods {
	
		private Integer id;
		private String name;
		private String datea;
		private Integer tid;
		private Double price;
		private int status;
		private Type type;
		private Brand brand;
		
		public Type getType() {
			return type;
		}
		public void setType(Type type) {
			this.type = type;
		}
		public Brand getBrand() {
			return brand;
		}
		public void setBrand(Brand brand) {
			this.brand = brand;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDatea() {
			return datea;
		}
		public void setDatea(String datea) {
			this.datea = datea;
		}
		public Integer getTid() {
			return tid;
		}
		public void setTid(Integer tid) {
			this.tid = tid;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		
		public Goods(Integer id, String name, String datea, Integer tid, Double price, int status, Type type,
				Brand brand) {
			super();
			this.id = id;
			this.name = name;
			this.datea = datea;
			this.tid = tid;
			this.price = price;
			this.status = status;
			this.type = type;
			this.brand = brand;
		}
		
		
		public Goods(Integer id, String name, String datea, Integer tid, Double price, int status) {
			super();
			this.id = id;
			this.name = name;
			this.datea = datea;
			this.tid = tid;
			this.price = price;
			this.status = status;
		}
		public Goods() {
			super();
		}
		@Override
		public String toString() {
			return "Goods [id=" + id + ", name=" + name + ", datea=" + datea + ", tid=" + tid + ", price=" + price
					+ ", status=" + status + ", type=" + type + ", brand=" + brand + "]";
		}
		
		
}
