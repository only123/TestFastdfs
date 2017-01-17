package com.gary.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.FileInfo;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

/**
 * 
 * @author gary
 *
 */
public class TestGet {
	public static void main(String[] args) throws Exception {
		String classPath = new File(TestGet.class.getResource("/").getFile()).getCanonicalPath();
        String configFilePath = classPath + File.separator + "fdfs_client.conf";
            
        ClientGlobal.init(configFilePath);
            
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();

        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        
        storageClient.download_file("group1", " M00/00/00/wKh1g1g8feKAI17hAABWmBBg3Io799.JPG", "111.jpg");
        System.err.println("下载成功");
	}
}
