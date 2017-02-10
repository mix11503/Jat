/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jat.junior.model;

/**
 *
 * @author PNattawut
 */
public class FileModel {
    private long fileEntity;
    private long ownerId;
    private String filePath;

    
    
    public long getFileEntity() {
        return fileEntity;
    }

    public void setFileEntity(long fileEntity) {
        this.fileEntity = fileEntity;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "FileModel{" + "fileEntity=" + fileEntity + ", ownerId=" + ownerId + ", filePath=" + filePath + '}';
    }
    
    
}
