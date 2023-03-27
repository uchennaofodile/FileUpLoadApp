package org.uchennaofodile.FileUploadBackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uchennaofodile.FileUploadBackend.model.MyFile;
import org.uchennaofodile.FileUploadBackend.repository.FileRepository;
import org.uchennaofodile.FileUploadBackend.util.*;

@Service
public class FileServiceImplementation implements FileService {
    @Autowired
    FileRepository fileRepository;

    @Override
    public List<MyFile> getAllFiles() {
        // fetch all the files form database
        return fileRepository.findAll();
    }

    @Override
    public void saveAllFiles(List<MyFile> fileList) {
        // Save all the files into database
        for (MyFile fileModal : fileList)
            // fileRepository.save(fileModal);
            fileRepository.save(MyFile.builder()
                    .fileName(fileModal.getFileName())
                    .fileType(fileModal.getFileType())
                    .content(ImageUtil.compressImage(fileModal.getContent())).build());

    }

}