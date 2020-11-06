package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        Library library = new Library("Biblio1");

        Book book1 = new Book("Jordan" , "Bagic", "2000-10-10");
        Book book2 = new Book("Brayant" , "Bagic2", "2002-03-11");
        Book book3 = new Book("Ronaldo" , "Bagic3", "2003-01-11");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblio2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblio3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }


        //When
        library.getBooks().remove(book1);


        System.out.println(library);
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());

        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
