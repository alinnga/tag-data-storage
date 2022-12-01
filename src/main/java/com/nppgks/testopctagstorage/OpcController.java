package com.nppgks.testopctagstorage;

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

    @PostMapping("/write")
    public void sendTagData(@RequestBody Map<String, Object> tagNamesMap){

    }
}
