package td4;

public class DocumentPDF implements IDocument{

    private final ComposantPDF composantPDF;

    public DocumentPDF(ComposantPDF composantPDF) {
        this.composantPDF = composantPDF;
    }

    @Override
    public void setContenu(String contenu) {
        this.composantPDF.pdfFixeContenu(contenu);
    }

    @Override
    public void affiche() {
        this.composantPDF.pdfPrepareAffichage();
        this.composantPDF.pdfAffichage();
        this.composantPDF.pdfTermineAffichage();
    }

    @Override
    public void imprime() {
        this.composantPDF.pdfEnvoieImprimante();
    }
}
