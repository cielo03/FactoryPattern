package com.isi;

public class DocumentFactory {
    public static Document open(String type){
        if (type.equals(Document.DOCPDF)){
            DocPdf Docu = new DocPdf("Document1",".pdf"," ceci est document pdf");
            System.out.println("Nouveau document ouvert:" + Docu.getNom() + Docu.getExtension() + " Commentaires: " + Docu.getCommentaire());
            return Docu;
        }else if (type.equals(Document.DOCTEXT)) {
            DocTexte Docu = new DocTexte("Document2",".txt"," ceci est document de type texte");
            System.out.println("Nouveau document ouvert:" + Docu.getNom() + Docu.getExtension() + " Commentaires: " + Docu.getCommentaire());
            return Docu;
        }else {
            return null;
        }
    }
    public static Document close(String type){
        if (type.equals(Document.DOCPDF)){
            DocPdf Docu = new DocPdf("Document1",".pdf"," ceci est document pdf");
            System.out.println("Nouveau document fermé:" + Docu.getNom() + Docu.getExtension() + " Commentaires: " + Docu.getCommentaire());
            return Docu;
        }else if (type.equals(Document.DOCTEXT)) {
            DocTexte Docu = new DocTexte("Document2",".txt"," ceci est document de type texte");
            System.out.println("Nouveau document fermé:" + Docu.getNom() + Docu.getExtension() + " Commentaires: " + Docu.getCommentaire());
            return Docu;
        }else {
            return null;
        }
    }
    public static Document save(String type){
        if (type.equals(Document.DOCPDF)){
            DocPdf Docu = new DocPdf("Document1",".pdf"," ceci est document pdf");
            System.out.println("Nouveau document enregistré:" + Docu.getNom() + Docu.getExtension() + " Commentaires: " + Docu.getCommentaire());
            return Docu;
        }else if (type.equals(Document.DOCTEXT)) {
            DocTexte Docu = new DocTexte("Document2",".txt"," ceci est document de type texte");
            System.out.println("Nouveau document enregistré:" + Docu.getNom() + Docu.getExtension() + " Commentaires: " + Docu.getCommentaire());
            return Docu;
        }else {
            return null;
        }
    }
}
