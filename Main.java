// 231RDB280 Dāvis Karpovskis
// 231RDB065 Aleksandrs Baranovskis
// 231RDB010 Toms Valdāts
// 231RDB009 Eduards Žuga
// 231RDB019 Gatis Petrovskis
// 231RDB301 Rihards Doniks

import java.util.ArrayList;
import java.util.List;
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
                codeLengthArray = new int[symbolCount];
                codeArray = new int[symbolCount];
            }

            public void pack(ArrayList<Integer> lengthList, int[] codeLengthArray, int[] conditions, int[] addLengthConditions) {
                int firstLengthValue = codeLengthArray[0];
                int sequenceCount = 1;
                int k = codeLengthArray.length;
                for (int i = 1; i <= k; i++) {
                    if (codeLengthArray[i] == firstLengthValue && i < k) {
                        sequenceCount++;
                    } else {
                        lengthList.add(firstLengthValue);
                        sequenceCount--;
                        if (firstLengthValue != 0) {
                            for (int j = 6; j >= 3;) {
                                if (!((sequenceCount - j) < 0)) {
                                    addToLengthList(lengthList, 16, j - 3);
                                    sequenceCount -= j;
                                } else {
                                    j--;
                                }
                            }
                        } else {
                            for (int l = 0, j = 138; l < conditions.length; l++) {
                                for (; j >= conditions[i];) {
                                    if (!((sequenceCount - j) < 0)) {
                                        addToLengthList(lengthList, addLengthConditions[i], j - conditions[i]);
                                        sequenceCount -= j;
                                    } else {
                                        j--;
                                    }
                                }
                            }
                        }
                        for (; sequenceCount > 0; sequenceCount--) {
                            lengthList.add(firstLengthValue);
                        }
                        if (i < k) {
                            sequenceCount = 1;                         
                            firstLengthValue = codeLengthArray[i];
                        }
                    }
                }
            }

            public void addToLengthList(ArrayList<Integer> lengthList, int i, int j) {
                lengthList.add(i);
                lengthList.add(j);
            }

            public ArrayList<Integer> packCodeLengths(int[] literalCodeLengthArray, int[] distanceCodeLengthArray) {
                ArrayList<Integer> lengthList = new ArrayList<Integer>();
                int[] conditions = {11, 3};
                int[] addLengthConditions = {18, 17};
                pack(lengthList, literalCodeLengthArray, conditions, addLengthConditions);
		        pack(lengthList, distanceCodeLengthArray, conditions, addLengthConditions);
		        return lengthList;
            }

            public static final HuffmanTable LiteralCodesTable = createLiteralCodesTable();
            public static final HuffmanTable DistanceCodesTable = createDistanceCodesTable();

            public static void setCode(HuffmanTable table, int index, int code, int codeLength) {
                table.codeArray[index] = code;
                table.codeLengthArray[index] = codeLength;
            }

            private static HuffmanTable createLiteralCodesTable() {
                Main mainInstance = new Main();
                Main.Deflate deflateInstance = mainInstance.new Deflate();
                Main.Deflate.HuffmanTable table = deflateInstance.new HuffmanTable(30);
                int next = 0;
                for (int i = 256; i <= 279; i++) {
                    setCode(table, i, next++, 7);
                }
                next <<= 1;
                for (int i = 0; i <= 143; i++) {
                    setCode(table, i, next++, 8);
                }
                for (int i = 280; i <= 285; i++) {
                    setCode(table, i, next++, 8);
                }
                next += 2;
                next <<= 1;
                for (int i = 144; i <= 255; i++) {
                    setCode(table, i, next++, 9);
                }
                return table;
            }

            private static HuffmanTable createDistanceCodesTable() {
                Main mainInstance = new Main();
                Main.Deflate deflateInstance = mainInstance.new Deflate();
                Main.Deflate.HuffmanTable table = deflateInstance.new HuffmanTable(30);
                for (int i = 0; i <= 29; i++) {
                    setCode(table, i, i, 5);
                }
                return table;
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
                    return weight - node.weight;
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