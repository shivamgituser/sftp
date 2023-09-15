//package com.m2p.loyaltyprogram.edw.sftp;
//
//import com.jcraft.jsch.ChannelSftp;
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.JSchException;
//import com.jcraft.jsch.Session;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SftpConfig {
//
//    @Value("${sftp_username}")
//    private String username;
//
//    @Value("${sftp_password}")
//    private String password;
//
//    @Value("${sftp_remote_host}")
//    private String remoteHost;
//
//    @Bean
//    public ChannelSftp setupJsch() throws JSchException {
//        JSch jsch = new JSch();
//        jsch.setKnownHosts("/Users/john/.ssh/known_hosts");
//        Session jschSession = jsch.getSession(username, remoteHost);
//        jschSession.setPassword(password);
//        jschSession.connect();
//        return (ChannelSftp) jschSession.openChannel("sftp");
//    }
//}
