package com.inspect.dao;

/**
 * 
 * @ClassName: IMessage
 * @Description: 数据层Message的操作接口
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public interface IMessageDAO {
 	Void addMessge(Message message);//添加消息
	 List<Message> findByReceiveId(int receiveId);//查询未读消息
	 Void deleteMessage(int id);//删除消息
}
