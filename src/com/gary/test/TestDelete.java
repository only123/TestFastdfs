package com.gary.test;

import java.io.File;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

/**
 * 删除文件
 * @author gary
 *
 */
public class TestDelete {
	public static void main(String[] args) throws Exception {
		String classPath = new File(TestDelete.class.getResource("/").getFile()).getCanonicalPath();
		String configFilePath = classPath + File.separator + "fdfs_client.conf";
		
		ClientGlobal.init(configFilePath);
		
		TrackerClient trackerClient = new TrackerClient();
	    TrackerServer trackerServer = trackerClient.getConnection();

	    StorageServer storageServer = null;
	    StorageClient storageClient = new StorageClient(trackerServer, storageServer);
	    
	    String group_name = "group2";
	    String remote_filename = "M00/00/00/wKjNhlbFcbOACoiVAAAAH-pwiIE926_big.txt";
	    storageClient.delete_file(group_name, remote_filename);
	    System.out.println("删除成功");
	}
}
