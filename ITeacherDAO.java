package com.inspect.dao;

/**
 * 
 * @ClassName: ITeacherDAO
 * @Description: ���ݲ�Teacher�Ĳ����ӿ�
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public interface ITeacherDAO {
	Void addTeacher(Teacher teacher);//�����ʦ
	Void addTeacherEmail(int number , String Email);//�����ʦ��email
	Void deleteTeacher(int number);//ɾ����ʦ
	Void changeTeacherPassword(int number, String password);//ͨ������������ʦ�޸���Ϣ
	List<Teacher> findAllTeacher();//��ѯ������ʦ
	Teacher findTeacherByNumber(int number);//ͨ����ʦ���Ų�ѯ
}
