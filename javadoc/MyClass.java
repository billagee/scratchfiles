// MyClass.java

/**
 * This enum is used to store important values used by MyClass.
 */
enum MyClassThings
{
    FIRST_THING, SECOND_THING, THIRD_THING
}

/**
 * Implementation of MyClass, a trivial demonstration class.
 * <p>
 * Details: Foo! <br />
 * More details: Bar! <br />
 * Final details: Baz!
 *
 * @author Bill Agee
 */
public class MyClass
{
    private int myInt;
    private String myString;
    private MyClassThings myClassThing;

    /**
     * MyClass constructor that initializes each private instance variable
     * with user-provided data.
     *
     * @param  anInt    Initial value for myInt.
     * @param  aString  Initial value for myString.
     * @param  aThing   Initial MyClassThings enum value for myClassThing.
     */
    public MyClass(int anInt, String aString, MyClassThings aThing)
    {
        this.myInt = anInt;
        this.myString = aString;
        this.myClassThing = aThing;
    }

    /**
     * Takes an int and a String, and determines if all is in its right place.
     *
     * @param  param1  A number that represents...something.
     * @param  param2  A String representing something else.
     * @return         True or false, because that's the way it is.
     */
    public boolean doSomething(int param1, String param2)
    {
      // ... arbitrary logic goes here
      return true;
    }

    /**
     * Overridden toString() for MyClass.
     *
     * @return  A String describing this class instance's private data.
     */
    public String toString()
    {
        return "My int: '" + this.myInt + "', my String: '" + this.myString +
            "', my class thing: " + this.myClassThing;
    }

    public static void main(String[] args)
    {
        MyClass myclass = new MyClass(10, "hours", MyClassThings.FIRST_THING);
        System.out.println("Doing something returns: " +
                myclass.doSomething(2, "hi"));
        System.out.println("String representation: " + myclass.toString());
    }
}

