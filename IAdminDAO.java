package com.inspect.dao;

/**
 * 
 * @ClassName: IAdminDAO
 * @Description: ���ݲ�Admin�Ĳ����ӿ�
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public interface IAdminDAO {
	Admin findAdmainByName(String name);//ͨ������Ա������ѯ����Ա
	Void addAdmain(Admin admain);// leave Ϊ����2
	Void changeAdmainPs(String name);//������
	List<Admin> findAllAdmain(int leave);//leave=2;��ѯ���й���Ա��
}
