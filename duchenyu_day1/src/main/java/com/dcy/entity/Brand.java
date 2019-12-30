package com.dcy.entity;

public class Brand {
	
		private Integer pid;
		private String pname;
		private Integer id;
		public Integer getPid() {
			return pid;
		}
		public void setPid(Integer pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Brand(Integer pid, String pname, Integer id) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.id = id;
		}
		public Brand() {
			super();
		}
		@Override
		public String toString() {
			return "Brand [pid=" + pid + ", pname=" + pname + ", id=" + id + "]";
		}
		
		
}
