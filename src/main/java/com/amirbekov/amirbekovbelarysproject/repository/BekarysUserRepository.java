package com.amirbekov.amirbekovbelarysproject.repository;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BekarysUserRepository extends JpaRepository<BekarysUser, Long> {
    // Поиск пользователя по логину (понадобится для Security)
    java.util.Optional<BekarysUser> findByUsername(String username);
}