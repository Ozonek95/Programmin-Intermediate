package dnaexercise;

public class DNAtoRNA {
    String dna;

    public DNAtoRNA(String dna) {
        this.dna = dna;
    }


    public String changeDNA(){

        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='T'){
                chars[i]='A';
            }
            else if(chars[i]=='A'){
                chars[i]='U';

            }
            else if(chars[i]=='C'){
                chars[i]='G';

            }
            else if(chars[i]=='G'){
                chars[i]='C';
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();



    }
}
