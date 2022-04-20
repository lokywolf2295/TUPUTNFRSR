package pck.scraping;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapingWebAxie {

    
    public static void main(String[] args) throws IOException {
        Document html = Jsoup.connect("https://www.axieworld.com/es/tools/cards-explorer").userAgent("Mozilla/5.0").timeout(100000).get();//al documento agregamos la coneccion con la url que le pasamos como parametro         
        Elements cartas = html.select("div.__next");
        File archivo = new File("informacionObtenida\\CartasAxie.doc");
        //System.out.println(html.select("div._15NnuVhmyNHKrZ0lLQ6AA_").size());
        for( Element e: html.select("div._15NnuVhmyNHKrZ0lLQ6AA_")){
            String titulo = e.select("span._2LcNsks_XwSl7u64x1Bz64").text(); //obtenemos el titulo de cada carta
            String descripcion = e.select("span._1XQhUTSJgcQL2I--0A9ely").text(); //obtenemos la descripcion de cada carta
            
            PrintWriter documentar = new PrintWriter(new FileWriter( archivo, true));
            documentar.println(titulo);
            documentar.println(descripcion);
            documentar.println("-------------------------------------------------------------------------");
            documentar.println("");
            documentar.close();
            
            System.out.println(titulo);
            System.out.println(descripcion);
            System.out.println("----------------------------------------------------------");
        }
    }
    
}
