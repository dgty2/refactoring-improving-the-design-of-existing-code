package chapter9.ver4;


public class test1 {

    void checkSecurity(String[] people) {
        String found = foundMissing(people);
        for (String person : people) {
            if (person.equals("Don")) {
                throw new SecurityException("Don not allowed!");
            }
        }
    }

    private String foundMissing(String[] people) {
        String found = "";
        for (String person : people) {  // for each person in people
            if (person.equals("Don")) { // if person is Don then
                //  found = person;         // found = person
                return person;
            }
            if (person.equals("John")) { // if found is John then
                //   found = person;          // found = person
                return person;
            }

        }
        return found;
    }

}