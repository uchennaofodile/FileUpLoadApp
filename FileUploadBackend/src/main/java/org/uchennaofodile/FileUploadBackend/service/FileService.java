package org.uchennaofodile.FileUploadBackend.service;

import java.util.List;

import org.uchennaofodile.FileUploadBackend.model.MyFile;

public interface FileService {
    List<MyFile> getAllFiles();

    void saveAllFiles(List<MyFile> fileList);

}
