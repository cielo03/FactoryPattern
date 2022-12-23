package com.isi;

public class Main {
    public static void main(String[] args) {
        Document docpdf = DocumentFactory.open("DOCPDF");
        Document doctext= DocumentFactory.save("DOCTEXT");
        Document doctext1= DocumentFactory.close("DOCTEXT");
        Document docpdf1= DocumentFactory.close("DOCPDF");

    }
}
