package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {

        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        String result = "";
        int counter = 0;

        while (counter < personArray.length) {
            result += personArray[counter];
            counter ++;
        }

        return result;
    }



    public String forLoop() {

        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        String result = "";

        for (int i = 0; i < personArray.length; i++) {
            result += personArray[i];

            System.out.println(result);
             }
        return result;
    }



    public String forEachLoop() {

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        String result = "";

    for (Person person :personArray) {
        result += person;

        System.out.println(result);
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
