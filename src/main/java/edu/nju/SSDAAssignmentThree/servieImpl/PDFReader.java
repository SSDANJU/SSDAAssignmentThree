package edu.nju.SSDAAssignmentThree.servieImpl;

import edu.nju.SSDAAssignmentThree.service.Reader;

public class PDFReader implements Reader {

    @Override
    public String read() {
        return "pdf";
    }
}
