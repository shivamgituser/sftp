//package com.m2p.loyaltyprogram.edw.sftp;
//
//import com.jcraft.jsch.ChannelSftp;
//import com.jcraft.jsch.JSchException;
//import com.jcraft.jsch.SftpException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//@Service
//@Slf4j
//public class SftpFileUploadServiceImpl implements SftpFileUploadService{
//    @Autowired
//    private ChannelSftp channelSftp;
//
//    @Override
//    public void uploadFileToSftpServer(String localFile, String remoteDirectory) {
//        log.info("File Upload started");
//        try{
//            channelSftp.connect();
//            channelSftp.put(localFile, remoteDirectory);
//            log.info("File Uploaded Successfully!!!");
//        }
//        catch(JSchException jSchException){
//            log.info("File upload unsuccessful:::");
//            log.info("JSchException exception occurred. ExceptionMsg:::{}",jSchException.getMessage());
//        }
//        catch (SftpException sftpException){
//            log.info("File upload unsuccessful:::");
//            log.info("SftpException Exception occurred. Exception Msg:::{}",sftpException.getMessage());
//        }
//        finally {
//            channelSftp.exit();
//        }
//
//    }
//
//    @Override
//    public void downloadFileFromSftpServer(String remoteFile, String localDir) {
//       try{
//           log.info("File Downloading start!!!");
//           channelSftp.connect();
//           channelSftp.get(remoteFile, localDir + "jschFile.txt");
//           log.info("Download completed");
//       }
//       catch(JSchException jSchException){
//           log.info("JSchException exception occurred! Exception message:::{}",jSchException.getMessage());
//       }
//       catch(SftpException sftpException){
//           log.info("JSchException exception occurred! Exception message:::{}",sftpException.getMessage());
//       }
//       finally {
//           channelSftp.exit();
//       }
//
//    }
//}
