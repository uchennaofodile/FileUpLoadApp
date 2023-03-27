package org.uchennaofodile.FileUploadBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uchennaofodile.FileUploadBackend.model.MyFile;

//Data Type of Model, Primary
public interface FileRepository extends JpaRepository<MyFile, Long> {

}
