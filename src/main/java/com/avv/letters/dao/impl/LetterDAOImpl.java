package com.avv.letters.dao.impl;

import com.avv.letters.dao.ILetterDAO;
import com.avv.letters.dao.dto.LetterDAO;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LetterDAOImpl implements ILetterDAO {


    @Override
    public boolean compareLetters(LetterDAO letterDao) {

        // We transform the Strings into a char Array
        char[] firstStringArray = letterDao.getFirstString().toCharArray();
        char[] secondStringArray = letterDao.getSecondString().toCharArray();

        //We sort the arrays
        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);

        //We return a boolean value if the two arrays are equals or not
        return Arrays.equals(firstStringArray,secondStringArray);
    }
}
