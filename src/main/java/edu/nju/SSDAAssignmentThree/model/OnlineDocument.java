package edu.nju.SSDAAssignmentThree.model;

import edu.nju.SSDAAssignmentThree.service.Reader;
import edu.nju.SSDAAssignmentThree.service.ReaderFactory;
import edu.nju.SSDAAssignmentThree.servieImpl.PDFReaderFactory;

public class OnlineDocument {

    private String name;
    private String ID;
    private String author;
    private String url;
    private String type;
    private String content;
    private Reader reader;

    public void createReader(){
        ReaderFactory readerFactory=new PDFReaderFactory();
        reader=readerFactory.createReader(type);
    }

    public void show(){
        reader.read();
    }

    public OnlineDocument(String name, String ID, String author, String url, String type, String content) {
        this.name = name;
        this.ID = ID;
        this.author = author;
        this.url = url;
        this.type = type;
        this.content = content;
        createReader();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}
