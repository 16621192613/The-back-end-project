package com.hsk.xframe.web.sysfile.service;

import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.persistence.SysFileInfo;
import com.hsk.xframe.api.service.IDSTService;


 

public interface IFileService extends IDSTService {
	/**
	 * 上传文件
	 * @return
	 * @throws Exception
	 */
	public SysRetrunMessage addfile(String fileType) throws Exception;
	/**
	 * 保存微信图片信息
	 * @param serverId
	 * @return
	 * @throws Exception
	 */
	public SysFileInfo saveWxFile(String serverId) throws Exception;
	/**
	 * 删除文件
	 * @param fileCode
	 * @return
	 * @throws Exception
	 */
	public SysRetrunMessage deletefile(String fileCode) throws Exception;
	/**
	 * 查看文件
	 * @param fileCode
	 * @return
	 * @throws Exception
	 */
	public SysRetrunMessage GetOneFileInfo(String fileCode) throws Exception;
	/**
	 * 删除文件
	 * @param filePath
	 * @return
	 * @throws Exception
	 */
	public SysRetrunMessage deletefileByPath(String filePath) throws Exception;
}