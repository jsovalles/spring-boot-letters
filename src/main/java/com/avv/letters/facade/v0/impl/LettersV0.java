package com.avv.letters.facade.v0.impl;

import com.avv.letters.business.ILetterService;
import com.avv.letters.dao.dto.LetterDAO;
import com.avv.letters.facade.v0.ILettersV0;
import com.avv.letters.facade.v0.dto.LetterDTO;
import com.avv.letters.facade.v0.mapper.IMapperV0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("letters/v1")
public class LettersV0 implements ILettersV0 {

    @Autowired
    IMapperV0 mapper;

    @Autowired
    ILetterService srv;

    @Override
    @PostMapping("/letter")
    public boolean compareLetters(@RequestBody LetterDTO letters) {

        LetterDAO dao = mapper.mapInCompareLetters(letters);

        return srv.compareLetters(dao);

    }
}
