/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jat.junior.service;

import com.jat.junior.model.FileModel;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author PNattawut
 */
public class FileService {
    private static FileService fileService;
    
    public FileService(){
        
    }
    
    public static FileService getFileServiceInstance(){
        if(fileService == null)
            fileService = new FileService();
        return fileService;
    }
    
    // Uploader Section
    public void createNewFile(String fileName, File file, int ownerId){
    
    }
    
    // Editor Section
    public void deleteFileById(long ownerId){
    
    }
    
    public void changeFileName(long ownerId, long fileEntity, String newFileName){
    
    }
    
    // Sharing Section
    public void shrFileToId(long fileEntity, long toStId){
        
    }
    
    
    // Retriving Section
    public File getFileByEntity(long fileEntity){
        return null;
    }
    
    public ArrayList<File> getAllFilesById(long ownerId){
        return null;
    }
    
    
}
