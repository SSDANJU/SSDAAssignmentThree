package edu.nju.SSDAAssignmentThree.factory;

import edu.nju.SSDAAssignmentThree.service.Reader;
import edu.nju.SSDAAssignmentThree.service.ReaderFactory;
import edu.nju.SSDAAssignmentThree.servieImpl.WordReader;

public class WordReaderFactory implements ReaderFactory {

    @Override
    public Reader createReader(String type) {
        return new WordReader();
    }
}
