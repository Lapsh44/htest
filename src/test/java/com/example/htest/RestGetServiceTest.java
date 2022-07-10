package com.example.htest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class RestGetServiceTest {
    @Autowired
    RestGetService restGetService;

    @Test
    void getDvcata() throws Exception {
        Long start = System.currentTimeMillis();
        restGetService.chk();
        log.debug("all time {}ms", System.currentTimeMillis() - start);
//        List<String> diff = diff("dd\nff\nsdsd\n dddd\n", "dd\nff\nsdsd\n dddd\n gg\n");
//        Files.write(Paths.get("/tmp/www.txt"), "".getBytes(StandardCharsets.UTF_8));
//        Files.write(Paths.get("/tmp/www.txt"), diff, StandardCharsets.UTF_8);
//        List<CharactersDto> charactersDtos = restGetService.fromCorp(98605189 );
//        log.debug("charactersDtos {}" , charactersDtos);
//        //restGetService.getData();;
//        List<String> strings1 = Files.readAllLines(Paths.get("/tmp/1.txt"));
//        List<String> strings2 = Files.readAllLines(Paths.get("/tmp/2.txt"));
//        List<String> differences = new ArrayList<>(strings2);
//        differences.removeAll(strings1);
//        Files.write(Paths.get("/tmp/out.txt"), differences);
//
//        List<String> diff = diff("dd\nff\nsdsd\n dddd\n", "dd\nff\nsdsd\n dddd\n gg\n");
//        log.debug("diff {}", diff);

    }

    public List<String> diff(String f1, String f2) {
        List<String> l1 = Arrays.asList(f1.split("\n"));
        List<String> l2 = Arrays.asList(f2.split("\n"));
        List<String> differences = new ArrayList<>(l2);
        differences.removeAll(l1);
        return differences;
    }
}
