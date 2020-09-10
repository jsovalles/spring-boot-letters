package com.avv.letters.business;

import com.avv.letters.dao.dto.LetterDAO;

public interface ILetterService {

    boolean compareLetters(LetterDAO letterDao);

}
