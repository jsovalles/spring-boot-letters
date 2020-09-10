package com.avv.letters.facade.v0.impl;

import com.avv.letters.business.ILetterService;
import com.avv.letters.dao.dto.LetterDAO;
import com.avv.letters.facade.v0.dto.LetterDTO;
import com.avv.letters.facade.v0.mapper.IMapperV0;
import com.avv.letters.utils.DummyMocks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class LettersV0Test {

    @InjectMocks
    LettersV0 controller;

    @Mock
    IMapperV0 mapper;

    @Mock
    ILetterService srv;

    DummyMocks dummyMocks;

    @Before
    public void init(){
        dummyMocks = new DummyMocks();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void compareLetters() {

        LetterDAO dummyDAO = dummyMocks.compareLettersDAOTrueResponse();
        LetterDTO dummyDTOIn = dummyMocks.compareLettersDTOTrueResponse();
        Mockito.when(mapper.mapInCompareLetters(dummyDTOIn)).thenReturn(dummyDAO);
        Mockito.when(srv.compareLetters(dummyDAO)).thenReturn(true);
        boolean response = controller.compareLetters(dummyDTOIn);

        Assert.assertEquals(true, response);
    }
}