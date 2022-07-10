package com.example.htest;

//import com.sun.javafx.fxml.builder.URLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.File;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RestGetService {
    public static String PATCH = "E:\\evewho_characters.txt";
    public static String PATCH_OUT = "E:\\evewho_characters_dif.txt";
    public static String PATCH_OUT2 = "E:\\evewho_characters_dif2.txt";

    public void chk() throws Exception {
        List<String> newList = getAll();
        List<String> oldList = new ArrayList<>();
        if (new File(PATCH).exists()) {
            oldList = Files.readAllLines(Paths.get(PATCH));
        }
        List<String> differences = new ArrayList<>(oldList);
        differences.removeAll(newList);
        log.debug("differences {}", differences.size());
        if (differences.size() > 0) {
           // Files.write(Paths.get(PATCH_OUT), differences);
            Files.write(Paths.get(PATCH_OUT ), differences , StandardCharsets.UTF_8 , StandardOpenOption.APPEND);
        }
        Files.write(Paths.get(PATCH), newList, StandardCharsets.UTF_8);

    }

    public void chk2() throws Exception {
        List<String> newList = new ArrayList<>();
        if (new File(PATCH_OUT).exists()) {
            newList = Files.readAllLines(Paths.get(PATCH_OUT));
        }
        List<String> distinctList =  newList.stream().distinct().collect(Collectors.toList());

            Files.write(Paths.get(PATCH_OUT2 ), distinctList , StandardCharsets.UTF_8);


    }

    public List<String> getAll() throws InterruptedException {
        List<String> list = new ArrayList<>();
        for (Integer id : Const.AlyArrayList()) {
            log.debug("Aly {}", id);
            List<String> in = fromAli(id).stream().map(item -> item.name).collect(Collectors.toList());
            list.addAll(in);
        }
        for (Integer id : Const.CorpArrayList()) {
            log.debug("Corp {}", id);
            List<String> in = fromCorp(id).stream().map(item -> item.name).collect(Collectors.toList());
            list.addAll(in);
        }
        log.debug("all {}", list.size());
        return list;
    }


    public List<CharactersDto> fromAli(Integer id) throws InterruptedException {
        Thread.sleep(2000);
        return fromEV(id, "allilist");
    }

    public List<CharactersDto> fromCorp(Integer id) throws InterruptedException {
        Thread.sleep(2000);
        return fromEV(id, "corplist");
    }


    public List<CharactersDto> fromEV(Integer id, String type) {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .defaultHeader("User-Agent", "Mozilla/5.0 (X11; U; Linux i686) Gecko/20071127 Firefox/2.0.0.11")
                .build();
        String url = "https://evewho.com/api/" + type + "/" + id + "/";
        try {
            CorpDto forObject = restTemplate.getForObject(url, CorpDto.class);
            return forObject.getCharacters();
        } catch (Exception e) {
            log.error("fromEV {} ", id, e);
            return new ArrayList<>();
        }


    }

}
