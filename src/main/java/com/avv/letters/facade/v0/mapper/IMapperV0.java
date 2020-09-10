package com.avv.letters.facade.v0.mapper;

import com.avv.letters.dao.dto.LetterDAO;
import com.avv.letters.facade.v0.dto.LetterDTO;

public interface IMapperV0 {

    LetterDAO mapInCompareLetters(LetterDTO letters);

}
