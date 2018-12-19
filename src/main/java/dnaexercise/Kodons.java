package dnaexercise;

public enum Kodons {

    UUU("fenyloalanina"),UUC("fenyloalaina"),UUA("leucyna"),UUG("leucyna")
    ,CUU("leucyna"),CUC("leucyna"),CUA("leucyna")
    ,CUG("leucyna"),AUU("izoleucyna"),AUC("izoleucyna"),AUA("izoleucyna")
    ,AUG("metionina"),GUU("walina"),GUC("walina"),GUA("walina"),GUG("walina")
    ,UCU("seryna"),UCC("seryna"),UCA("seryna"),UCG("seryna")
    ,CCU("prolina"),CCC("prolina"),CCA("prolina"),CCG("prolina")
    ,ACU("treonina"),ACC("treonina"),ACA("treonina"),ACG("treonina")
    ,GCU("alanina"),GCC("alanina"),GCA("alanina"),GCG("alanina")
    ,UAU("tyrozyna"),UAC("tyrozyna"),UAA("ochre"),UAG("amber")
    ,CAU("histydyna"),CAC("histydyna"),CAA("glutamina"),CAG("glutamina")
    ,AAU("asparagina"),AAC("asparagina"),AAA("lizyna")
    ,AAG("lizyna"),GAU("asparaginian"),GAC("asparaginian")
    ,GAA("glutaminian"),GAG("glutaminian"),UGU("cysteina"),UGC("cysteina")
    ,UGA("opal"),UGG("tryptofan"),CGU("arginina"),CGC("arginina"),CGA("arginina"),CGG("arginina")
    ,AGU("seryna"),AGC("seryna"),AGA("arginina"),AGG("arginina")
    ,GGU("glicyna"),GGC("glicyna"),GGA("glicyna"),GGG("glicyna");

    private String name;

    Kodons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
