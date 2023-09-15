package com.m2p.loyaltyprogram.edw.sftp;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

import java.io.File;

public interface SftpFileUploadService {

    public void uploadFileToSftpServer(String localFile, String remoteDirectory);

    public void downloadFileFromSftpServer(String remoteFile,String remoteDirectory);
}
