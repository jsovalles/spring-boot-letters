package com.avv.letters.utils;

import com.avv.letters.dao.dto.LetterDAO;
import com.avv.letters.facade.v0.dto.LetterDTO;

public class DummyMocks {

    public LetterDTO compareLettersDTOTrueResponse(){

        LetterDTO out = new LetterDTO();

        out.setFirstString("army");
        out.setSecondString("mary");

        return out;

    }

    public LetterDTO compareLettersDTOFalseResponse(){

        LetterDTO out = new LetterDTO();

        out.setFirstString("Army");
        out.setSecondString("Mary");

        return out;

    }

    public LetterDAO compareLettersDAOTrueResponse(){

        LetterDAO out = new LetterDAO();

        out.setFirstString("army");
        out.setSecondString("mary");

        return out;

    }

    public LetterDAO compareLettersDAOFalseResponse(){

        LetterDAO out = new LetterDAO();

        out.setFirstString("Army");
        out.setSecondString("Mary");

        return out;

    }


}