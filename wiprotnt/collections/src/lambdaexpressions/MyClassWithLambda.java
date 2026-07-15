package lambdaexpressions;

public class MyClassWithLambda {
	public static void main(String[] args) 
	{
        WordCount wc = (str) -> {
            if (str.trim().isEmpty())
                return 0;
            return str.trim().split("\\s+").length;
        };
        String sentence = "This is the Java Lambda Expressions Module";
        System.out.println("Sentence : " + sentence);
        System.out.println("Word Count : " + wc.count(sentence));
    }

}
