// 231RDB280 Dāvis Karpovskis
// 231RDB065 Aleksandrs Baranovskis
// 231RDB010 Toms Valdāts
// 231RDB009 Eduards Žuga
// 231RDB019 Gatis Petrovskis
// 231RDB301 Rihards Doniks

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            String input = sc.nextLine();

            switch (input) {
                case "comp":
                    comp(); 
                    break;
                case "decomp":
                    decomp(); 
                    break;
                case "size":
                    size();
                    break;
                case "equal":
                    equal(); 
                    break;
                case "about":
                    about(); 
                    break;
                case "exit":
                    exit(running); 
                    break;
                default:
                    break;
            }
        }
    }

    public static void decomp() {
        // TODO
    }
    
    public static void comp() {
        // TODO
    }

    public static void size() {
        // TODO
    }

    public static void about() {
        // TODO
    }

    public static void equal() {
        // TODO
    }

    public static void exit(boolean running) {
        running = false; 
    }

    public class Deflate {
        public static byte[] inflate(byte[] deflatedData) {
            // TODO
        }

        public static byte[] deflate(byte[] data) {
            // TODO
        }

        private static byte[] read(String fileName) {
            // TODO
        }

        private static void write(String fileName, byte[] data) {
            // TODO
        }

        public class HuffmanTable {
            public int[] codeArray;
            public int[] codeLengthArray;

            public HuffmanTable(int symbolCount) {
                // TODO
            }

            public ArrayList<Integer> packCodeLengths(int[] literalCodeLengthArray, int[] distanceCodeLengthArray) {
                // TODO
            }

            public void pack(ArrayList<Integer> lengthList, int[] codeLengthArray) {
                // TODO
            }
        }

        public class HuffmanTree {
            private Node root;
            private int numSym;
            private int maxDepth;
            private Map<Integer, ArrayList<Node>> depthMap;

            public HuffmanTree(int[] freq, int limit) {
                // TODO
            }

            private void traverse(Node rootNode) {
                // TODO
            }

            public HuffmanTable getTable() {
                // TODO
            }

            public class Node {
                public Node parent;
                public Node left;
                public Node right;
                public int weight;
                public int value;

                public Node(Node parent, Node left, Node right, int weight, int value) {
                    // TODO
                }

                public int compare(Node node) {
                    // TODO
                }
            }
        }

        public class LzValuePair {
            public int distance;
            public int distanceSymbol;
            public int distanceBits;
            public int distanceBitCount;
            public int length;
            public int lengthSymbol;
            public int lengthBits;
            public int lengthBitCount;

            public LzValuePair(int distance, int length) {
                // TODO
            }
        }

        public class LzSlidingWindow {
            private int mask;
            private int size;
            private int pos;

            public LzSlidingWindow(int size) {
                // TODO
            }
        }
    }
}