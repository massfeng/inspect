package com.inspect.dao;

/**
 * 
 * @ClassName: IMessage
 * @Description: ���ݲ�Message�Ĳ����ӿ�
 * @author: xtf
 * @date: 2019��1��21��
 *
 */
public interface IMessageDAO {
 	Void addMessge(Message message);//�����Ϣ
	 List<Message> findByReceiveId(int receiveId);//��ѯδ����Ϣ
	 Void deleteMessage(int id);//ɾ����Ϣ
}
