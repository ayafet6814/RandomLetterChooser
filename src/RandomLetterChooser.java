import java.util.ArrayList;

public class RandomLetterChooser extends RandomStringChooser
{
    public RandomLetterChooser(String str)
    {
        super (getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str)
    {
        String[] newArray = new String[str.length()];
        for (int j = 0; j < str.length(); j++)
        {
            newArray[j] = str.substring(j, j+1);
        }
        return newArray;
    }
}