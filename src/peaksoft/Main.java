package peaksoft;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
      try ( FileWriter alphabet = new FileWriter("Symbol.txt ")) {
       alphabet.write("A a\n");
       alphabet.write("B b\n");
       alphabet.write("C c\n");
       alphabet.write("D d\n");
       alphabet.write("E e\n");
       alphabet.write("F f\n");
       alphabet.write("G g\n");
       alphabet.write("H h\n");
       alphabet.write("I i\n");
       alphabet.write("J j\n");
       alphabet.write("K k\n");
       alphabet.write("L l\n");
       alphabet.write("M m\n");
       alphabet.write("N n\n");
       alphabet.write("O o\n");
       alphabet.write("P p\n");
       alphabet.write("Q q\n");
       alphabet.write("R r\n");
       alphabet.write("S s\n");
       alphabet.write("T t\n");
       alphabet.write("U u\n");
       alphabet.write("V v\n");
       alphabet.write("W w\n");
       alphabet.write("X x\n");
       alphabet.write("Y y\n");
       alphabet.write("Z z\n");
       alphabet.write("0\n");
       alphabet.write("1\n");
       alphabet.write("2\n");
       alphabet.write("3\n");
       alphabet.write("4\n");
       alphabet.write("5\n");
       alphabet.write("6\n");
       alphabet.write("7\n");
       alphabet.write("8\n");
       alphabet.write("9\n");
      }catch (IOException e){
       System.out.println(e.getMessage());
      }
      try (FileReader reader = new FileReader("Symbol.txt")) {
       Scanner scanner = new Scanner(reader);
       int i = 0;
       while (scanner.hasNextLine()){
           i++;
        System.out.println(i+": "+scanner.nextLine());
       }

      } catch (IOException e) {
       System.out.println(e.getMessage());
      }
    }

    }

