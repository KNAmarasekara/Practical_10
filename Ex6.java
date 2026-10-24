
abstract class DataParser {

    public final void parse() {
        readData();
        processData();
        System.out.println("Parsing completed\n");
    }

    protected abstract void readData();
    protected abstract void processData();
}


class CsvParser extends DataParser {
    protected void readData() {
        System.out.println("Reading CSV file");
    }

    protected void processData() {
        System.out.println("Processing CSV data");
    }
}


class XmlParser extends DataParser {
    protected void readData() {
        System.out.println("Reading XML file");
    }

    protected void processData() {
        System.out.println("Processing XML data");
    }
}

public class Ex6 {
    public static void main(String[] args) {
        DataParser csv = new CsvParser();
        DataParser xml = new XmlParser();

        System.out.println("CSV Parser:");
        csv.parse();

        System.out.println("XML Parser:");
        xml.parse();
    }
}
