package dnaexercise;

public class Main {
    public static void main(String[] args) {

        String input = "GACACCATCGAATGGCGCAAAACCTTTCGCGGTATGGCATGATAGCGCCCGGAAGAGAGTCAATTCAGG";
        DNAController dnaController = new DNAController();
        dnaController.setInput(input);
        dnaController.printRNA();
        System.out.println();
        System.out.println(dnaController.RNAasNucleotids());
        System.out.println(dnaController.RNAasBigLettersNucleotids());
    }
}
