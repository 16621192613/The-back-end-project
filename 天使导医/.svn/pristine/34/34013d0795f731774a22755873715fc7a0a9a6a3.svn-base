package com.hsk.xframe.api.im.api;

/**
 * This interface is created for RestAPI of Chat Room, it should be synchronized
 * with the API list.
 * 
 * @author Eric23 2016-01-05
 * @see http://docs.easemob.com/
 */
public interface ChatRoomAPI {
	/**
	 * ���������� <br>
	 * POST
	 * 
	 * @param payload
	 *            <code>{name":"testchatroom","description":"server create chatroom","maxusers":300,"owner":"jma1","members":["jma2","jma3"]}</code>
	 * @return
	 */
	Object createChatRoom(Object payload);

	/**
	 * �޸���������Ϣ <br>
	 * PUT
	 * 
	 * @param roomId
	 *            �����ұ�ʶ
	 * @param payload
	 *            <code>{"name":"test chatroom","description":
	 *            "update chatroominfo","maxusers":200}
	 * @return
	 */
	Object modifyChatRoom(String roomId, Object payload);

	/**
	 * ɾ�������� <br>
	 * DELETE
	 * 
	 * @param roomId
	 *            �����ұ�ʶ
	 * @return
	 */
	Object deleteChatRoom(String roomId);

	/**
	 * ��ȡapp�����е������� <br>
	 * GET
	 * 
	 * @return
	 */
	Object getAllChatRooms();

	/**
	 * ��ȡһ������������ <br>
	 * GET
	 * 
	 * @param roomId
	 *            �����ұ�ʶ
	 * @return
	 */
	Object getChatRoomDetail(String roomId);

	/**
	 * �����ҳ�Ա���[����] <br>
	 * POST
	 * 
	 * @param roomId
	 *            �����ұ�ʶ
	 * @param userName
	 *            �û�ID���û���
	 * @return
	 */
	Object addSingleUserToChatRoom(String roomId, String userName);

	/**
	 * �����ҳ�Ա���[����] <br>
	 * POST
	 * 
	 * @param roomId
	 *            �����ұ�ʶ
	 * @param payload
	 *            �û�ID���û�����������ʽ
	 * @return
	 * @see com.easemob.server.example.comm.body.UserNamesBody
	 */
	Object addBatchUsersToChatRoom(String roomId, Object payload);

	/**
	 * �����ҳ�Աɾ��[����] <br>
	 * DELETE
	 * 
	 * @param roomId
	 *            �����ұ�ʶ
	 * @param userName
	 *            �û�ID���û���
	 * @return
	 */
	Object removeSingleUserFromChatRoom(String roomId, String userName);

	/**
	 * �����ҳ�Աɾ��[����] <br>
	 * DELETE
	 * 
	 * @param roomId
	 *            �����ұ�ʶ
	 * @param userNames
	 *            �û�ID���û�����������ʽ
	 * @return
	 */
	Object removeBatchUsersFromChatRoom(String roomId, String[] userNames);
}
