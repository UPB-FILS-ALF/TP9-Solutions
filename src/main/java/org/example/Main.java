package org.example;

import com.alf.parser.AlfLexer;
import com.alf.parser.AlfParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String toJSON(Object object) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        return gson.toJson(object);
    }
    static void writeToFile(String outputFile, String text) throws IOException {
        FileWriter myWriter = new FileWriter(outputFile);
        myWriter.write(text);
        myWriter.close();
    }
    static void writeThreeAddressCodeToFile(String outputFile, ArrayList<String> tac) throws IOException {
        FileWriter myWriter = new FileWriter(outputFile);
        for(String line : tac){
            myWriter.write(line);
        }

        myWriter.close();
    }
    static String readFile(String inputFile) throws FileNotFoundException {
        String fileData = "";
        File sourceFile = new File(inputFile);
        Scanner scannerText = new Scanner(sourceFile);
        while (scannerText.hasNextLine()) {
            fileData += scannerText.nextLine();
            fileData += '\n';
        }
        scannerText.close();
        return fileData;
    }
    public static void main(String[] args) throws IOException {
        String fileData = readFile("files\\ex8.txt");

        // Create Lexer, Parser, ParseTree
        AlfLexer lexer = new AlfLexer(CharStreams.fromString(fileData));
        AlfParser parser = new AlfParser(new CommonTokenStream(lexer));

        lexer.removeErrorListeners ();
        parser.removeErrorListeners ();

        AlfParser.StartContext tree = parser.start();

        // Create our visitor
        MyAlfVisitor visitor = new MyAlfVisitor();

        SymbolTree symbolTree = new SymbolTree(visitor.visit(tree), SymbolTable.getInstance());

        // Write Symbol Tree (AST, SymbolTable) to file
        writeToFile("files\\output.json", toJSON(symbolTree));

        // Write Three Address Code to file
        ThreeAddressCode tac = new ThreeAddressCode();
        writeThreeAddressCodeToFile("files\\tac.txt", tac.writeThreeAddressCode(symbolTree.ast));
    }
}