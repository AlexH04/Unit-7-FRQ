import java.util.ArrayList;

public class UserName

{

// The list of possible user names, based on a user’s first and last names and initialized by the constructor.

    private ArrayList<String> possibleNames = new ArrayList<String>();



    /** Constructs a UserName object as described in part (a).

     * Precondition: firstName and lastName have length greater than 0

     * and contain only uppercase and lowercase letters.

     */

    public UserName(String firstName, String lastName)

    {
        String temp = null;
        for (int i = 0; i < firstName.length(); i++) {
            temp = lastName;
            temp += firstName.substring(0, i + 1);
            possibleNames.add(temp);
            System.out.println(temp);
        }

        String[]usedNames = {"smithjohn", "john", "smithj"};
        setAvailableUserNames(usedNames); //to call method
    }



    /** Returns true if arr contains name, and false otherwise. */

   public boolean isUsed(String name, String[] arr)

    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                return true;
            }
        }
        return false;
    }



    /** Removes strings from possibleNames that are found in usedNames as described in part (b).

     */

    public void setAvailableUserNames(String[] usedNames)

    {

        System.out.println("");

        String[]names = new String[possibleNames.size()];

        for (int i = 0; i < possibleNames.size(); i++) {
            names[i] = possibleNames.get(i);
        }

        int i = 0;
        while (i < possibleNames.size()){
            if (isUsed(usedNames[i], names)) {
                possibleNames.remove(i);
                i++;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        UserName user = new UserName("john", "smith");

        for (String i : user.possibleNames) {
            System.out.println(i);
        }
    }

}