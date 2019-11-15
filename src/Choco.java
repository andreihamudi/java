import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Choco {
    public static void main(String[] args) {
        int money = 0;
        int choco = 0;
        int price = 1;

        do {
            choco++;
            // money = money - price;
            money -= price;
        } while (money >price);
        System.out.println(choco);
    }
}
