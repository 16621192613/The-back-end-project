package com.hsk.xframe.api.im.api;

/**
 * This interface is created for RestAPI of File Upload and Download, it should
 * be synchronized with the API list.
 * 
 * @author Eric23 2016-01-05
 * @see http://docs.easemob.com/
 */
public interface FileAPI {

	/**
	 * �ϴ��ļ� <br>
	 * POST
	 * 
	 * @param file
	 *            �ϴ����ļ����󣬿����ǵ�ַ�����ȣ���ʵ����Ϊ׼
	 * @return
	 */
	Object uploadFile(Object file);

	/**
	 * �����ļ� <br>
	 * GET
	 * 
	 * @param fileUUID
	 *            �ļ�Ψһ��ʶ�����ϴ�Response-entities-uuid�л�ȡ
	 * @param shareSecret
	 *            �ļ�������Կ�����ϴ�Response-entities-share-secret�л�ȡ
	 * @param isThumbnail
	 *            ���������ͼƬ���Ƿ�Ϊ����ͼ
	 * @return
	 */
	Object downloadFile(String fileUUID, String shareSecret, Boolean isThumbnail);
}
