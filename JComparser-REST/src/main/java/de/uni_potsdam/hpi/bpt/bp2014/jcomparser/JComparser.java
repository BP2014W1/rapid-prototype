package de.uni_potsdam.hpi.bpt.bp2014.jcomparser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;


public class JComparser {
    public static void main(String args[]) {

        /* Settings */
        boolean retrieval_by_url = true;
        boolean rest_option = false;

        /* Initialization */
        String XML_response = "";
        //String Processeditor_server_url = "http://localhost:8080/processeditor-repo-api/";
        String Processeditor_server_url = "http://hpi.framsteg.de/bp2014w1/PCMBeispiele/transportieren.model";

        if (rest_option) {
            REST jREST = new REST();
        }
        if (retrieval_by_url) {
            Retrieval jRetrieval = new Retrieval();
            XML_response = jRetrieval.getHTML(Processeditor_server_url);
            XML_response = XML_response.replaceAll("[^\\x20-\\x7e]", "");
            handleFileRetrieval(XML_response);
        }
    }

    /*public static void handleFileUpload(List pcm) {
        Object xml_path_url = pcm.get(1);

        InputStream xml_content;
        try {

        }
            xml_content = new FileInputStream(xml_path_url);
        } catch (IOException e) {
            System.out.println("Error in Reading file ");
            System.out.println(xml_path_url);
        }

        //de.uni_potsdam.hpi.bpt.bp2014.jcomparser.Parser.parsePCM(xml_content);
    }*/

    public static void handleFileRetrieval(String pcm) {

        List<String> pcm_list = new ArrayList<String>();
        pcm_list.add(pcm);

        de.uni_potsdam.hpi.bpt.bp2014.jcomparser.Parser.parsePCM(pcm_list);
    }
}