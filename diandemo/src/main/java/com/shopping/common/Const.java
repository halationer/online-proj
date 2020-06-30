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
	public  enum PaymentEnum{

        ONLINE(1,"线上支付")
        ;
        private  int  code;
        private String desc;
        private PaymentEnum(int code,String desc){
            this.code=code;
            this.desc=desc;
        }

        public  static  PaymentEnum codeOf(Integer code){
            for(PaymentEnum paymentEnum: values()){
                if(code==paymentEnum.getCode()){
                    return  paymentEnum;
                }
            }
            return  null;
        }


        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
	
	
	 public  enum OrderStatusEnum{

	        ORDER_CANCELED(0,"已取消"),
	        ORDER_UN_PAY(10,"未付款"),
	        ORDER_PAYED(20,"已付款"),
	        ORDER_SEND(40,"已发货"),
	        ORDER_SUCCESS(50,"交易成功"),
	        ORDER_CLOSED(60,"交易关闭")
	        ;
	        private  int  code;
	        private String desc;
	        private OrderStatusEnum(int code,String desc){
	            this.code=code;
	            this.desc=desc;
	        }

	        public int getCode() {
	            return code;
	        }

	        public void setCode(int code) {
	            this.code = code;
	        }

	        public String getDesc() {
	            return desc;
	        }

	        public void setDesc(String desc) {
	            this.desc = desc;
	        }


	        public  static  OrderStatusEnum codeOf(Integer code){
	            for(OrderStatusEnum orderStatusEnum: values()){
	                if(code==orderStatusEnum.getCode()){
	                    return  orderStatusEnum;
	                }
	            }
	            return  null;
	        }


	    }
	 
	 
	 public  enum ProductStatusEnum{

         PRODUCT_ONLINE(1,"在售"),
        PRODUCT_OFFLINE(2,"下架"),
        PRODUCT_DELETE(3,"删除")
        ;
        private  int  code;
        private String desc;
        private ProductStatusEnum(int code,String desc){
            this.code=code;
            this.desc=desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
	 
	 
	 public  enum  CartCheckedEnum{

	        PRODUCT_CHECKED(1,"已勾选"),
	        PRODUCT_UNCHECKED(0,"未勾选")
	        ;

	        private  int  code;
	        private String desc;
	        private CartCheckedEnum(int code,String desc){
	            this.code=code;
	            this.desc=desc;
	        }

	        public int getCode() {
	            return code;
	        }

	        public void setCode(int code) {
	            this.code = code;
	        }

	        public String getDesc() {
	            return desc;
	        }

	        public void setDesc(String desc) {
	            this.desc = desc;
	        }
	    }


}

