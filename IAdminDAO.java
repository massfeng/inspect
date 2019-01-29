package com.inspect.dao;

/**
 * 
 * @ClassName: IAdminDAO
 * @Description: 数据层Admin的操作接口
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public interface IAdminDAO {
	Admin findAdmainByName(String name);//通过管理员姓名查询管理员
	Void addAdmain(Admin admain);// leave 为管理2
	Void changeAdmainPs(String name);//改密码
	List<Admin> findAllAdmain(int leave);//leave=2;查询所有管理员。
}
