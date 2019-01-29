package com.inspect.dao;

/**
 * 
 * @ClassName: ITeacherDAO
 * @Description: 数据层Teacher的操作接口
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public interface ITeacherDAO {
	Void addTeacher(Teacher teacher);//添加老师
	Void addTeacherEmail(int number , String Email);//添加老师的email
	Void deleteTeacher(int number);//删除老师
	Void changeTeacherPassword(int number, String password);//通过工号密码老师修改信息
	List<Teacher> findAllTeacher();//查询所有老师
	Teacher findTeacherByNumber(int number);//通过老师工号查询
}
