package com.hsk.xframe.api.im.api;

/**
 * This interface is created for RestAPI of Chat Messages, it should be
 * synchronized with the API list.
 *
 * @author Eric23 2016-01-05
 * @see http://docs.easemob.com/
 */
public interface ChatMessageAPI {
	/**
	 * ���������¼��Ĭ�Ϸ���10�� <br>
	 * GET
	 *
	 * @param limit
	 *            ��ҳ���������1000
	 * @param cursor
	 *            �α꣬���ڸ���ҳʱ����
	 * @param query
	 *            ��ѯ��� <code>ql=select * where timestamp>1403164734226</code>
	 * @return
	 *
	 * �˽ӿ��Ѿ����ڣ��¸��汾�����ṩ�½ӿ�
	 */
	Object exportChatMessages(Long limit, String cursor, String query);

    /**
     * ��ȡ�����¼��������
     * GET
     * @param timeStr
     *              Ŀ�������¼��ʱ��
     * @return
     */
	Object exportChatMessages(String timeStr);
}
