package com.avv.letters.facade.v0.mapper.impl;

import com.avv.letters.business.impl.LetterServiceImpl;
import com.avv.letters.dao.dto.LetterDAO;
import com.avv.letters.facade.v0.dto.LetterDTO;
import com.avv.letters.utils.DummyMocks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MapperImplV0Test {

    @InjectMocks
    MapperImplV0 mapper;

    @Mock
    LetterServiceImpl srv;

    DummyMocks dummyMocks;

    @Before
    public void init(){
        dummyMocks = new DummyMocks();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mapInCompareLetters() {

        LetterDTO dtoIn = dummyMocks.compareLettersDTOTrueResponse();
        LetterDAO out = mapper.mapInCompareLetters(dtoIn);

        Assert.assertEquals(out.getFirstString(), dtoIn.getFirstString());
        Assert.assertEquals(out.getSecondString(), dtoIn.getSecondString());
    }
}