package day24_ReturnMethod;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java java java java python python";
        String word = "java";
        frequencyOfWord(sentence,word);






    }
    /* create a method named frequencyOfWord that passes two parameters: string sentence and String word,
    then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3


    */

    public static int frequencyOfWord(String sentence,String word){
        int frequency=0;

        for (int i = 0; i <sentence.length()-word.length() ; i++) {
            String word1=sentence.substring(i,i+word.length());
            if(word1.equalsIgnoreCase(word)){
                frequency++;
            }



        }
        System.out.println(frequency);


        return  frequency;


    }










}
