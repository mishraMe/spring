package com.madd.backend.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class FileServiceImpl implements FileService {

    private final Path pullPics = Paths.get("Pictures/pullPictures");
    private final Path pushPics = Paths.get("Pictures/pushPictures");
    @Override
    public void init() {

    }

    @Override
    public void save(MultipartFile file, Path location){
        try{
            Files.copy(file.getInputStream(), location.resolve(Objects.requireNonNull(file.getOriginalFilename())));
        }catch (IOException e){
            throw new RuntimeException("could not copy the file " + e.getMessage());
        }
    }

    @Override
    public Stream<Path> loadAll(Path location){
        try{
            return Files.walk(location, 1).distinct().filter(path -> !path.equals(location)).map(location::relativize);
        }catch (IOException e){
            throw new RuntimeException("bumped into IO Exception " + e.getMessage());
        }
    }
}
