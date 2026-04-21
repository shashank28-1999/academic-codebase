import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import java.util.Scanner;
import java.io.File;

public class UserDOMParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User ID to search: ");
        String searchId = sc.nextLine().trim();

        try {
            File xmlFile = new File("../xml files/users.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList userList = doc.getElementsByTagName("user");
            boolean found = false;

            for (int i = 0; i < userList.getLength(); i++) {
                Node node = userList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String id = element.getElementsByTagName("id").item(0).getTextContent();
                    if (id.equalsIgnoreCase(searchId)) {
                        System.out.println("\nUser Found:");
                        System.out.println("ID     : " + id);
                        System.out.println("Name   : " + element.getElementsByTagName("n").item(0).getTextContent());
                        System.out.println("Email  : " + element.getElementsByTagName("email").item(0).getTextContent());
                        System.out.println("Phone  : " + element.getElementsByTagName("phone").item(0).getTextContent());
                        System.out.println("City   : " + element.getElementsByTagName("city").item(0).getTextContent());
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("No user found with ID: " + searchId);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
