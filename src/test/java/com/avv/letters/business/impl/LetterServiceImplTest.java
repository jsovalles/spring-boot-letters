package com.avv.letters.business.impl;

import com.avv.letters.dao.ILetterDAO;
import com.avv.letters.dao.dto.LetterDAO;
import com.avv.letters.utils.DummyMocks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class LetterServiceImplTest {

    @InjectMocks
    LetterServiceImpl srv;

    @Mock
    ILetterDAO dao;

    DummyMocks dummyMocks;

    @Before
    public void init(){
        dummyMocks = new DummyMocks();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void compareLetters() {
        LetterDAO dummyDAO = dummyMocks.compareLettersDAOTrueResponse();
        Mockito.when(dao.compareLetters(dummyDAO)).thenReturn(true);
        boolean out = srv.compareLetters(dummyDAO);
        Assert.assertEquals(true, out);
    }
}