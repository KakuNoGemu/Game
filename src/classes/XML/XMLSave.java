package classes.XML;

import classes.Attacks.Attack;
import classes.Characters.Character;
import classes.Characters.*;
import classes.Shop.ShopItem;
import classes.Shop.ShopManager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class XMLSave {

    public boolean SaveXML(String filename) {

        List<Character> availableCharacters = new ArrayList<Character>() {
            {
                add(new Mage());
                add(new Marksman());
                add(new Swordsman());
                add(new Enemy1());
            }
        };
        boolean bRetVal = false;

        try {
            File f = new File(filename);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // root
            Document doc = builder.newDocument();
            Element root = doc.createElement("gameSettings");
            doc.appendChild(root);
            Element characters = doc.createElement("characters");
            root.appendChild(characters);

            for (Character character : CharacterManager.getAllKits()) {
                // <type value="0"/>
                Element t = doc.createElement("character");
                t.setAttribute("name", character.name());
                t.setAttribute("health", Integer.toString(character.health()));
                t.setAttribute("goldDrop", Integer.toString(character.goldDrop()));
                characters.appendChild(t);


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
                    /*
                    tv.setAttribute("cost", Integer.toString(shopItem.cost()));
                    tv.setAttribute("type", shopItem.type());
                    tv.setAttribute("value", Integer.toString(shopItem.value()));
                    */
                    t.appendChild(tv);

                }
            }

            Element shopItems = doc.createElement("shopItems");
            root.appendChild(shopItems);

            for (ShopItem shopItem : ShopManager.getShopItems()) {
                // <type value="0"/>
                Element t = doc.createElement("shopItem");
                t.setAttribute("name", shopItem.name());
                t.setAttribute("cost", Integer.toString(shopItem.cost()));
                t.setAttribute("type", shopItem.type());
                t.setAttribute("value", Integer.toString(shopItem.value()));
                shopItems.appendChild(t);
            }


            // write xml
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            //transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(doc), new StreamResult(f));

            bRetVal = true;
        } catch (Exception e) {
            e.printStackTrace();
            bRetVal = false;
        } finally {
        }

        return bRetVal;
    }

}
