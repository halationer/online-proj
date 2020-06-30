package com.shopping.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.google.gson.Gson;
import com.shopping.common.Const;
import com.shopping.common.Goods;
import com.shopping.common.ServerResponse;
import com.shopping.common.UserInfo;
import com.shopping.common.UserTable;
import com.shopping.service.IGoodsService;
import com.shopping.service.impl.GoodsServiceImpl;

/*import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;*/

@WebServlet("/manage/goods")

public class GoodsServletM extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		if(type.equals("save")) 
		{
			saveOrUpdate(request, response);
		}
		else if(type.equals("set_sale_status")) 
		{
			set_sale_status(request, response);
		}
		else if(type.equals("detail")) 
		{
			detail(request, response);
		}
		else if(type.equals("list")) 
		{
			list(request, response);
		}
		else if(type.equals("search")) 
		{
			search(request, response);
		}
		else if(type.equals("upload")) 
		{
			upload(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	//���»������Ʒ��Ϣ
	public void saveOrUpdate(HttpServletRequest request, HttpServletResponse response)
	{
		IGoodsService goodsService=new GoodsServiceImpl();
		ServerResponse se;
		Goods goods;
		//�������ݿ�
		boolean onlog = false, access = false;
		HttpSession session = request.getSession();
		Object admin = session.getAttribute("admin");
		UserTable adminObject;
		if(admin != null) {
			onlog = true;
			adminObject = new Gson().fromJson((String)admin, UserTable.class);
			if(adminObject.getRole() == 0)
				access = true;
		}
		String id=request.getParameter("id");
		int category_id =Integer.parseInt(request.getParameter("categoryId"));
		String name = request.getParameter("name");
		String subtile = request.getParameter("subtitle");
		String main_image = request.getParameter("mainImage");
		String sub_image = request.getParameter("subImage");
		String detail = request.getParameter("detail");
		BigDecimal price =new BigDecimal(request.getParameter("price"));
		int status = Integer.parseInt(request.getParameter("status")) ;
		int stock = Integer.parseInt(request.getParameter("stock")) ;
		if (id==null||id.equals("")) {
			goods=new Goods(category_id,name,subtile,main_image,sub_image,detail,price,stock,status);
		}
		else
		{
			Integer Id=Integer.parseInt(id);
			goods=new Goods(Id,category_id,name,subtile,main_image,sub_image,detail,price,stock,status, null, null);
		}
		
		if (!onlog) 
		{
			se= ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NEED_LOGIN.getCode(),Const.ResponseCodeEnum.NEED_LOGIN.getDesc());
		}
		else if (!access) 
		{
			se=ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NO_PRIVILEGE.getCode(),Const.ResponseCodeEnum.NO_PRIVILEGE.getDesc());
		}
		else
		{
			se=goodsService.saveOrUpdateLogic(goods);
		}
		Gson gson=new Gson();
		String json=gson.toJson(se);
		PrintWriter pw;
		try {
			
			pw = response.getWriter();
			pw.write(json);
			pw.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	//ɾ����Ʒ��Ϣ
	public void set_sale_status(HttpServletRequest request, HttpServletResponse response)
	{
		IGoodsService goodsService=new GoodsServiceImpl();
		ServerResponse se;
		//�������ݿ�
		boolean onlog = false, access = false;
		HttpSession session = request.getSession();
		Object admin = session.getAttribute("admin");
		UserTable adminObject;
		if(admin != null) {
			onlog = true;
			adminObject = new Gson().fromJson((String)admin, UserTable.class);
			if(adminObject.getRole() == 0)
				access = true;
		}
		int id =Integer.parseInt( request.getParameter("id"));
		int status = Integer.parseInt(  request.getParameter("status")) ;
		if (!onlog) 
		{
			se= ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NEED_LOGIN.getCode(),Const.ResponseCodeEnum.NEED_LOGIN.getDesc());
			
		}
		else if (!access) 
		{
			se=ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NO_PRIVILEGE.getCode(),Const.ResponseCodeEnum.NO_PRIVILEGE.getDesc());
		}
		else
		{
			se=goodsService.set_sale_statusLogic(id,status);
		}
		Gson gson=new Gson();
		String json=gson.toJson(se);
		PrintWriter pw;
		try {
			
			pw = response.getWriter();
			pw.write(json);
			pw.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	//��ȡ��Ʒȫ����Ϣ
	public void detail(HttpServletRequest request, HttpServletResponse response)
	{
		IGoodsService goodsService=new GoodsServiceImpl();
		ServerResponse se;
		//�������ݿ�
		boolean onlog = false, access = false;
		HttpSession session = request.getSession();
		Object admin = session.getAttribute("admin");
		UserTable adminObject;
		if(admin != null) {
			onlog = true;
			adminObject = new Gson().fromJson((String)admin, UserTable.class);
			if(adminObject.getRole() == 0)
				access = true;
		}
		int id =Integer.parseInt( request.getParameter("id"));
		if (!onlog) 
		{
			se= ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NEED_LOGIN.getCode(),Const.ResponseCodeEnum.NEED_LOGIN.getDesc());
			
		}
		else if (!access) 
		{
			se=ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NO_PRIVILEGE.getCode(),Const.ResponseCodeEnum.NO_PRIVILEGE.getDesc());
		}
		else
		{
			se=goodsService.detailLogic(id);
		}
		Gson gson=new Gson();
		String json=gson.toJson(se);
		PrintWriter pw;
		try {
			
			pw = response.getWriter();
			pw.write(json);
			pw.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	//��Ѱ
	public void search(HttpServletRequest request, HttpServletResponse response)
	{
		IGoodsService goodsService=new GoodsServiceImpl();
		ServerResponse se;
		int productId;
		//�������ݿ�
		boolean onlog = false, access = false;
		HttpSession session = request.getSession();
		Object admin = session.getAttribute("admin");
		UserTable adminObject;
		if(admin != null) {
			onlog = true;
			adminObject = new Gson().fromJson((String)admin, UserTable.class);
			if(adminObject.getRole() == 0)
				access = true;
		}
		String productName=request.getParameter("productName");
		String productid = request.getParameter("productId");
		if (productid==null || productid.equals("")) {
			productId=0;
		}
		else
		{
			productId=Integer.parseInt(productid);
		}
		int pageNum =Integer.parseInt( request.getParameter("pageNum"));
		int pageSize =Integer.parseInt( request.getParameter("pageSize"));
		if (!onlog) 
		{
			se= ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NEED_LOGIN.getCode(),Const.ResponseCodeEnum.NEED_LOGIN.getDesc());
			
		}
		else if (!access) 
		{
			se=ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NO_PRIVILEGE.getCode(),Const.ResponseCodeEnum.NO_PRIVILEGE.getDesc());
		}
		else
		{
			se=goodsService.mSearchLogic(productId,productName,pageNum,pageSize);
		}
		Gson gson=new Gson();
		String json=gson.toJson(se);
		PrintWriter pw;
		try {
			
			pw = response.getWriter();
			pw.write(json);
			pw.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
    public void list(HttpServletRequest request, HttpServletResponse response)
	{
		IGoodsService goodsService=new GoodsServiceImpl();
		ServerResponse se;
		
		String pageSize = request.getParameter("pageSize");
		String pageNum = request.getParameter("pageNum");
		int pagesize = pageSize==null ? 10 : Integer.parseInt(pageSize);
		int pagenum = pageNum==null ? 1 : Integer.parseInt(pageNum);
		
		//�������ݿ�
		boolean onlog = false, access = false;
		HttpSession session = request.getSession();
		Object admin = session.getAttribute("admin");
		UserTable adminObject;
		if(admin != null) {
			onlog = true;
			adminObject = new Gson().fromJson((String)admin, UserTable.class);
			if(adminObject.getRole() == 0)
				access = true;
		}
		
		se=goodsService.mListLogic(pagenum,pagesize);
		
		Gson gson=new Gson();
		String json=gson.toJson(se);
		PrintWriter pw;
		try {
			
			pw = response.getWriter();
			pw.write(json);
			pw.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
    public void upload(HttpServletRequest request, HttpServletResponse response)
  	{
    	System.out.println("upload file");
  		IGoodsService goodsService=new GoodsServiceImpl();
  		ServerResponse se;
  		String path="D:\\WebUploadImages";
  		MultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        MultipartHttpServletRequest multipartRequest = resolver.resolveMultipart(request);
        MultipartFile multipartFile = multipartRequest.getFile("upload_file");
        //�������ݿ�
  		boolean onlog = false, access = false;
  		HttpSession session = request.getSession();
  		Object admin = session.getAttribute("admin");
  		UserTable adminObject;
  		if(admin != null) {
  			onlog = true;
  			adminObject = new Gson().fromJson((String)admin, UserTable.class);
  			if(adminObject.getRole() == 0)
  				access = true;
  		}
  		if (!onlog) 
  		{
  			se= ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NEED_LOGIN.getCode(),Const.ResponseCodeEnum.NEED_LOGIN.getDesc());
  			
  		}
  		else if (!access) 
  		{
  			se=ServerResponse.serverResponseByError(Const.ResponseCodeEnum.NO_PRIVILEGE.getCode(),Const.ResponseCodeEnum.NO_PRIVILEGE.getDesc());
  		}
  		else
  		{
  			se=goodsService.uploadLogic(multipartFile,path);
  		}
  		Gson gson=new Gson();
  		String json=gson.toJson(se);
  		PrintWriter pw;
  		try {
  			
  			pw = response.getWriter();
  			pw.write(json);
  			pw.close();
  			
  		} catch (IOException e) {
  		
  			e.printStackTrace();
  		}
  	}

}


