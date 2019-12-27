package com.anabatic.itAssets.services.service.impl;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.anabatic.itAssets.persistence.model.FileStorageProperties;


@Service
public class FileStorageService {

    private final Path fileStorageLocation;
    @Value("${file.upload-dir}")
	private String path;

    @Autowired
    public FileStorageService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
            .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
        	ex.printStackTrace();
        	//throw new ex;
            //throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    public String storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        File files = new File(path+"/"+fileName);


        try {
            // Check if the file's name contains invalid characters
            if (fileName.contains("..")) {
             //   throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            // Copy file to the target location (Replacing existing file with the same name)
            Path targetLocation = this.fileStorageLocation.resolve(files.getName());
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (IOException ex) {
        	ex.printStackTrace();
        	//throw ex;
            //throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
		return fileName;
    }
    
    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if(resource.exists()) {
                return resource;
            } else {
               // throw new MyFileNotFoundException("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {
        	throw new UsersException(UsersErrorConstant.USER_LOGIN_VALIDATION);            

           // throw new MyFileNotFoundException("File not found " + fileName, ex);
        }
		return null;
    }

//    public Resource loadFileAsResource(String fileName) {
//        try {
//            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
//            Resource resource = new UrlResource(filePath.toUri());
//            if (resource.exists()) {
//                return resource;
//            } else {
//            	
//               // throw new FileNotFoundException("File not found " + fileName);
//            }
//        } catch (MalformedURLException ex) {
//        	//throw ex;
//           // throw new FileNotFoundException("File not found " + fileName, ex);
//        }
//    }
}