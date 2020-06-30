package com.shopping.dao;

import java.util.List;

import com.shopping.common.Category;
import com.shopping.common.CategoryTree;

public interface ICategoryDao {
	//���ݸ��������������
	public   List<Category>findChildCategory(Integer categoryId);
	
	public Category selectByPrimaryKey(Integer categoryId);
	
	//������
	public   boolean insertCategory(Category category);
	//�޸�Ʒ������
	public boolean updateCategoryName(int categoryId, String categoryName);
	//ɾ�����
	public boolean deleteCategoryName(int categoryId);
	
	//����Ʒ����
	public List<CategoryTree> makeCategoryTree(Integer categoryId);
}
