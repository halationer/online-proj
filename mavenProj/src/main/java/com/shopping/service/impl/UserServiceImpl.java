package com.shopping.service.impl;

import java.util.List;
import com.shopping.common.ServerResponse;
import com.shopping.common.UserInfo;
import com.shopping.common.UserTable;
import com.shopping.dao.IUserServiceDao;
import com.shopping.dao.impl.UserServiceDaoImpl;
import com.shopping.service.IUserService;

public class UserServiceImpl implements IUserService {
	
	private static IUserServiceDao userDao = new UserServiceDaoImpl();
	
	public ServerResponse loginLogic(String username, String password) {
		if(username==null||username.equals(""))
		{
			return ServerResponse.serverResponseByError("�û�������Ϊ��");
		}
		if(password==null||password.equals(""))
		{
			return ServerResponse.serverResponseByError("���벻��Ϊ��");
		}
		boolean result = userDao.checkUsername(username);
		if(!result)
		{
			return ServerResponse.serverResponseByError("�û���������");
		}
		return ServerResponse.serverResponseBySuccess("��¼�ɹ�");
	
	}
//	public ServerResponse registerLogic(UserInfo userInfo) 
//	{
//		if(userInfo==null)
//		{
//			return ServerResponse.serverResponseByError("��������");
//		}
//		boolean result = userDao.checkUsername(userInfo.getUsername());
//		if(result)
//		{
//			return ServerResponse.serverResponseByError("�û����Ѵ���");
//			
//		}
//		boolean result_email = userDao.checkEmail(userInfo.getEmail());
//		if(result)
//		{
//			return ServerResponse.serverResponseByError("�����Ѵ���");
//			
//		}
//		int count = UserDao.insert(UserInfo);
//		if (count>0) {
//			return ServerResponse.serverResponseBySuccess("ע��ɹ�");
//		}
//		return ServerResponse.serverResponseBySuccess("ע��ʧ��");
//	}
//	public ServerResponse getUserInfoLogic(String username) 
//	{
//		UserInfo userInfo=userDao.selectUserInfoByUsername(username);
//		return ServerResponse.serverResponseBySuccess(userInfo);
//	}
//	public ServerResponse forget_return_questionLogic(String username) 
//	{
//		if(username==null||username.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�û�������Ϊ��");
//		}
//		int result =userDao.checkUsername(username);
//		if(result==0)
//		{
//			return ServerResponse.serverResponseByError("�û���������,����������");
//		}
//		
//		String question=userDao.selectQuestionInfoByUsername(username);
//		if (question==null||question.equals("")) {
//			return ServerResponse.serverResponseBySuccess("�ܱ������");
//			
//		}
//		return ServerResponse.serverResponseBySuccess(question);
//	}
//	public ServerResponse forget_check_answerLogic(String username, String question,String answer)
//	{
//		if(username==null||username.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�û�������Ϊ��");
//		}
//		if(question==null||question.equals(""))
//		{
//			return ServerResponse.serverResponseByError("���ⲻ��Ϊ��");
//		}
//		if(answer==null||answer.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�𰸲���Ϊ��");
//		}
//		
//		int result =userDao.selectByUsernameAndQuestionAndAnswer(username,question,answer);
//		if(result==0)
//		{
//			return ServerResponse.serverResponseByError("�𰸴���");
//		}
//		String forgetToken=UUID.randomUUID().toString();
//		
//		return ServerResponse.serverResponseBySuccess(forgetToken);
//	}
//	public ServerResponse forget_reset_passwordLogic(String username, String passwordnew)
//	{
//		if(username==null||username.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�û�������Ϊ��");
//		}
//		
//		if(passwordnew==null||passwordnew.equals(""))
//		{
//			return ServerResponse.serverResponseByError("���벻��Ϊ��");
//		}
//		
//		int result =userDao.updateUserPassword(username,passwordnew);
//		if(result==0)
//		{
//			return ServerResponse.serverResponseByError("�����޸�ʧ��");
//		}
//		
//		return ServerResponse.serverResponseBySuccess();
//	}
//	public ServerResponse forgrt_replace_password(String username, String passwordNew, String forgetToken) {
//		// TODO Auto-generated method stub
//		//return null;
//		if(username==null||username.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�û�������Ϊ��");
//		}
//		if(forgetToken==null||forgetToken.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�����벻��Ϊ��");
//		}
//		if(passwordNew==null||passwordNew.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�����벻��Ϊ��");
//		}
//		int result =userDao.checkUsername(username);
//		if(result==0)
//		{
//			return ServerResponse.serverResponseByError("�û���������");
//		}
//		return ServerResponse.serverResponseBySuccess("�����޸ĳɹ�");
//	}
//	public ServerResponse login_replace_password(String passwordOld, String passwordNew) {
//		// TODO Auto-generated method stub
//		if(passwordOld==null||passwordOld.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�����벻��Ϊ��");
//		}
//		if(passwordNew==null||passwordNew.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�����벻��Ϊ��");
//		}
//		
//		return ServerResponse.serverResponseBySuccess("�����޸ĳɹ�");
//		//return null;
//	}
//	public ServerResponse login_renew_information(String email, String phone, String question, String answer) {
//		// TODO Auto-generated method stub
//		if(email==null||email.equals(""))
//		{
//			return ServerResponse.serverResponseByError("���䲻��Ϊ��");
//		}
//		if(phone==null||phone.equals(""))
//		{
//			return ServerResponse.serverResponseByError("�绰�Ų���Ϊ��");
//		}
//		if(answer==null||answer.equals(""))
//		{
//			return ServerResponse.serverResponseByError("����𰸲���Ϊ��");
//		}
//		int email =userDao.checkUsername(email);
//		int phone =userDao.checkUsername(phone);
//		
//		if(email==0)
//		{
//			return ServerResponse.serverResponseByError("���䲻����");
//		}
//		if(phone==0)
//		{
//			return ServerResponse.serverResponseByError("�绰�Ų�����");
//		}
//		return ServerResponse.serverResponseBySuccess("��Ϣ���³ɹ�");
//		
//		//return null;
//	}
//	public ServerResponse login_force(String username) {
//		// TODO Auto-generated method stub
//		return ServerResponse.serverResponseBySuccess("��Ϣ��ȡ�ɹ�");
//		//return null;
//	}
//	public ServerResponse exit_login() {
//		// TODO Auto-generated method stub
//		return ServerResponse.serverResponseBySuccess("�ɹ��˳�");
//		//return null;
//	}
	
	public ServerResponse mLoginLogic(String username, String password)
	{
		List<UserTable> user = new UserServiceDaoImpl().checkAdmin(username, password);
		if(user.size() == 0)
		{
			System.out.println("userServiceImpl fail");
			return ServerResponse.serverResponseByError("�û��������ڻ����벻��ȷ");
		}
		else
		{
			UserTable iuser = user.get(0);
			System.out.println("userServiceImpl success id:" + iuser.getId());
			return ServerResponse.serverResponseBySuccess(iuser);
		}
	}
	
	@Override
	public ServerResponse registerLogic(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse getUserInfoLogic(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse forget_return_questionLogic(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse forget_check_answerLogic(String username, String question, String answer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse forget_reset_passwordLogic(String username, String passwordnew) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse forgrt_replace_password(String username, String passwordNew, String forgetToken) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse login_replace_password(String passwordOld, String passwordNew) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse login_renew_information(String email, String phone, String question, String answer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse login_force(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ServerResponse exit_login() {
		// TODO Auto-generated method stub
		return null;
	}
}
