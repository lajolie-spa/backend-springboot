package com.huydeve.lajolie;

import com.huydeve.lajolie.model.Role;
import com.huydeve.lajolie.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RedisExample implements CommandLineRunner {
    @Autowired
    private RedisTemplate template;

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public void run(String... args) throws Exception {
        // Set giá trị của key "loda" là "hello redis"
        template.opsForValue().set("loda","hello world");

        // In ra màn hình Giá trị của key "loda" trong Redis
//        System.out.println("Value of key loda: "+template.opsForValue().get("loda"));
//

//        roleRepository.findAll().forEach(System.out::println);
    }


//    @Bean
//    CommandLineRunner commandLineRunner(PermissionRepository userRepository){
//        return args -> {
//
//
//            List<Permission> permission = List.of(
//                    Permission.builder().name("create").build(), Permission.builder().name("delete").build(),
//                    Permission.builder().name("read").build(), Permission.builder().name("update").build()
//            );
//            userRepository.saveAll(permission);
//            userRepository.findAll().forEach(System.out::println);
//        };
//    }
}