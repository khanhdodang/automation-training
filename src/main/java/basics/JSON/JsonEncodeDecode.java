package basics.JSON;

import javax.xml.bind.DatatypeConverter;

public class JsonEncodeDecode {

    public static void main(String[] args) {
        String json = "{\"menu\": {\n" +
                "  \"id\": \"file\",\n" +
                "  \"value\": \"File\",\n" +
                "  \"popup\": {\n" +
                "    \"menuitem\": [\n" +
                "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                "    ]\n" +
                "  }\n" +
                "}}";

        byte[] bytes = json.getBytes();

        String base64Encoded = DatatypeConverter.printBase64Binary(bytes);
        System.out.println("Encoded Json:\n");
        System.out.println(base64Encoded + "\n");

        byte[] base64Decoded = DatatypeConverter.parseBase64Binary(base64Encoded);
        System.out.println("Decoded Json:\n");
        System.out.println(new String(base64Decoded));
    }
}
