package dnaexercise;

public class DNAController {
    private String input;
    private String nukleotids[];

    public DNAController() {

    }

    public void setInput(String input) {
        InputValidator inputValidator = new InputValidator();
        if(!inputValidator.checkIfItsValidInput(input)){
            throw new RuntimeException("Bad input");
        }
        this.input = input;
        if(!inputValidator.checkIfItsRNA(input)){
            DNAtoRNA dnAtoRNA = new DNAtoRNA(input);
            this.input=dnAtoRNA.changeDNA();
        }

        this.nukleotids = this.input.split("(?<=\\G...)");
    }

    public void printRNA(){

        for (int i=0;i<nukleotids.length;i++){
            System.out.print(nukleotids[i]);
        }
    }

    public String RNAasNucleotids(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nukleotids.length; i++) {
            String tempCodon = Kodons.valueOf(nukleotids[i]).getName();
            tempCodon = tempCodon.substring(0,1).toUpperCase()+tempCodon.substring(1,3);
            sb.append(tempCodon+"-");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public String RNAasBigLettersNucleotids(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nukleotids.length; i++) {
            String tempCodon = Kodons.valueOf(nukleotids[i]).getName();
            sb.append(tempCodon.toUpperCase().charAt(0));
            if((i+1)%3==0){
                sb.append("-");
            }
        }
        return sb.toString();
    }






}
