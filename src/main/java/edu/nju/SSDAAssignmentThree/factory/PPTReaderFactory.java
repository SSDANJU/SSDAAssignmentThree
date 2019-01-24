package edu.nju.SSDAAssignmentThree.factory;

import edu.nju.SSDAAssignmentThree.service.Reader;
import edu.nju.SSDAAssignmentThree.service.ReaderFactory;
import edu.nju.SSDAAssignmentThree.servieImpl.PPTReader;

public class PPTReaderFactory implements ReaderFactory {

    @Override
    public Reader createReader(String type) {
        return new PPTReader();
    }
}
