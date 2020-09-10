package com.avv.letters.business.impl;

import com.avv.letters.business.ILetterService;
import com.avv.letters.dao.ILetterDAO;
import com.avv.letters.dao.dto.LetterDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LetterServiceImpl implements ILetterService {

    @Autowired
    ILetterDAO dao;

    @Override
    public boolean compareLetters(LetterDAO letterDao) {

        return dao.compareLetters(letterDao);
    }
}
