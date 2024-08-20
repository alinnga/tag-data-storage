package com.nppgks.testopctagstorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Меняет значения тегов в зависимости от того, какой тест кейс хотим потестить
@RestController
public class TestCaseController {

    private final String VALUES_UPDATED = "Значения тегов для МИ3272 обновлены!";
    private final String VALUES_SAME = "Значения тегов для МИ3272 остались прежними";

    @Autowired
    private TagStorage tagStorage;

    //case 1 stage 1. ТПР в КП, ПП в БИК, К-фактор в СОИ
    @GetMapping("/mi3272c1st1")
    public String writeTagDataValuesCase1Stage1() {
        if(tagStorage.updateValues(MI3272DataFiller.putTprCoeffInitData(true, false))) {
            return VALUES_UPDATED;
        }
        return VALUES_SAME;

    }

    //case 1 stage 2. ТПР в КП, ПП в БИК, К-фактор в СОИ
    @GetMapping("/mi3272c1st2")
    public String writeTagDataValuesCase1Stage2() {
        if(tagStorage.updateValues(MI3272DataFiller.putRestInitDataWithTprInKPPPInBIKSOI())) {
            return VALUES_UPDATED;
        }
        return VALUES_SAME;
    }

    //case 2 stage 1. ТПР не в КП, ПП в БИК, СОИ
    @GetMapping("/mi3272c2st1")
    public String writeTagDataValuesCase2Stage1() {
        if(tagStorage.updateValues(MI3272DataFiller.putTprCoeffInitData( false, false))) {
            return VALUES_UPDATED;
        }
        return VALUES_SAME;

    }

    //case 2. ТПР не в КП, ПП в БИК, СОИ
    @GetMapping("/mi3272c2st2")
    public String writeTagDataValuesCase2Stage2() {
        if(tagStorage.updateValues(MI3272DataFiller.putRestInitDataWithTprNotInKPPPInBIKSOI())) {
            return VALUES_UPDATED;
        }
        return VALUES_SAME;
    }

    // case 3. Без ТПР, ПП в БИК, ПЭП
    @GetMapping("/mi3272c3")
    public String writeTagDataValuesCase3() {
        if(tagStorage.updateValues(MI3272DataFiller.putWithoutTprPep(false))) {
            return VALUES_UPDATED;
        }
        return VALUES_SAME;
    }

}
