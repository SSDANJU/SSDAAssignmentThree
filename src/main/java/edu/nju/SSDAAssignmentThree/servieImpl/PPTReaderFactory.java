package edu.nju.SSDAAssignmentThree.servieImpl;

import edu.nju.SSDAAssignmentThree.service.Reader;
import edu.nju.SSDAAssignmentThree.service.ReaderFactory;

public class PPTReaderFactory implements ReaderFactory {

    @Override
    public Reader createReader(String type) {
        return new PPTReader();
    }
}
