public class Runner
{

    public static void main(String[] args)
    {
        String[] wordArray = {"big", "heavy", "cheese", "cake"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        System.out.println("Result of section a");
        for (int k = 0; k < 6; k++)
        {
            System.out.println(sChooser.getNext() + "");
        }

        System.out.println("\nResult of section b");
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for (int j = 0; j < wordArray.length; j++)
        {
            System.out.println(letterChooser.getNext());
        }
    }
}