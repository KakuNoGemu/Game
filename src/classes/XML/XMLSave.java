package classes.XML;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import classes.Attacks.Attack;
import classes.Kits.*;
import classes.Shop.ShopItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class XMLSave {

    public boolean SaveXML(String filename)
    {

        List<Kit> availableKits = new ArrayList<Kit>() {
            {
                add(new Mage());
                add(new Marksman());
                add(new Swordsman());
                add(new Enemy1());
            }
        };
        boolean bRetVal = false;

        try
        {
            File f = new File(filename);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // root
            Document doc = builder.newDocument();
            Element root = doc.createElement("characters");
            doc.appendChild(root);


            for (int i = 0; i < 4; i++)
            {

                Kit character = availableKits.get(i);
                // <type value="0"/>
                Element t = doc.createElement("character");
                t.setAttribute("name", character.name());
                t.setAttribute("health", Integer.toString(character.health()));
                t.setAttribute("goldDrop", Integer.toString(character.goldDrop()));
                root.appendChild(t);


                for (Attack attack : character.attackList()) {
                    {
                }
                    // <type_value v1="0" v2="0"/>
                    Element tv = doc.createElement("attack");
                    tv.setAttribute("name", attack.name());
                    tv.setAttribute("damage", Integer.toString(attack.damage()));
                    t.appendChild(tv);
                //</type>
                }

                for (ShopItem shopItem : character.availableItems()) {

                    Element tv = doc.createElement("shopItem");
                    tv.setAttribute("name", shopItem.name());
                    tv.setAttribute("cost", Integer.toString(shopItem.cost()));
                    tv.setAttribute("type", shopItem.type());
                    tv.setAttribute("value", Integer.toString(shopItem.value()));
                    t.appendChild(tv);

                }
            }

            // write xml
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            //transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(doc), new StreamResult(f));

            bRetVal = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            bRetVal = false;
        }
        finally
        {
        }

        return bRetVal;
    }

}
