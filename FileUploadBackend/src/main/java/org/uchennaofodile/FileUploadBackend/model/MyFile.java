package org.uchennaofodile.FileUploadBackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// @Table annotation defines name of the table
@Table(name = "files")
public class MyFile {
    // Entity annotation defines that a
    // class can be mapped to a table
    // @Id annotation specifies the
    // primary key of an entity
    @Id

    // @GeneratedValue annotation Provides for the
    // specification of generation strategies
    // for the values of primary keys
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // @Column annotation specifies
    // the name of the column
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String fileName;
    @Lob
    @Column(name = "content")
    private byte[] content;
    @Column(name = "filetype")
    private String fileType;

    public MyFile(String fileName, byte[] content, String fileType) {
        this.fileName = fileName;
        this.content = content;
        this.fileType = fileType;
    }

}