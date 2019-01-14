package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.dao.program_filter.*;
import com.discardpast.louwailou.repository.ProgramAreaFilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/p")
public class ProgramAreaFilterController {

    @Autowired
    private ProgramAreaFilterRepository programAreaFilterRepository;

    @GetMapping(value = "/list")
    private List<ProgramAreaFilter> getProgramAreaFilter()
    {
        ProgramAreaFilter programAreaFilter = new ProgramAreaFilter();
        ProgramAreaFilterTypeList programAreaFilterTypeList = new ProgramAreaFilterTypeList();
        ArrayList<ProgramAreaFilterTypeItem> programAreaFilterTypeItems = new ArrayList<>();
        ProgramAreaFilterTypeItem typeItem = new ProgramAreaFilterTypeItem();
        ProgramAreaFilterTypeItem typeItem1 = new ProgramAreaFilterTypeItem();
        ProgramAreaFilterTypeCity programAreaFilterTypeCity = new ProgramAreaFilterTypeCity();
        ProgramAreaFilterTypeCity programAreaFilterTypeCity1 = new ProgramAreaFilterTypeCity();
        ProgramAreaFilterTypeCityAreaItem programAreaFilterTypeCityAreaItem = new ProgramAreaFilterTypeCityAreaItem();
        ProgramAreaFilterTypeCityAreaItem programAreaFilterTypeCityAreaItem1 = new ProgramAreaFilterTypeCityAreaItem();
        ProgramAreaFilterTypeCityAreaItemStreet programAreaFilterTypeCityAreaItemStreet = new ProgramAreaFilterTypeCityAreaItemStreet();
        ProgramAreaFilterTypeCityAreaItemStreet programAreaFilterTypeCityAreaItemStreet1 = new ProgramAreaFilterTypeCityAreaItemStreet();
        ArrayList<ProgramAreaFilterTypeCityAreaItemStreet> programAreaFilterTypeCityAreaItemStreets = new ArrayList<>();
        programAreaFilterTypeCityAreaItemStreets.add(programAreaFilterTypeCityAreaItemStreet);
        programAreaFilterTypeCityAreaItemStreets.add(programAreaFilterTypeCityAreaItemStreet1);
        programAreaFilterTypeCityAreaItem.setProgramAreaFilterTypeCityAreaItemStreets(programAreaFilterTypeCityAreaItemStreets);
        programAreaFilterTypeCityAreaItem1.setProgramAreaFilterTypeCityAreaItemStreets(programAreaFilterTypeCityAreaItemStreets);
        ArrayList<ProgramAreaFilterTypeCityAreaItem> programAreaFilterTypeCityAreaItems = new ArrayList<>();
        programAreaFilterTypeCityAreaItems.add(programAreaFilterTypeCityAreaItem);
        programAreaFilterTypeCityAreaItems.add(programAreaFilterTypeCityAreaItem1);
        programAreaFilterTypeCity.setProgramAreaFilterTypeCityAreaItems(programAreaFilterTypeCityAreaItems);
        programAreaFilterTypeCity1.setProgramAreaFilterTypeCityAreaItems(programAreaFilterTypeCityAreaItems);
        ArrayList<ProgramAreaFilterTypeCity> programAreaFilterTypeCities = new ArrayList<>();
        programAreaFilterTypeCities.add(programAreaFilterTypeCity);
        programAreaFilterTypeCities.add(programAreaFilterTypeCity1);
        typeItem.setProgramAreaFilterTypeCities(programAreaFilterTypeCities);
        typeItem1.setProgramAreaFilterTypeCities(programAreaFilterTypeCities);
        programAreaFilterTypeItems.add(typeItem);
        programAreaFilterTypeItems.add(typeItem1);

        programAreaFilterTypeList.setProgramAreaFilterTypeItems(programAreaFilterTypeItems);
        programAreaFilter.setProgramAreaFilterTypeList(programAreaFilterTypeList);



        programAreaFilterRepository.save(programAreaFilter);
        return programAreaFilterRepository.findAll();
    }

    @GetMapping(value = "/one")
    private Optional<ProgramAreaFilter> getProgramAreaFiltera()
    {
        return programAreaFilterRepository.findById(1);
    }

    @PostMapping(value = "/add")
    private String addProgramAreaFilter(@RequestBody ProgramAreaFilter programAreaFilter){
        programAreaFilterRepository.save(programAreaFilter);
        return "ok";
    }
}
