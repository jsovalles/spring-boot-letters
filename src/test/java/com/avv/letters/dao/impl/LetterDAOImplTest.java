package com.avv.letters.dao.impl;

import com.avv.letters.business.ILetterService;
import com.avv.letters.dao.dto.LetterDAO;
import com.avv.letters.facade.v0.impl.LettersV0;
import com.avv.letters.facade.v0.mapper.IMapperV0;
import com.avv.letters.utils.DummyMocks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class LetterDAOImplTest {

    @InjectMocks
    LetterDAOImpl dao;

    DummyMocks dummyMocks;

    @Before
    public void init(){
        dummyMocks = new DummyMocks();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void compareLettersTrue() {
        LetterDAO dummyDAO = dummyMocks.compareLettersDAOTrueResponse();
        boolean result = dao.compareLetters(dummyDAO);
        Assert.assertEquals(true, result);
    }

    @Test
    public void compareLettersFalse() {
        LetterDAO dummyDAO = dummyMocks.compareLettersDAOFalseResponse();
        boolean result = dao.compareLetters(dummyDAO);
        Assert.assertEquals(false, result);
    }
}