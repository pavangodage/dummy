import java.lang.String;

class SY2023bit505{

    public static int getValidRegistrationsCount(String[] registrations) {
        int count = 0;
        for (int i = 0; i < registrations.length; i++) {
            String reg = registrations[i];
            if (isValidRegistration(reg)) {
                count++;                      //increment count if reg. no is valid.
            }
        }
        return count;                     //Return count of valid reg. no.
    }


    //Method to check if the reg. no. is valid or not.
    public static boolean isValidRegistration(String reg) 
    {
        //Checking the length of registration number.
        if (reg.length() != 10) 
        { 
            return false;
        }
        
        //Define the substrings of Registration number to check it is valid or not.
        String YYYY = reg.substring(0, 4);    //Extracts the first 4 characters (from index 0 to index 3) of the registration number.
        String DDD = reg.substring(4, 7);    //Extracts characters from index 4 up to (but not including) index 7 of the registration number.
        String SSS = reg.substring(7, 10);  //Extracts characters from index 7 up to (but not including) index 10 of the registration number

        // Check for the year of enrollment (first four characters).
        for (int i = 0; i < 4; i++) {
            char c = YYYY.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        //Convert YYYY(year) to an integer for comparison
        int year = Integer.parseInt(YYYY);
        if (year < 2000 || year > 2025)     //Check if the year is within the valid range
        {
            return false;
        }

        // Check for department ID (next three characters).
        if (!(DDD.equals("BIT") || DDD.equals("BCS") || DDD.equals("BME") || DDD.equals("BCH"))) {
            return false;
        }

        // Check for the sequence number (next three characters).
        for (int i = 0; i < 3; i++) {
            char c = SSS.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    //Main method.
    public static void main(String[] args) {
        String[] registrations = { "2023BIT506","2023BCS123","2021BCH045","2005BME456"};
        int count = getValidRegistrationsCount(registrations);
        System.out.println(count);
    }
}
