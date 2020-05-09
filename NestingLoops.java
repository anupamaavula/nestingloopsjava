public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( char c='A'; c <= 'E'; c++ )
        {
            for ( int n=1; n <= 3; n++ )
            {
                System.out.println( c + " " + n );
                //1.Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)
                //Ans:Variable controlled by inner loop n go faster than outer loop c

            }
        }
        System.out.println("\n");

        //2.Change the order of the loops so that the "c" loop is on the inside and the "n" loop is on the outside. How does the output change?
//         1 A
//         1 B
//         1 C
//         1 D
//         1 E
//         2 A
//         2 B
//         2 C
//         2 D
//         2 E
//         3 A
//         3 B
//         3 C
//         3 D
//         3 E
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )
            {
                System.out.println( n + " " + c );
                

            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            // * You will add a line of code here.
            // 4.Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change?

            //System.out.println(a + "-" + b + " ");//getting an error "b coonot be resolved to a variable" because b is out of scope(outside of loop)
        }
        //3.Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? 
        //The output for 3rd question is below.
//         1-1
//         1-2
//         1-3
//         2-1
//         2-2
//         2-3
//         3-1
//         3-2
//         3-3

        System.out.println("\n");

    }
}