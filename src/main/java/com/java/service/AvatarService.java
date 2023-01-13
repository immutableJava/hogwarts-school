package com.java.service;

import org.springframework.web.multipart.MultipartFile;
import com.java.model.Avatar;

import java.io.IOException;
import java.util.List;

public interface AvatarService {
    void uploadAvatar(Long id, MultipartFile multipartFile) throws IOException;

    Avatar findAvatar(Long id);

    List<Avatar> findAllAvatars(int page, int size);
}
