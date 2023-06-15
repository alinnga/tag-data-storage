package com.nppgks.testopctagstorage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/opc")
public class OpcController {

    @Autowired
    private TagStorage tagStorage;

    @GetMapping("/test-connection")
    public boolean getTagData(){
        return true;
    }

    @PostMapping("/reconnect")
    public boolean reconnect() throws InterruptedException {
        Thread.sleep(1000);
        return true;
    }

    @PostMapping("/read")
    public Map<String, String> getTagData(@RequestBody List<String> tagNames){
        tagStorage.generateTags();
        Map<String, String> resultMap = new HashMap<>();
        Map<String, String> tagStorageMap = tagStorage.tagData;

        tagNames.forEach(tn -> {
            if(tagStorageMap.containsKey(tn)){
                resultMap.put(tn, tagStorageMap.get(tn));
            }
        });

        return resultMap;
    }
    @PostMapping("/readOne")
    public String getTagData(@RequestBody String tagName){
        return "98.9998";
    }

    @PostMapping("/write")
    public boolean sendTagData(@RequestBody Map<String, Object> tagNamesMap) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> newMap = new HashMap<>();
        for(Map.Entry<String, Object> entry: tagNamesMap.entrySet()){
            newMap.put(entry.getKey(), objectMapper.writeValueAsString(entry.getValue()));
        }
        return tagStorage.writeValues(newMap);
    }
}
