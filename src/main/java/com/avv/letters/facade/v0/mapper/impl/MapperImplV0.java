package com.avv.letters.facade.v0.mapper.impl;

import com.avv.letters.dao.dto.LetterDAO;
import com.avv.letters.facade.v0.dto.LetterDTO;
import com.avv.letters.facade.v0.mapper.IMapperV0;
import org.springframework.stereotype.Component;

@Component
public class MapperImplV0 implements IMapperV0 {

    @Override
    public LetterDAO mapInCompareLetters(LetterDTO letters) {

        LetterDAO letterDao = new LetterDAO();

        letterDao.setFirstString(letters.getFirstString());
        letterDao.setSecondString(letters.getSecondString());

        return letterDao;

    }
}
