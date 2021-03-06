package com.shopping.common;

public class Const {
	
	
	
	public static final String CURRRNTSUER="current_user";
	
	
	public enum ResponseCodeEnum
	{
		NEED_LOGIN(2,"需要登陆"),
		NO_PRIVILEGE(3,"无权限操作");
		
		private int code;
		private String desc;
		private ResponseCodeEnum(int code,String desc)
		{
			this.code=code;
			this.desc=desc;
		}
		
		public int getCode() {return code;}
		public void setCode(int code) {this.code=code;}
		public String getDesc() {return desc;}
		public void setDesc(String  desc) {this.desc=desc;}
		
	}
	public enum RoleEnum
	{
		ROLE_ADMIN(0,"管理员"),
		ROLE_CUSTOMER(1,"普通用户");
		private int code;
		private String desc;
		private RoleEnum(int code,String desc)
		{
			this.code=code;
			this.desc=desc;
			
			
		}
		public int getCode() {return code;}
		public void setCode(int code) {this.code=code;}
		public String getDesc() {return desc;}
		public void setDesc(String  desc) {this.desc=desc;}
		
	}
	public enum GoodsStatusEnum
	{
		GOODS_ONLINE(1,"在售"),
		GOODS_OFFLINE(2,"下架"),
		GOODS_DELETE(3,"删除");
		private int code;
		private String desc;
		private GoodsStatusEnum(int code,String desc)
		{
			this.code=code;
			this.desc=desc;
			
			
		}
		public int getCode() {return code;}
		public void setCode(int code) {this.code=code;}
		public String getDesc() {return desc;}
		public void setDesc(String  desc) {this.desc=desc;}
		
	}
}

