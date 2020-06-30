package com.shopping.vo;

import com.shopping.common.Shipping;
import com.shopping.common.UserTable;
import com.shopping.common.VirtualPage;

public class OrderDetailListVO {

	//������Ϣ
	private OrderListVO orderlist;
	
	//�����û�
	private UserTable usertable;
    
    //��Ʒ�б�
    private VirtualPage<DetailVO> orderitemvolist;
    
    //�ջ���ַ
    private Shipping shipping;
	
	public OrderDetailListVO() { }

	public OrderListVO getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(OrderListVO orderlist) {
		this.orderlist = orderlist;
	}

	public UserTable getUsertable() {
		return usertable;
	}

	public void setUsertable(UserTable usertable) {
		this.usertable = usertable;
	}

	public VirtualPage<DetailVO> getOrderitemvolist() {
		return orderitemvolist;
	}

	public void setOrderitemvolist(VirtualPage<DetailVO> orderitemvolist) {
		this.orderitemvolist = orderitemvolist;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
}
