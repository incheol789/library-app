package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // find 가 붙으면 1건을 가져온다.
    Optional<User> findByName(String name);

    long countByAge(Integer age);
}
