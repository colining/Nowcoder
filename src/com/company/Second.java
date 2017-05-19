package com.company;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * Created by colin on 2017/5/18.
 */
class First {
    First( ) {
        System. out .println ( "10" );
    }
}
public class Second extends First {
    Second( ) {
        System. out .println( "20" );
    }
    public static void main(String[] args) {
        Second mine= new Second( );
    }
}

