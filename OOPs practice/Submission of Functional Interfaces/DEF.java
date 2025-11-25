interface DataExporter {
    void export();

    default void exportToJSON() {
        System.out.println("Exporting data in JSON format (default implementation).");
    }
}

class CSVExporter implements DataExporter {
    public void export() {
        System.out.println("Exporting data in CSV format.");
    }
}

class PDFExporter implements DataExporter {
    public void export() {
        System.out.println("Exporting data in PDF format.");
    }
}

public class DEF {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();

        csv.export();
        csv.exportToJSON();

        pdf.export();
        pdf.exportToJSON();
    }
}
