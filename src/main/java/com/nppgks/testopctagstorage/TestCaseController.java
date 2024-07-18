package com.nppgks.testopctagstorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Меняет значения тегов в зависимости от того, какой тест кейс хотим потестить
@RestController
public class TestCaseController {

    @Autowired
    private TagStorage tagStorage;

    //case 1 stage 1. ТПР в КП, ПП в БИК, К-фактор в СОИ
    @GetMapping("/mi3272c1st1")
    public void writeTagDataValuesCase1Stage1() {
        tagStorage.updateValues(MI3272DataFiller.putTprCoeffInitData(true, false));
    }

    //case 1 stage 2. ТПР в КП, ПП в БИК, К-фактор в СОИ
    @GetMapping("/mi3272c1st2")
    public void writeTagDataValuesCase1Stage2() {
        tagStorage.updateValues(MI3272DataFiller.putRestInitDataWithTprInKPPPInBIKSOI());
    }


    // case 3. Без ТПР, ПП в БИК, ПЭП
    @GetMapping("/mi3272c3")
    public boolean writeTagDataValuesCase3() {
        return tagStorage.updateValues(MI3272DataFiller.putWithoutTprPep(false));
    }

}
